package net.mcreator.hydrexium.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.hydrexium.item.ItemHydrexiumGraine;
import net.mcreator.hydrexium.block.BlockHydrexiumplantestage0;
import net.mcreator.hydrexium.ElementsHydrexiumMod;

import java.util.Map;

@ElementsHydrexiumMod.ModElement.Tag
public class ProcedureProceduregrainehydrexium extends ElementsHydrexiumMod.ModElement {
	public ProcedureProceduregrainehydrexium(ElementsHydrexiumMod instance) {
		super(instance, 143);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Proceduregrainehydrexium!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Proceduregrainehydrexium!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Proceduregrainehydrexium!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Proceduregrainehydrexium!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Proceduregrainehydrexium!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.FARMLAND.getDefaultState().getBlock())
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
						|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock())
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
										.getBlock()))))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemHydrexiumGraine.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockHydrexiumplantestage0.block.getDefaultState(), 3);
		}
	}
}
