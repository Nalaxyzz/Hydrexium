package net.mcreator.hydrexium.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.hydrexium.ElementsHydrexiumMod;

import java.util.Map;

@ElementsHydrexiumMod.ModElement.Tag
public class ProcedureHydrexiumarmoradvancedEvenementDeTickDesJambieres extends ElementsHydrexiumMod.ModElement {
	public ProcedureHydrexiumarmoradvancedEvenementDeTickDesJambieres(ElementsHydrexiumMod instance) {
		super(instance, 75);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure HydrexiumarmoradvancedEvenementDeTickDesJambieres!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, (int) 60, (int) 2));
	}
}
