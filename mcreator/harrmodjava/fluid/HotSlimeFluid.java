
package net.mcreator.harrmodjava.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.harrmodjava.init.HarrmodJavaModItems;
import net.mcreator.harrmodjava.init.HarrmodJavaModFluids;
import net.mcreator.harrmodjava.init.HarrmodJavaModFluidTypes;
import net.mcreator.harrmodjava.init.HarrmodJavaModBlocks;

public abstract class HotSlimeFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> HarrmodJavaModFluidTypes.HOT_SLIME_TYPE.get(), () -> HarrmodJavaModFluids.HOT_SLIME.get(), () -> HarrmodJavaModFluids.FLOWING_HOT_SLIME.get())
			.explosionResistance(100f).levelDecreasePerBlock(2).bucket(() -> HarrmodJavaModItems.HOT_SLIME_BUCKET.get()).block(() -> (LiquidBlock) HarrmodJavaModBlocks.HOT_SLIME.get());

	private HotSlimeFluid() {
		super(PROPERTIES);
	}

	public static class Source extends HotSlimeFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends HotSlimeFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
