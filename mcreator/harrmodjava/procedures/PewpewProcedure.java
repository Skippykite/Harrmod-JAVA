package net.mcreator.harrmodjava.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;

import net.mcreator.harrmodjava.init.HarrmodJavaModEntities;
import net.mcreator.harrmodjava.entity.HarrgolemshootEntity;

public class PewpewProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double shootCooldown = 0;
		double shotsfired = 0;
		double attacktimer = 0;
		if (attacktimer <= 0) {
			shootCooldown = 20;
			shotsfired = 0;
			attacktimer = 100;
		} else {
			attacktimer = attacktimer - 1;
		}
		if (shootCooldown <= 0 && shotsfired < 3) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
							AbstractArrow entityToSpawn = new HarrgolemshootEntity(HarrmodJavaModEntities.HARRGOLEMSHOOT.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setPierceLevel(piercing);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, 5, 1, (byte) 1);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
			shotsfired = shotsfired + 1;
			shootCooldown = 20;
		} else if (shotsfired < 3) {
			shootCooldown = shootCooldown - 1;
		}
	}
}
