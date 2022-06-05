
package net.mcreator.hydrexium.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.hydrexium.block.BlockHydrexiumblock;
import net.mcreator.hydrexium.ElementsHydrexiumMod;

@ElementsHydrexiumMod.ModElement.Tag
public class TabHydrexiumtab extends ElementsHydrexiumMod.ModElement {
	public TabHydrexiumtab(ElementsHydrexiumMod instance) {
		super(instance, 65);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabhydrexiumtab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockHydrexiumblock.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
