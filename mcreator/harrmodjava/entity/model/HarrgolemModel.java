package net.mcreator.harrmodjava.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.harrmodjava.entity.HarrgolemEntity;

public class HarrgolemModel extends GeoModel<HarrgolemEntity> {
	@Override
	public ResourceLocation getAnimationResource(HarrgolemEntity entity) {
		return new ResourceLocation("harrmod_java", "animations/modelo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HarrgolemEntity entity) {
		return new ResourceLocation("harrmod_java", "geo/modelo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HarrgolemEntity entity) {
		return new ResourceLocation("harrmod_java", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(HarrgolemEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
