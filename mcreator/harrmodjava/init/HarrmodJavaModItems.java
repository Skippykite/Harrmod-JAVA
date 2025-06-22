
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.harrmodjava.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.harrmodjava.item.RaygunItem;
import net.mcreator.harrmodjava.item.PorseMeatItem;
import net.mcreator.harrmodjava.item.MusicDiscHarryItem;
import net.mcreator.harrmodjava.item.HotSlimeItem;
import net.mcreator.harrmodjava.item.HarronitswordItem;
import net.mcreator.harrmodjava.item.HarronitgemItem;
import net.mcreator.harrmodjava.item.HarronitarmorItem;
import net.mcreator.harrmodjava.item.HarrmensionItem;
import net.mcreator.harrmodjava.item.CookedPorseMeatItem;
import net.mcreator.harrmodjava.item.CarrutItem;
import net.mcreator.harrmodjava.item.BulletItem;
import net.mcreator.harrmodjava.HarrmodJavaMod;

public class HarrmodJavaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HarrmodJavaMod.MODID);
	public static final RegistryObject<Item> HARREK = block(HarrmodJavaModBlocks.HARREK);
	public static final RegistryObject<Item> HARREKLEAVES = block(HarrmodJavaModBlocks.HARREKLEAVES);
	public static final RegistryObject<Item> HARRONIT = block(HarrmodJavaModBlocks.HARRONIT);
	public static final RegistryObject<Item> HARRONITGEM = REGISTRY.register("harronitgem", () -> new HarronitgemItem());
	public static final RegistryObject<Item> HARRONITARMOR_HELMET = REGISTRY.register("harronitarmor_helmet", () -> new HarronitarmorItem.Helmet());
	public static final RegistryObject<Item> HARRONITARMOR_CHESTPLATE = REGISTRY.register("harronitarmor_chestplate", () -> new HarronitarmorItem.Chestplate());
	public static final RegistryObject<Item> HARRONITARMOR_LEGGINGS = REGISTRY.register("harronitarmor_leggings", () -> new HarronitarmorItem.Leggings());
	public static final RegistryObject<Item> HARRONITARMOR_BOOTS = REGISTRY.register("harronitarmor_boots", () -> new HarronitarmorItem.Boots());
	public static final RegistryObject<Item> HARRONITSWORD = REGISTRY.register("harronitsword", () -> new HarronitswordItem());
	public static final RegistryObject<Item> HARREKPLANKS = block(HarrmodJavaModBlocks.HARREKPLANKS);
	public static final RegistryObject<Item> HARRSIDIAN = block(HarrmodJavaModBlocks.HARRSIDIAN);
	public static final RegistryObject<Item> HARRSIDIANIGNITED = block(HarrmodJavaModBlocks.HARRSIDIANIGNITED);
	public static final RegistryObject<Item> HARRMENSION = REGISTRY.register("harrmension", () -> new HarrmensionItem());
	public static final RegistryObject<Item> HARRONITBLOCK = block(HarrmodJavaModBlocks.HARRONITBLOCK);
	public static final RegistryObject<Item> HARREKPLANKSSTAIRS = block(HarrmodJavaModBlocks.HARREKPLANKSSTAIRS);
	public static final RegistryObject<Item> HARREKSLAB = block(HarrmodJavaModBlocks.HARREKSLAB);
	public static final RegistryObject<Item> HARRVILLAGER_SPAWN_EGG = REGISTRY.register("harrvillager_spawn_egg", () -> new ForgeSpawnEggItem(HarrmodJavaModEntities.HARRVILLAGER, -9649098, -12220042, new Item.Properties()));
	public static final RegistryObject<Item> PORSE_SPAWN_EGG = REGISTRY.register("porse_spawn_egg", () -> new ForgeSpawnEggItem(HarrmodJavaModEntities.PORSE, -16752896, -9649098, new Item.Properties()));
	public static final RegistryObject<Item> CARRUT = REGISTRY.register("carrut", () -> new CarrutItem());
	public static final RegistryObject<Item> CARRUTVINE = block(HarrmodJavaModBlocks.CARRUTVINE);
	public static final RegistryObject<Item> PORSE_MEAT = REGISTRY.register("porse_meat", () -> new PorseMeatItem());
	public static final RegistryObject<Item> COOKED_PORSE_MEAT = REGISTRY.register("cooked_porse_meat", () -> new CookedPorseMeatItem());
	public static final RegistryObject<Item> HARRE_FENCE = block(HarrmodJavaModBlocks.HARRE_FENCE);
	public static final RegistryObject<Item> HARRE_FENCE_GATE = block(HarrmodJavaModBlocks.HARRE_FENCE_GATE);
	public static final RegistryObject<Item> HARRE_PRESSURE_PLATE = block(HarrmodJavaModBlocks.HARRE_PRESSURE_PLATE);
	public static final RegistryObject<Item> HARRE_BUTTON = block(HarrmodJavaModBlocks.HARRE_BUTTON);
	public static final RegistryObject<Item> HOT_SLIME_BUCKET = REGISTRY.register("hot_slime_bucket", () -> new HotSlimeItem());
	public static final RegistryObject<Item> HARRGOLEM_SPAWN_EGG = REGISTRY.register("harrgolem_spawn_egg", () -> new ForgeSpawnEggItem(HarrmodJavaModEntities.HARRGOLEM, -11881806, -12682115, new Item.Properties()));
	public static final RegistryObject<Item> RAYGUN = REGISTRY.register("raygun", () -> new RaygunItem());
	public static final RegistryObject<Item> DEACTIVATEDGOLEM = block(HarrmodJavaModBlocks.DEACTIVATEDGOLEM);
	public static final RegistryObject<Item> MUSIC_DISC_HARRY = REGISTRY.register("music_disc_harry", () -> new MusicDiscHarryItem());
	public static final RegistryObject<Item> BULLET = REGISTRY.register("bullet", () -> new BulletItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
