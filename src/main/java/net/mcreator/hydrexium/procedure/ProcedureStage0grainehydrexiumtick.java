package net.mcreator.hydrexium.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.hydrexium.block.BlockHydrexiumplantestage1;
import net.mcreator.hydrexium.ElementsHydrexiumMod;

import java.util.Map;

@ElementsHydrexiumMod.ModElement.Tag
public class ProcedureStage0grainehydrexiumtick extends ElementsHydrexiumMod.ModElement {
	public ProcedureStage0grainehydrexiumtick(ElementsHydrexiumMod instance) {
		super(instance, 148);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Stage0grainehydrexiumtick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Stage0grainehydrexiumtick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Stage0grainehydrexiumtick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Stage0grainehydrexiumtick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockHydrexiumplantestage1.block.getDefaultState(), 3);
	}
}
