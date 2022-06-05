package net.mcreator.hydrexium.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.hydrexium.ElementsHydrexiumMod;

import java.util.Map;

@ElementsHydrexiumMod.ModElement.Tag
public class ProcedureGrappinQuandUneBalleToucheUnBloc extends ElementsHydrexiumMod.ModElement {
	public ProcedureGrappinQuandUneBalleToucheUnBloc(ElementsHydrexiumMod instance) {
		super(instance, 96);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure GrappinQuandUneBalleToucheUnBloc!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GrappinQuandUneBalleToucheUnBloc!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GrappinQuandUneBalleToucheUnBloc!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GrappinQuandUneBalleToucheUnBloc!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		entity.setPositionAndUpdate(x, y, z);
	}
}
