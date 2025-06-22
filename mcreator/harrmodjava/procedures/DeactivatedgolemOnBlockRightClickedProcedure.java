package net.mcreator.harrmodjava.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.harrmodjava.init.HarrmodJavaModItems;
import net.mcreator.harrmodjava.init.HarrmodJavaModEntities;
import net.mcreator.harrmodjava.HarrmodJavaMod;

public class DeactivatedgolemOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HarrmodJavaModItems.HARRONITGEM.get())) : false) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("harrmod_java:dragon")), SoundSource.HOSTILE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("harrmod_java:dragon")), SoundSource.HOSTILE, 1, 1, false);
				}
			}
			HarrmodJavaMod.queueServerWork(240, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = HarrmodJavaModEntities.HARRGOLEM.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(HarrmodJavaModItems.HARRONITGEM.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			});
		}
	}
}
