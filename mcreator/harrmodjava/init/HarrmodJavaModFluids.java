
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.harrmodjava.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.harrmodjava.fluid.HotSlimeFluid;
import net.mcreator.harrmodjava.HarrmodJavaMod;

public class HarrmodJavaModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, HarrmodJavaMod.MODID);
	public static final RegistryObject<FlowingFluid> HOT_SLIME = REGISTRY.register("hot_slime", () -> new HotSlimeFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_HOT_SLIME = REGISTRY.register("flowing_hot_slime", () -> new HotSlimeFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(HOT_SLIME.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_HOT_SLIME.get(), RenderType.translucent());
		}
	}
}
