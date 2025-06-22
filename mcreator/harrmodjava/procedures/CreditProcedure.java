package net.mcreator.harrmodjava.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.harrmodjava.network.HarrmodJavaModVariables;
import net.mcreator.harrmodjava.HarrmodJavaMod;

public class CreditProcedure {
	public static void execute(LevelAccessor world) {
		if (HarrmodJavaModVariables.MapVariables.get(world).Creditsactivate) {
			HarrmodJavaModVariables.Tickcredits = HarrmodJavaModVariables.Tickcredits + 1;
			HarrmodJavaMod.LOGGER.info(HarrmodJavaModVariables.Tickcredits);
		}
	}
}
