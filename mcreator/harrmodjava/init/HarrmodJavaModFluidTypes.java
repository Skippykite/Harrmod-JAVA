
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.harrmodjava.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.harrmodjava.fluid.types.HotSlimeFluidType;
import net.mcreator.harrmodjava.HarrmodJavaMod;

public class HarrmodJavaModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, HarrmodJavaMod.MODID);
	public static final RegistryObject<FluidType> HOT_SLIME_TYPE = REGISTRY.register("hot_slime", () -> new HotSlimeFluidType());
}
