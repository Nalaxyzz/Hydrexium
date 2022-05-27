
package net.mcreator.hydrexium.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.hydrexium.creativetab.TabHydrexiumtab;
import net.mcreator.hydrexium.ElementsHydrexiumMod;

@ElementsHydrexiumMod.ModElement.Tag
public class ItemInfernium extends ElementsHydrexiumMod.ModElement {
	@GameRegistry.ObjectHolder("hydrexium:inferniumhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("hydrexium:inferniumbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("hydrexium:inferniumlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("hydrexium:inferniumboots")
	public static final Item boots = null;
	public ItemInfernium(ElementsHydrexiumMod instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("INFERNIUM", "hydrexium:inferniun_.png", 25, new int[]{4, 6, 7, 4}, 11,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("inferniumhelmet")
				.setRegistryName("inferniumhelmet").setCreativeTab(TabHydrexiumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("inferniumbody")
				.setRegistryName("inferniumbody").setCreativeTab(TabHydrexiumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("inferniumlegs")
				.setRegistryName("inferniumlegs").setCreativeTab(TabHydrexiumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("inferniumboots")
				.setRegistryName("inferniumboots").setCreativeTab(TabHydrexiumtab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("hydrexium:inferniumhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("hydrexium:inferniumbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("hydrexium:inferniumlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("hydrexium:inferniumboots", "inventory"));
	}
}
