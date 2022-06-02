
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
public class BlockCompressormk2 extends ElementsHydrexiumMod.ModElement {
	@GameRegistry.ObjectHolder("hydrexium:compressormk_2")
	public static final Block block = null;
	public BlockCompressormk2(ElementsHydrexiumMod instance) {
		super(instance, 137);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("compressormk_2"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("hydrexium:compressormk_2", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ANVIL);
			setUnlocalizedName("compressormk_2");
			setSoundType(SoundType.ANVIL);
			setHarvestLevel("pickaxe", 2);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabHydrexiumtab.tab);
		}
	}
}
