package net.mcreator.harrmodjava.procedures;

import net.minecraft.world.entity.Entity;

public class PorsePlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !entity.onGround();
	}
}
