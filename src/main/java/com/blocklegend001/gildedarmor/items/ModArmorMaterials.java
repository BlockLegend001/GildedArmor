package com.blocklegend001.gildedarmor.items;

import com.blocklegend001.gildedarmor.GildedArmor;
import com.blocklegend001.gildedarmor.config.ModConfig;
import net.minecraft.Util;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.EnumMap;

public class ModArmorMaterials {
    public static final ArmorMaterial GILDED_NETHERITE= new ArmorMaterial(ModConfig.durabilityValueGildedArmor, Util.make(new EnumMap<>(ArmorType.class),
            attribute -> {
                attribute.put(ArmorType.BOOTS, ModConfig.protectionValueGildedBoots);
                attribute.put(ArmorType.LEGGINGS, ModConfig.protectionValueGildedLeggings);
                attribute.put(ArmorType.CHESTPLATE, ModConfig.protectionValueGildedChestplate);
                attribute.put(ArmorType.HELMET, ModConfig.protectionValueGildedHelmet);
            }), ModConfig.enchantmentValueGildedArmor, SoundEvents.ARMOR_EQUIP_NETHERITE, ModConfig.toughnessValueGildedArmor, ModConfig.knockbackResistanceValueGildedArmor, ItemTags.REPAIRS_NETHERITE_ARMOR,
            ResourceLocation.fromNamespaceAndPath(GildedArmor.MODID, "gilded_netherite"));
}