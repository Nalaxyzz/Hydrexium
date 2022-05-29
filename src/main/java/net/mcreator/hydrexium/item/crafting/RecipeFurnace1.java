
package net.mcreator.hydrexium.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.hydrexium.item.ItemFauconiumingot;
import net.mcreator.hydrexium.block.BlockFauconiumore;
import net.mcreator.hydrexium.ElementsHydrexiumMod;

@ElementsHydrexiumMod.ModElement.Tag
public class RecipeFurnace1 extends ElementsHydrexiumMod.ModElement {
	public RecipeFurnace1(ElementsHydrexiumMod instance) {
		super(instance, 51);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockFauconiumore.block, (int) (1)), new ItemStack(ItemFauconiumingot.block, (int) (1)), 1F);
	}
}
