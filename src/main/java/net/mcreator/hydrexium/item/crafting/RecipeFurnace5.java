
package net.mcreator.hydrexium.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.hydrexium.item.ItemInferniumingot;
import net.mcreator.hydrexium.block.BlockInferniumore;
import net.mcreator.hydrexium.ElementsHydrexiumMod;

@ElementsHydrexiumMod.ModElement.Tag
public class RecipeFurnace5 extends ElementsHydrexiumMod.ModElement {
	public RecipeFurnace5(ElementsHydrexiumMod instance) {
		super(instance, 71);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockInferniumore.block, (int) (1)), new ItemStack(ItemInferniumingot.block, (int) (1)), 1F);
	}
}
