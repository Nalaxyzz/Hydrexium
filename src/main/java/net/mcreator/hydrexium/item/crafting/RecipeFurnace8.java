
package net.mcreator.hydrexium.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.hydrexium.item.ItemHydrexiumingot;
import net.mcreator.hydrexium.block.BlockHydrexiumore2;
import net.mcreator.hydrexium.ElementsHydrexiumMod;

@ElementsHydrexiumMod.ModElement.Tag
public class RecipeFurnace8 extends ElementsHydrexiumMod.ModElement {
	public RecipeFurnace8(ElementsHydrexiumMod instance) {
		super(instance, 70);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockHydrexiumore2.block, (int) (1)), new ItemStack(ItemHydrexiumingot.block, (int) (1)), 1F);
	}
}
