
package net.mcreator.hydrexium.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.hydrexium.item.ItemVoidiumingot;
import net.mcreator.hydrexium.block.BlockVoidiumore;
import net.mcreator.hydrexium.ElementsHydrexiumMod;

@ElementsHydrexiumMod.ModElement.Tag
public class RecipeFurnace2 extends ElementsHydrexiumMod.ModElement {
	public RecipeFurnace2(ElementsHydrexiumMod instance) {
		super(instance, 62);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockVoidiumore.block, (int) (1)), new ItemStack(ItemVoidiumingot.block, (int) (1)), 1F);
	}
}
