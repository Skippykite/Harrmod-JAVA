
package net.mcreator.harrmodjava.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HarronitgemItem extends Item {
	public HarronitgemItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}
}
