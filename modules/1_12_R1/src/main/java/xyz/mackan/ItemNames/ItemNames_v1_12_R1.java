package xyz.mackan.ItemNames;

import org.bukkit.craftbukkit.v1_12_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

public class ItemNames_v1_12_R1 implements IItemNames {
	/**
	 * Gets the name of the ItemStack from server locale
	 * @param itemStack ItemStack to get the item name from
	 * @return String with the item name
	 */
	public String getItemName (ItemStack itemStack) {
		net.minecraft.server.v1_12_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);

		return nmsStack.getName();
	}
}
