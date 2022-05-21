
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
public class ItemHydrexium extends ElementsHydrexiumMod.ModElement {
	@GameRegistry.ObjectHolder("hydrexium:hydrexiumhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("hydrexium:hydrexiumbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("hydrexium:hydrexiumlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("hydrexium:hydrexiumboots")
	public static final Item boots = null;
	public ItemHydrexium(ElementsHydrexiumMod instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("HYDREXIUM", "hydrexium:naladium____", 33, new int[]{4, 6, 6, 4}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("hydrexiumhelmet")
				.setRegistryName("hydrexiumhelmet").setCreativeTab(TabHydrexiumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("hydrexiumbody")
				.setRegistryName("hydrexiumbody").setCreativeTab(TabHydrexiumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("hydrexiumlegs")
				.setRegistryName("hydrexiumlegs").setCreativeTab(TabHydrexiumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("hydrexiumboots")
				.setRegistryName("hydrexiumboots").setCreativeTab(TabHydrexiumtab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("hydrexium:hydrexiumhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("hydrexium:hydrexiumbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("hydrexium:hydrexiumlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("hydrexium:hydrexiumboots", "inventory"));
	}
}
