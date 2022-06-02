
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
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.hydrexium.ElementsHydrexiumMod;

@ElementsHydrexiumMod.ModElement.Tag
public class ItemHydrexiumarmor3dArmor extends ElementsHydrexiumMod.ModElement {
	@GameRegistry.ObjectHolder("hydrexium:hydrexiumarmor_3d_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("hydrexium:hydrexiumarmor_3d_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("hydrexium:hydrexiumarmor_3d_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("hydrexium:hydrexiumarmor_3d_armorboots")
	public static final Item boots = null;
	public ItemHydrexiumarmor3dArmor(ElementsHydrexiumMod instance) {
		super(instance, 136);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("HYDREXIUMARMOR_3D_ARMOR", "hydrexium:netherite", 15, new int[]{2, 6, 5, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("hydrexiumarmor_3d_armorhelmet")
				.setRegistryName("hydrexiumarmor_3d_armorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("hydrexiumarmor_3d_armorbody")
				.setRegistryName("hydrexiumarmor_3d_armorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("hydrexiumarmor_3d_armorlegs")
				.setRegistryName("hydrexiumarmor_3d_armorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("hydrexiumarmor_3d_armorboots")
				.setRegistryName("hydrexiumarmor_3d_armorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("hydrexium:hydrexiumarmor_3d_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("hydrexium:hydrexiumarmor_3d_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("hydrexium:hydrexiumarmor_3d_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("hydrexium:hydrexiumarmor_3d_armorboots", "inventory"));
	}
}
