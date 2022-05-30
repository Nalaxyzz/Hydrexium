package net.mcreator.hydrexium.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.hydrexium.ElementsHydrexiumMod;

import java.util.Map;

@ElementsHydrexiumMod.ModElement.Tag
public class ProcedureHydrexiumarmoradvancedEvenementDeTickDuPlastron extends ElementsHydrexiumMod.ModElement {
	public ProcedureHydrexiumarmoradvancedEvenementDeTickDuPlastron(ElementsHydrexiumMod instance) {
		super(instance, 88);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure HydrexiumarmoradvancedEvenementDeTickDuPlastron!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 60, (int) 2));
	}
}
