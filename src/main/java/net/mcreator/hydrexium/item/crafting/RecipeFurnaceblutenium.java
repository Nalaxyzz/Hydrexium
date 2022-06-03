
package net.mcreator.hydrexium.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.hydrexium.item.ItemFauconiumingot;
import net.mcreator.hydrexium.item.ItemBluteniumingot;
import net.mcreator.hydrexium.ElementsHydrexiumMod;

@ElementsHydrexiumMod.ModElement.Tag
public class RecipeFurnaceblutenium extends ElementsHydrexiumMod.ModElement {
	public RecipeFurnaceblutenium(ElementsHydrexiumMod instance) {
		super(instance, 107);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemFauconiumingot.block, (int) (1)), new ItemStack(ItemBluteniumingot.block, (int) (1)), 1F);
	}
}
