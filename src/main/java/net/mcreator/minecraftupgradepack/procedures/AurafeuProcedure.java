package net.mcreator.minecraftupgradepack.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.minecraftupgradepack.MinecraftUpgradePackMod;

import java.util.Map;

public class AurafeuProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MinecraftUpgradePackMod.LOGGER.warn("Failed to load dependency entity for procedure Aurafeu!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 8);
	}
}
