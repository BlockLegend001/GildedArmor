package com.blocklegend001.gildedarmor.item;

import com.blocklegend001.gildedarmor.GildedArmor;
import com.blocklegend001.gildedarmor.config.ModConfig;
import com.google.common.collect.Maps;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.Map;

public class ModArmorMaterial {
    static ResourceKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY = ResourceKey.createRegistryKey(Identifier.parse("equipment_asset"));
    public static final ResourceKey<EquipmentAsset> GILDED_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(GildedArmor.MOD_ID, "gilded_netherite"));

    public static final ArmorMaterial GILDED_NETHERITE = new ArmorMaterial(ModConfig.durabilityValueGildedArmor,
            makeDefense(ModConfig.protectionValueGildedBoots, ModConfig.protectionValueGildedLeggings, ModConfig.protectionValueGildedChestplate, ModConfig.protectionValueGildedHelmet, ModConfig.protectionValueGildedBody), ModConfig.enchantmentValueGildedArmor,
            SoundEvents.ARMOR_EQUIP_NETHERITE, ModConfig.toughnessValueGildedArmor, ModConfig.knockbackResistanceValueGildedArmor, ItemTags.REPAIRS_NETHERITE_ARMOR, GILDED_KEY) ;

    static Map<ArmorType, Integer> makeDefense(final int boots, final int legs, final int chest, final int helm, final int body) {
        return Maps.newEnumMap(Map.of(ArmorType.BOOTS, boots, ArmorType.LEGGINGS, legs, ArmorType.CHESTPLATE, chest, ArmorType.HELMET, helm, ArmorType.BODY, body));
    }
}
