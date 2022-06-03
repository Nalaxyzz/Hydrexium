
package net.mcreator.hydrexium.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.hydrexium.item.ItemSlavicniumingot;
import net.mcreator.hydrexium.block.BlockSlavicniumore;
import net.mcreator.hydrexium.ElementsHydrexiumMod;

@ElementsHydrexiumMod.ModElement.Tag
public class RecipeFurnace3 extends ElementsHydrexiumMod.ModElement {
	public RecipeFurnace3(ElementsHydrexiumMod instance) {
		super(instance, 64);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSlavicniumore.block, (int) (1)), new ItemStack(ItemSlavicniumingot.block, (int) (1)), 1F);
	}
}
