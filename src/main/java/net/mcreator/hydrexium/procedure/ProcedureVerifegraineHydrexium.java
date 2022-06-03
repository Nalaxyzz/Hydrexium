package net.mcreator.hydrexium.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.item.EntityItem;

import net.mcreator.hydrexium.item.ItemHydrexiumGraine;
import net.mcreator.hydrexium.ElementsHydrexiumMod;

import java.util.Map;

@ElementsHydrexiumMod.ModElement.Tag
public class ProcedureVerifegraineHydrexium extends ElementsHydrexiumMod.ModElement {
	public ProcedureVerifegraineHydrexium(ElementsHydrexiumMod instance) {
		super(instance, 147);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure VerifegraineHydrexium!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure VerifegraineHydrexium!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure VerifegraineHydrexium!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure VerifegraineHydrexium!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND.getDefaultState()
				.getBlock()) == (false))) {
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemHydrexiumGraine.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
		}
	}
}
