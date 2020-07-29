// Referenced from https://github.com/WesJD/AnvilGUI/blob/master/api/src/main/java/net/wesjd/anvilgui/version/VersionMatcher.java
package xyz.mackan.ItemNames;

import org.bukkit.Bukkit;

import java.util.Arrays;
import java.util.List;

/**
 * Util class for resolving implementation version
 */
public class VersionUtil {
	/**
	 * Server version
	 */
	private final String serverVersion = Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3].substring(1);

	/**
	 * All available {@link IItemNames} implementations
	 */
	private final List<Class<? extends IItemNames>> implentations = Arrays.asList(
			ItemNames_v1_8_R1.class,
			ItemNames_v1_8_R2.class,
			ItemNames_v1_8_R3.class,

			ItemNames_v1_9_R1.class,
			ItemNames_v1_9_R2.class,

			ItemNames_v1_10_R1.class,
			ItemNames_v1_11_R1.class,
			ItemNames_v1_12_R1.class,
			ItemNames_v1_13_R1.class,
			ItemNames_v1_13_R2.class,
			ItemNames_v1_14_R1.class,
			ItemNames_v1_15_R1.class,
			ItemNames_v1_16_R1.class
	);

	/**
	 * Gets the appropriate {@link IItemNames} implementation for the server version
	 * @return The {@link IItemNames} for the server
	 * @throws RuntimeException If there's no valid implementation found
	 */
	public IItemNames getImplementation () {
		try {
			return implentations.stream()
					.filter(impl -> impl.getSimpleName().replace("ItemNames_v", "").equals(serverVersion))
					.findFirst()
					.orElseThrow(() -> new RuntimeException("ItemNames couldn't find a valid implementation for the server version!"))
					.newInstance();
		} catch (IllegalAccessException | InstantiationException e) {
			throw new RuntimeException(e);
		}
	}
}
