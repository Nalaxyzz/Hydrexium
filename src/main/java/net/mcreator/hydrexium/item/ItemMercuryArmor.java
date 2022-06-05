
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
public class ItemMercuryArmor extends ElementsHydrexiumMod.ModElement {
	@GameRegistry.ObjectHolder("hydrexium:mercury_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("hydrexium:mercury_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("hydrexium:mercury_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("hydrexium:mercury_armorboots")
	public static final Item boots = null;
	public ItemMercuryArmor(ElementsHydrexiumMod instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("MERCURY_ARMOR", "hydrexium:mercury_", 15, new int[]{2, 6, 5, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("mercury_armorhelmet")
				.setRegistryName("mercury_armorhelmet").setCreativeTab(TabHydrexiumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("mercury_armorbody")
				.setRegistryName("mercury_armorbody").setCreativeTab(TabHydrexiumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("mercury_armorlegs")
				.setRegistryName("mercury_armorlegs").setCreativeTab(TabHydrexiumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("mercury_armorboots")
				.setRegistryName("mercury_armorboots").setCreativeTab(TabHydrexiumtab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("hydrexium:mercury_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("hydrexium:mercury_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("hydrexium:mercury_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("hydrexium:mercury_armorboots", "inventory"));
	}
}
