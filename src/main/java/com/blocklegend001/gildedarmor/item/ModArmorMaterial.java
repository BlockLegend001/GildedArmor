package com.blocklegend001.gildedarmor.item;

import com.blocklegend001.gildedarmor.util.ModEquipmentAssets;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Util;

import java.util.EnumMap;

public class ModArmorMaterial {
    public static ArmorMaterial GILDED_NETHERITE = new ArmorMaterial(45, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 6);
        map.put(EquipmentType.LEGGINGS, 7);
        map.put(EquipmentType.CHESTPLATE, 10);
        map.put(EquipmentType.HELMET, 6);
        map.put(EquipmentType.BODY, 11);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0F, 0.1F, ItemTags.REPAIRS_NETHERITE_ARMOR, ModEquipmentAssets.GILDED_NETHERITE);
}
