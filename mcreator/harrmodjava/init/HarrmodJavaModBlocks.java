
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.harrmodjava.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.harrmodjava.block.HotSlimeBlock;
import net.mcreator.harrmodjava.block.HarrsidianignitedBlock;
import net.mcreator.harrmodjava.block.HarrsidianBlock;
import net.mcreator.harrmodjava.block.HarronitblockBlock;
import net.mcreator.harrmodjava.block.HarronitBlock;
import net.mcreator.harrmodjava.block.HarrmensionPortalBlock;
import net.mcreator.harrmodjava.block.HarrekslabBlock;
import net.mcreator.harrmodjava.block.HarrekplanksstairsBlock;
import net.mcreator.harrmodjava.block.HarrekplanksBlock;
import net.mcreator.harrmodjava.block.HarrekleavesBlock;
import net.mcreator.harrmodjava.block.HarrekBlock;
import net.mcreator.harrmodjava.block.HarrePressurePlateBlock;
import net.mcreator.harrmodjava.block.HarreFenceGateBlock;
import net.mcreator.harrmodjava.block.HarreFenceBlock;
import net.mcreator.harrmodjava.block.HarreButtonBlock;
import net.mcreator.harrmodjava.block.DeactivatedgolemBlock;
import net.mcreator.harrmodjava.block.CarrutvineBlock;
import net.mcreator.harrmodjava.HarrmodJavaMod;

public class HarrmodJavaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HarrmodJavaMod.MODID);
	public static final RegistryObject<Block> HARREK = REGISTRY.register("harrek", () -> new HarrekBlock());
	public static final RegistryObject<Block> HARREKLEAVES = REGISTRY.register("harrekleaves", () -> new HarrekleavesBlock());
	public static final RegistryObject<Block> HARRONIT = REGISTRY.register("harronit", () -> new HarronitBlock());
	public static final RegistryObject<Block> HARREKPLANKS = REGISTRY.register("harrekplanks", () -> new HarrekplanksBlock());
	public static final RegistryObject<Block> HARRSIDIAN = REGISTRY.register("harrsidian", () -> new HarrsidianBlock());
	public static final RegistryObject<Block> HARRSIDIANIGNITED = REGISTRY.register("harrsidianignited", () -> new HarrsidianignitedBlock());
	public static final RegistryObject<Block> HARRMENSION_PORTAL = REGISTRY.register("harrmension_portal", () -> new HarrmensionPortalBlock());
	public static final RegistryObject<Block> HARRONITBLOCK = REGISTRY.register("harronitblock", () -> new HarronitblockBlock());
	public static final RegistryObject<Block> HARREKPLANKSSTAIRS = REGISTRY.register("harrekplanksstairs", () -> new HarrekplanksstairsBlock());
	public static final RegistryObject<Block> HARREKSLAB = REGISTRY.register("harrekslab", () -> new HarrekslabBlock());
	public static final RegistryObject<Block> CARRUTVINE = REGISTRY.register("carrutvine", () -> new CarrutvineBlock());
	public static final RegistryObject<Block> HARRE_FENCE = REGISTRY.register("harre_fence", () -> new HarreFenceBlock());
	public static final RegistryObject<Block> HARRE_FENCE_GATE = REGISTRY.register("harre_fence_gate", () -> new HarreFenceGateBlock());
	public static final RegistryObject<Block> HARRE_PRESSURE_PLATE = REGISTRY.register("harre_pressure_plate", () -> new HarrePressurePlateBlock());
	public static final RegistryObject<Block> HARRE_BUTTON = REGISTRY.register("harre_button", () -> new HarreButtonBlock());
	public static final RegistryObject<Block> HOT_SLIME = REGISTRY.register("hot_slime", () -> new HotSlimeBlock());
	public static final RegistryObject<Block> DEACTIVATEDGOLEM = REGISTRY.register("deactivatedgolem", () -> new DeactivatedgolemBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
