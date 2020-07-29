package xyz.mackan.ItemNames;

import org.bukkit.inventory.ItemStack;

/**
 * Utility library for getting NMS names from ItemStacks
 */
public class ItemNames {

	/**
	 * The {@link IItemNames} object for the servers version
	 */
	private static final IItemNames apiImplementation = new VersionUtil().getImplementation();

	/**
	 * Gets the name of the ItemStack from server locale
	 * @param itemStack ItemStack to get the item name from
	 * @return String with the item name
	 */
	public static String getItemName (ItemStack itemStack) {
		return apiImplementation.getItemName(itemStack);
	}
}
