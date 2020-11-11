package xyz.mackan.ItemNames;

import net.minecraft.server.v1_16_R3.LocaleLanguage;
import org.bukkit.craftbukkit.v1_16_R3.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

public class ItemNames_v1_16_R3 implements IItemNames {
	/**
	 * Gets the name of the ItemStack from server locale
	 * @param itemStack ItemStack to get the item name from
	 * @return String with the item name
	 */
	public String getItemName (ItemStack itemStack) {
		net.minecraft.server.v1_16_R3.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);

		return LocaleLanguage.a().a(nmsStack.getItem().getName());
	}
}
