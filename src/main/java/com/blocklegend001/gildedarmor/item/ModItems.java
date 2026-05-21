package com.blocklegend001.gildedarmor.item;

import com.blocklegend001.gildedarmor.GildedArmor;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Function;

public class ModItems {
    public static final Item GILDED_NETHERITE_HELMET = registerItem("gilded_netherite_helmet",
            properties -> new GildedArmorItem(properties.humanoidArmor(ModArmorMaterial.GILDED_NETHERITE, ArmorType.HELMET).fireResistant().stacksTo(1)));

    public static final Item GILDED_NETHERITE_CHESTPLATE = registerItem("gilded_netherite_chestplate",
            properties -> new GildedArmorItem(properties.humanoidArmor(ModArmorMaterial.GILDED_NETHERITE, ArmorType.CHESTPLATE).fireResistant().stacksTo(1)));

    public static final Item GILDED_NETHERITE_LEGGINGS = registerItem("gilded_netherite_leggings",
            properties -> new GildedArmorItem(properties.humanoidArmor(ModArmorMaterial.GILDED_NETHERITE, ArmorType.LEGGINGS).fireResistant().stacksTo(1)));

    public static final Item GILDED_NETHERITE_BOOTS = registerItem("gilded_netherite_boots",
            properties -> new GildedArmorItem(properties.humanoidArmor(ModArmorMaterial.GILDED_NETHERITE, ArmorType.BOOTS).fireResistant().stacksTo(1)));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(GildedArmor.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(GildedArmor.MOD_ID, name)))));
    }

    public static void registerModItems() {
        GildedArmor.LOGGER.info("Registering Mod Items for " + GildedArmor.MOD_ID);
    }
}