package net.mcreator.harrmodjava.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.harrmodjava.world.inventory.CreditsBackgroundMenu;
import net.mcreator.harrmodjava.network.CreditsBackgroundButtonMessage;
import net.mcreator.harrmodjava.HarrmodJavaMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CreditsBackgroundScreen extends AbstractContainerScreen<CreditsBackgroundMenu> {
	private final static HashMap<String, Object> guistate = CreditsBackgroundMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_next;

	public CreditsBackgroundScreen(CreditsBackgroundMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 177;
		this.imageHeight = 167;
	}

	private static final ResourceLocation texture = new ResourceLocation("harrmod_java:textures/screens/credits_background.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("harrmod_java:textures/screens/banana.png"), this.leftPos + -126, this.topPos + -38, 0, 0, 430, 242, 430, 242);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		button_next = Button.builder(Component.translatable("gui.harrmod_java.credits_background.button_next"), e -> {
			if (true) {
				HarrmodJavaMod.PACKET_HANDLER.sendToServer(new CreditsBackgroundButtonMessage(0, x, y, z));
				CreditsBackgroundButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 67, this.topPos + 141, 46, 20).build();
		guistate.put("button:button_next", button_next);
		this.addRenderableWidget(button_next);
	}
}
