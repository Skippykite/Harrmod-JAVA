
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.harrmodjava.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.harrmodjava.client.renderer.PorseRenderer;
import net.mcreator.harrmodjava.client.renderer.HarrvillagerRenderer;
import net.mcreator.harrmodjava.client.renderer.HarrgolemshootRenderer;
import net.mcreator.harrmodjava.client.renderer.HarrgolemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HarrmodJavaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HarrmodJavaModEntities.HARRVILLAGER.get(), HarrvillagerRenderer::new);
		event.registerEntityRenderer(HarrmodJavaModEntities.PORSE.get(), PorseRenderer::new);
		event.registerEntityRenderer(HarrmodJavaModEntities.HARRGOLEM.get(), HarrgolemRenderer::new);
		event.registerEntityRenderer(HarrmodJavaModEntities.HARRGOLEMSHOOT.get(), HarrgolemshootRenderer::new);
	}
}
