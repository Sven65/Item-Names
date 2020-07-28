package xyz.mackan.ItemNames;

import net.minecraft.server.v1_16_R1.LocaleLanguage;
import org.bukkit.craftbukkit.v1_16_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

public class ItemNames_v1_15_R1 implements ItemNames {
	/**
	 * Gets the name of the ItemStack from server locale
	 * @param itemStack ItemStack to get the item name from
	 * @return String with the item name
	 */
	static String getItemName (ItemStack itemStack) {
		net.minecraft.server.v1_16_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);

		return LocaleLanguage.a().a(nmsStack.getItem().getName());
	}
}
