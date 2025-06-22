package net.mcreator.harrmodjava.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class JumpProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isPassenger()) {
			entity.setDeltaMovement(new Vec3(0, 1, 0));
		}
	}
}
