
package net.mcreator.hydrexium.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.hydrexium.item.ItemInfinityingot;
import net.mcreator.hydrexium.block.BlockInfinityore;
import net.mcreator.hydrexium.ElementsHydrexiumMod;

@ElementsHydrexiumMod.ModElement.Tag
public class RecipeFurnace9 extends ElementsHydrexiumMod.ModElement {
	public RecipeFurnace9(ElementsHydrexiumMod instance) {
		super(instance, 71);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockInfinityore.block, (int) (1)), new ItemStack(ItemInfinityingot.block, (int) (1)), 1F);
	}
}
