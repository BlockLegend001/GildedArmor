package com.blocklegend001.gildedarmor.item;

import com.blocklegend001.gildedarmor.GildedArmor;
import com.blocklegend001.gildedarmor.config.ModConfig;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterial {
    public static final RegistryEntry<ArmorMaterial> GILDED_NETHERITE = registerArmorMaterial("gilded_netherite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, ModConfig.protectionValueGildedBoots);
                map.put(ArmorItem.Type.LEGGINGS, ModConfig.protectionValueGildedLeggings);
                map.put(ArmorItem.Type.CHESTPLATE, ModConfig.protectionValueGildedChestplate);
                map.put(ArmorItem.Type.HELMET, ModConfig.protectionValueGildedHelmet);
            }), ModConfig.enchantmentValueGildedArmor, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(Items.NETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(GildedArmor.MOD_ID, "gilded_netherite"))), ModConfig.toughnessValueGildedArmor, ModConfig.knockbackResistanceValueGildedArmor));


    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(GildedArmor.MOD_ID, name), material.get());
    }
}