package net.mcreator.hydrexium.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.hydrexium.ElementsHydrexiumMod;

import java.util.Map;

@ElementsHydrexiumMod.ModElement.Tag
public class ProcedureHydrexiumarmoradvancedEvenementDeTickDesBottes extends ElementsHydrexiumMod.ModElement {
	public ProcedureHydrexiumarmoradvancedEvenementDeTickDesBottes(ElementsHydrexiumMod instance) {
		super(instance, 95);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure HydrexiumarmoradvancedEvenementDeTickDesBottes!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, (int) 60, (int) 1));
	}
}
