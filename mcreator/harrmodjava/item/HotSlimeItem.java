
package net.mcreator.harrmodjava.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.harrmodjava.init.HarrmodJavaModFluids;

public class HotSlimeItem extends BucketItem {
	public HotSlimeItem() {
		super(HarrmodJavaModFluids.HOT_SLIME, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
