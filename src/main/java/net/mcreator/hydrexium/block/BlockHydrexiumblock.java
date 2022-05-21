
package net.mcreator.hydrexium.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.hydrexium.creativetab.TabHydrexiumtab;
import net.mcreator.hydrexium.ElementsHydrexiumMod;

@ElementsHydrexiumMod.ModElement.Tag
public class BlockHydrexiumblock extends ElementsHydrexiumMod.ModElement {
	@GameRegistry.ObjectHolder("hydrexium:hydrexiumblock")
	public static final Block block = null;
	public BlockHydrexiumblock(ElementsHydrexiumMod instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("hydrexiumblock"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("hydrexium:hydrexiumblock", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("hydrexiumblock");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 3);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabHydrexiumtab.tab);
		}
	}
}
