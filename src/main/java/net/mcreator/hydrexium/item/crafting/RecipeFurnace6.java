
package net.mcreator.hydrexium.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.hydrexium.item.ItemOxoniumingot;
import net.mcreator.hydrexium.block.BlockOxoniumore;
import net.mcreator.hydrexium.ElementsHydrexiumMod;

@ElementsHydrexiumMod.ModElement.Tag
public class RecipeFurnace6 extends ElementsHydrexiumMod.ModElement {
	public RecipeFurnace6(ElementsHydrexiumMod instance) {
		super(instance, 57);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockOxoniumore.block, (int) (1)), new ItemStack(ItemOxoniumingot.block, (int) (1)), 1F);
	}
}
