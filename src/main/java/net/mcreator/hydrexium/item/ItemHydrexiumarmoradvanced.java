
package net.mcreator.hydrexium.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.hydrexium.procedure.ProcedureHydrexiumarmoradvancedEvenementDeTickDuPlastron;
import net.mcreator.hydrexium.procedure.ProcedureHydrexiumarmoradvancedEvenementDeTickDuCasque;
import net.mcreator.hydrexium.procedure.ProcedureHydrexiumarmoradvancedEvenementDeTickDesJambieres;
import net.mcreator.hydrexium.procedure.ProcedureHydrexiumarmoradvancedEvenementDeTickDesBottes;
import net.mcreator.hydrexium.creativetab.TabHydrexiumtab;
import net.mcreator.hydrexium.ElementsHydrexiumMod;

import java.util.Map;
import java.util.HashMap;

@ElementsHydrexiumMod.ModElement.Tag
public class ItemHydrexiumarmoradvanced extends ElementsHydrexiumMod.ModElement {
	@GameRegistry.ObjectHolder("hydrexium:hydrexiumarmoradvancedhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("hydrexium:hydrexiumarmoradvancedbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("hydrexium:hydrexiumarmoradvancedlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("hydrexium:hydrexiumarmoradvancedboots")
	public static final Item boots = null;
	public ItemHydrexiumarmoradvanced(ElementsHydrexiumMod instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("HYDREXIUMARMORADVANCED", "hydrexium:corrupt_upgraded_netherite___", 40,
				new int[]{7, 10, 10, 7}, 15,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 4f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureHydrexiumarmoradvancedEvenementDeTickDuCasque.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("hydrexiumarmoradvancedhelmet").setRegistryName("hydrexiumarmoradvancedhelmet").setCreativeTab(TabHydrexiumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureHydrexiumarmoradvancedEvenementDeTickDuPlastron.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("hydrexiumarmoradvancedbody").setRegistryName("hydrexiumarmoradvancedbody").setCreativeTab(TabHydrexiumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureHydrexiumarmoradvancedEvenementDeTickDesJambieres.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("hydrexiumarmoradvancedlegs").setRegistryName("hydrexiumarmoradvancedlegs").setCreativeTab(TabHydrexiumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureHydrexiumarmoradvancedEvenementDeTickDesBottes.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("hydrexiumarmoradvancedboots").setRegistryName("hydrexiumarmoradvancedboots").setCreativeTab(TabHydrexiumtab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("hydrexium:hydrexiumarmoradvancedhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("hydrexium:hydrexiumarmoradvancedbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("hydrexium:hydrexiumarmoradvancedlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("hydrexium:hydrexiumarmoradvancedboots", "inventory"));
	}
}
