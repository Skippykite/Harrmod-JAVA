
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.harrmodjava.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.harrmodjava.client.model.Modelporsemodel;
import net.mcreator.harrmodjava.client.model.Modeliron_golem;
import net.mcreator.harrmodjava.client.model.ModelRay;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class HarrmodJavaModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelRay.LAYER_LOCATION, ModelRay::createBodyLayer);
		event.registerLayerDefinition(Modelporsemodel.LAYER_LOCATION, Modelporsemodel::createBodyLayer);
		event.registerLayerDefinition(Modeliron_golem.LAYER_LOCATION, Modeliron_golem::createBodyLayer);
	}
}
