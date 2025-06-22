package net.mcreator.harrmodjava.procedures;

import net.minecraft.world.entity.Entity;

public class PorsePlaybacksprintProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.isSprinting();
	}
}
