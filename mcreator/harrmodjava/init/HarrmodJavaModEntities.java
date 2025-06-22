
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.harrmodjava.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.harrmodjava.entity.PorseEntity;
import net.mcreator.harrmodjava.entity.HarrvillagerEntity;
import net.mcreator.harrmodjava.entity.HarrgolemshootEntity;
import net.mcreator.harrmodjava.entity.HarrgolemEntity;
import net.mcreator.harrmodjava.HarrmodJavaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HarrmodJavaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HarrmodJavaMod.MODID);
	public static final RegistryObject<EntityType<HarrvillagerEntity>> HARRVILLAGER = register("harrvillager",
			EntityType.Builder.<HarrvillagerEntity>of(HarrvillagerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HarrvillagerEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<PorseEntity>> PORSE = register("porse",
			EntityType.Builder.<PorseEntity>of(PorseEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PorseEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HarrgolemEntity>> HARRGOLEM = register("harrgolem",
			EntityType.Builder.<HarrgolemEntity>of(HarrgolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HarrgolemEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HarrgolemshootEntity>> HARRGOLEMSHOOT = register("harrgolemshoot",
			EntityType.Builder.<HarrgolemshootEntity>of(HarrgolemshootEntity::new, MobCategory.MISC).setCustomClientFactory(HarrgolemshootEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			HarrvillagerEntity.init();
			PorseEntity.init();
			HarrgolemEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(HARRVILLAGER.get(), HarrvillagerEntity.createAttributes().build());
		event.put(PORSE.get(), PorseEntity.createAttributes().build());
		event.put(HARRGOLEM.get(), HarrgolemEntity.createAttributes().build());
	}
}
