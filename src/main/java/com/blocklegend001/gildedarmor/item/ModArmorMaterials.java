package com.blocklegend001.gildedarmor.item;

import java.util.EnumMap;

import com.blocklegend001.gildedarmor.util.ModEquipmentAssets;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

public class ModArmorMaterials {
        public static final ArmorMaterial GILDED_NETHERITE= new ArmorMaterial(45, Util.make(new EnumMap<>(ArmorType.class),
                attribute -> {
                    attribute.put(ArmorType.BOOTS, 6);
                    attribute.put(ArmorType.LEGGINGS, 7);
                    attribute.put(ArmorType.CHESTPLATE, 10);
                    attribute.put(ArmorType.HELMET, 6);
        }), 20, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.1F, ItemTags.REPAIRS_NETHERITE_ARMOR,
                ModEquipmentAssets.GILDED_NETHERITE);
}