package xyz.mackan.ItemNames;

import org.bukkit.inventory.ItemStack;

public interface IItemNames {
	/**
	 * Gets the name of the ItemStack from server locale
	 * @param itemStack ItemStack to get the item name from
	 * @return String with the item name
	 */
	String getItemName (ItemStack itemStack);
}
