
package net.mcreator.harrmodjava.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.harrmodjava.entity.PorseEntity;
import net.mcreator.harrmodjava.client.model.animations.pigAnimation;
import net.mcreator.harrmodjava.client.model.Modelporsemodel;

public class PorseRenderer extends MobRenderer<PorseEntity, Modelporsemodel<PorseEntity>> {
	public PorseRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelporsemodel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PorseEntity entity) {
		return new ResourceLocation("harrmod_java:textures/entities/pig.png");
	}

	private static final class AnimatedModel extends Modelporsemodel<PorseEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<PorseEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(PorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(pigAnimation.Walk, limbSwing, limbSwingAmount, 1.6f, 1f);
				this.animate(entity.animationState1, pigAnimation.Jump, ageInTicks, 1.6f);
				this.animate(entity.animationState2, pigAnimation.Walk, ageInTicks, 3.6f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(PorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
