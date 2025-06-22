
package net.mcreator.harrmodjava.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.harrmodjava.entity.HarrvillagerEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class HarrvillagerRenderer extends MobRenderer<HarrvillagerEntity, VillagerModel<HarrvillagerEntity>> {
	public HarrvillagerRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel<HarrvillagerEntity>(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
		this.addLayer(new RenderLayer<HarrvillagerEntity, VillagerModel<HarrvillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("harrmod_java:textures/entities/plains.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, HarrvillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	protected void scale(HarrvillagerEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.9375f, 0.9375f, 0.9375f);
	}

	@Override
	public ResourceLocation getTextureLocation(HarrvillagerEntity entity) {
		return new ResourceLocation("harrmod_java:textures/entities/villager.png");
	}
}
