
package net.mcreator.hydrexium.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.hydrexium.item.ItemMercuryingot;
import net.mcreator.hydrexium.block.BlockMercuryore;
import net.mcreator.hydrexium.ElementsHydrexiumMod;

@ElementsHydrexiumMod.ModElement.Tag
public class RecipeFurnace7 extends ElementsHydrexiumMod.ModElement {
	public RecipeFurnace7(ElementsHydrexiumMod instance) {
		super(instance, 44);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockMercuryore.block, (int) (1)), new ItemStack(ItemMercuryingot.block, (int) (1)), 1F);
	}
}
