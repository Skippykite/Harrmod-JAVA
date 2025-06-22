
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.harrmodjava.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.harrmodjava.world.inventory.CreditsBackgroundMenu;
import net.mcreator.harrmodjava.HarrmodJavaMod;

public class HarrmodJavaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HarrmodJavaMod.MODID);
	public static final RegistryObject<MenuType<CreditsBackgroundMenu>> CREDITS_BACKGROUND = REGISTRY.register("credits_background", () -> IForgeMenuType.create(CreditsBackgroundMenu::new));
}
