
package net.mcreator.harrmodjava.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.harrmodjava.init.HarrmodJavaModFluids;

public class HotSlimeBlock extends LiquidBlock {
	public HotSlimeBlock() {
		super(() -> HarrmodJavaModFluids.HOT_SLIME.get(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(100f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 5).noCollission()
				.noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
