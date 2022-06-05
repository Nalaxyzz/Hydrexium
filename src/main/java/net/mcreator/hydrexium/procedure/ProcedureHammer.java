package net.mcreator.hydrexium.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.init.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.block.material.Material;

import net.mcreator.hydrexium.ElementsHydrexiumMod;

import java.util.Map;

@ElementsHydrexiumMod.ModElement.Tag
public class ProcedureHammer extends ElementsHydrexiumMod.ModElement {
	public ProcedureHammer(ElementsHydrexiumMod instance) {
		super(instance, 70);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Hammer!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Hammer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Hammer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Hammer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Hammer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity.rotationPitch) > 40) || ((entity.rotationPitch) < (-40)))) {
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), 1);
				world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) z));
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), 1);
				world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) z));
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))), 1);
				world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)));
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))), 1);
				world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)));
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))), 1);
				world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)));
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))), 1);
				world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)));
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), 1);
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z + 1)));
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), 1);
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z - 1)));
			}
		} else if ((((entity.getHorizontalFacing()) == EnumFacing.NORTH) || ((entity.getHorizontalFacing()) == EnumFacing.SOUTH))) {
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), 1);
				world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) z));
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), 1);
				world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) z));
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), 1);
				world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y + 1), (int) z));
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)), 1);
				world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y - 1), (int) z));
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)), 1);
				world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y - 1), (int) z));
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), 1);
				world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y + 1), (int) z));
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), 1);
				world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) z));
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), 1);
				world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) z));
			}
		} else if ((((entity.getHorizontalFacing()) == EnumFacing.WEST) || ((entity.getHorizontalFacing()) == EnumFacing.EAST))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), 1);
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z + 1)));
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), 1);
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z - 1)));
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), 1);
				world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)));
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))), 1);
				world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)));
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))), 1);
				world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)));
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), 1);
				world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)));
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), 1);
				world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) z));
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getMaterial() == Material.ROCK)
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
							.getBlock())))) {
				world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), 1);
				world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) z));
			}
		}
	}
}
