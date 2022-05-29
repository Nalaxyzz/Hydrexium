
package net.mcreator.hydrexium.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.hydrexium.procedure.ProcedureHammer;
import net.mcreator.hydrexium.creativetab.TabHydrexiumtab;
import net.mcreator.hydrexium.ElementsHydrexiumMod;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@ElementsHydrexiumMod.ModElement.Tag
public class ItemHammerinfinity extends ElementsHydrexiumMod.ModElement {
	@GameRegistry.ObjectHolder("hydrexium:hammerinfinity")
	public static final Item block = null;
	public ItemHammerinfinity(ElementsHydrexiumMod instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("HAMMERINFINITY", 2, 200, 5f, 0f, 3)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 2);
				return ret.keySet();
			}

			@Override
			public boolean onBlockDestroyed(ItemStack itemstack, World world, IBlockState bl, BlockPos pos, EntityLivingBase entity) {
				boolean retval = super.onBlockDestroyed(itemstack, world, bl, pos, entity);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureHammer.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setUnlocalizedName("hammerinfinity").setRegistryName("hammerinfinity").setCreativeTab(TabHydrexiumtab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("hydrexium:hammerinfinity", "inventory"));
	}
}
