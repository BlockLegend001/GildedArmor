package com.blocklegend001.gildedarmor.item;

import com.blocklegend001.gildedarmor.GildedArmor;
import com.blocklegend001.gildedarmor.config.ModConfig;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;

public class ModArmorMaterial {
    public static ArmorMaterial GILDED_NETHERITE = new ArmorMaterial(ModConfig.durabilityValueGildedArmor, Util.make(new EnumMap(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, ModConfig.protectionValueGildedBoots);
        map.put(EquipmentType.LEGGINGS, ModConfig.protectionValueGildedLeggings);
        map.put(EquipmentType.CHESTPLATE, ModConfig.protectionValueGildedChestplate);
        map.put(EquipmentType.HELMET, ModConfig.protectionValueGildedHelmet);
    }), ModConfig.enchantmentValueGildedArmor, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, ModConfig.toughnessValueGildedArmor, ModConfig.knockbackResistanceValueGildedArmor, ItemTags.REPAIRS_NETHERITE_ARMOR,
            Identifier.of(GildedArmor.MOD_ID, "gilded_netherite"));
}
