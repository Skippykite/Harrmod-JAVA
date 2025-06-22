
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.harrmodjava.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.harrmodjava.HarrmodJavaMod;

public class HarrmodJavaModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, HarrmodJavaMod.MODID);
	public static final RegistryObject<SoundEvent> MEEPIDLE = REGISTRY.register("meepidle", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("harrmod_java", "meepidle")));
	public static final RegistryObject<SoundEvent> MEEPOOF = REGISTRY.register("meepoof", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("harrmod_java", "meepoof")));
	public static final RegistryObject<SoundEvent> MEEPKILL = REGISTRY.register("meepkill", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("harrmod_java", "meepkill")));
	public static final RegistryObject<SoundEvent> MEEPHAPPY = REGISTRY.register("meephappy", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("harrmod_java", "meephappy")));
	public static final RegistryObject<SoundEvent> PEW = REGISTRY.register("pew", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("harrmod_java", "pew")));
	public static final RegistryObject<SoundEvent> DRAGON = REGISTRY.register("dragon", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("harrmod_java", "dragon")));
	public static final RegistryObject<SoundEvent> CRAB_RAVE = REGISTRY.register("crab_rave", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("harrmod_java", "crab_rave")));
}
