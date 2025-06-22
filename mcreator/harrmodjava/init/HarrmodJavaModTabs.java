
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.harrmodjava.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.harrmodjava.HarrmodJavaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HarrmodJavaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HarrmodJavaMod.MODID);
	public static final RegistryObject<CreativeModeTab> HARRMOD = REGISTRY.register("harrmod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.harrmod_java.harrmod")).icon(() -> new ItemStack(HarrmodJavaModBlocks.HARRONITBLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HarrmodJavaModBlocks.HARREK.get().asItem());
				tabData.accept(HarrmodJavaModBlocks.HARREKLEAVES.get().asItem());
				tabData.accept(HarrmodJavaModBlocks.HARRONIT.get().asItem());
				tabData.accept(HarrmodJavaModItems.HARRONITGEM.get());
				tabData.accept(HarrmodJavaModItems.HARRONITARMOR_HELMET.get());
				tabData.accept(HarrmodJavaModItems.HARRONITARMOR_CHESTPLATE.get());
				tabData.accept(HarrmodJavaModItems.HARRONITARMOR_LEGGINGS.get());
				tabData.accept(HarrmodJavaModItems.HARRONITARMOR_BOOTS.get());
				tabData.accept(HarrmodJavaModItems.HARRONITSWORD.get());
				tabData.accept(HarrmodJavaModBlocks.HARREKPLANKS.get().asItem());
				tabData.accept(HarrmodJavaModBlocks.HARRSIDIAN.get().asItem());
				tabData.accept(HarrmodJavaModItems.HARRMENSION.get());
				tabData.accept(HarrmodJavaModBlocks.HARRONITBLOCK.get().asItem());
				tabData.accept(HarrmodJavaModBlocks.HARREKPLANKSSTAIRS.get().asItem());
				tabData.accept(HarrmodJavaModBlocks.HARREKSLAB.get().asItem());
				tabData.accept(HarrmodJavaModItems.HARRVILLAGER_SPAWN_EGG.get());
				tabData.accept(HarrmodJavaModItems.PORSE_SPAWN_EGG.get());
				tabData.accept(HarrmodJavaModItems.CARRUT.get());
				tabData.accept(HarrmodJavaModBlocks.CARRUTVINE.get().asItem());
				tabData.accept(HarrmodJavaModItems.PORSE_MEAT.get());
				tabData.accept(HarrmodJavaModItems.COOKED_PORSE_MEAT.get());
				tabData.accept(HarrmodJavaModBlocks.HARRE_FENCE.get().asItem());
				tabData.accept(HarrmodJavaModBlocks.HARRE_FENCE_GATE.get().asItem());
				tabData.accept(HarrmodJavaModBlocks.HARRE_PRESSURE_PLATE.get().asItem());
				tabData.accept(HarrmodJavaModBlocks.HARRE_BUTTON.get().asItem());
				tabData.accept(HarrmodJavaModItems.HOT_SLIME_BUCKET.get());
				tabData.accept(HarrmodJavaModItems.HARRGOLEM_SPAWN_EGG.get());
				tabData.accept(HarrmodJavaModItems.RAYGUN.get());
				tabData.accept(HarrmodJavaModBlocks.DEACTIVATEDGOLEM.get().asItem());
				tabData.accept(HarrmodJavaModItems.MUSIC_DISC_HARRY.get());
				tabData.accept(HarrmodJavaModItems.BULLET.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(HarrmodJavaModItems.HARRONITARMOR_HELMET.get());
			tabData.accept(HarrmodJavaModItems.HARRONITARMOR_CHESTPLATE.get());
			tabData.accept(HarrmodJavaModItems.HARRONITARMOR_LEGGINGS.get());
			tabData.accept(HarrmodJavaModItems.HARRONITARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(HarrmodJavaModItems.HARRONITSWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(HarrmodJavaModItems.HARRVILLAGER_SPAWN_EGG.get());
			tabData.accept(HarrmodJavaModItems.PORSE_SPAWN_EGG.get());
		}
	}
}
