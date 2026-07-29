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

    public static final ResourceKey<Item> GILDED_NETHERITE_HELMET_KEY = itemKey("gilded_netherite_helmet");
    public static final Item GILDED_NETHERITE_HELMET = registerItem(GILDED_NETHERITE_HELMET_KEY,
            properties -> new GildedArmorItem(
                    properties.humanoidArmor(ModArmorMaterial.GILDED_NETHERITE, ArmorType.HELMET)
                            .fireResistant()
                            .stacksTo(1)));

    public static final ResourceKey<Item> GILDED_NETHERITE_CHESTPLATE_KEY = itemKey("gilded_netherite_chestplate");
    public static final Item GILDED_NETHERITE_CHESTPLATE = registerItem(GILDED_NETHERITE_CHESTPLATE_KEY,
            properties -> new GildedArmorItem(
                    properties.humanoidArmor(ModArmorMaterial.GILDED_NETHERITE, ArmorType.CHESTPLATE)
                            .fireResistant()
                            .stacksTo(1)));

    public static final ResourceKey<Item> GILDED_NETHERITE_LEGGINGS_KEY = itemKey("gilded_netherite_leggings");
    public static final Item GILDED_NETHERITE_LEGGINGS = registerItem(GILDED_NETHERITE_LEGGINGS_KEY,
            properties -> new GildedArmorItem(
                    properties.humanoidArmor(ModArmorMaterial.GILDED_NETHERITE, ArmorType.LEGGINGS)
                            .fireResistant()
                            .stacksTo(1)));

    public static final ResourceKey<Item> GILDED_NETHERITE_BOOTS_KEY = itemKey("gilded_netherite_boots");
    public static final Item GILDED_NETHERITE_BOOTS = registerItem(GILDED_NETHERITE_BOOTS_KEY,
            properties -> new GildedArmorItem(
                    properties.humanoidArmor(ModArmorMaterial.GILDED_NETHERITE, ArmorType.BOOTS)
                            .fireResistant()
                            .stacksTo(1)));

    private static ResourceKey<Item> itemKey(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(GildedArmor.MOD_ID, name));
    }

    private static Item registerItem(ResourceKey<Item> key, Function<Item.Properties, Item> factory) {
        Item item = factory.apply(new Item.Properties().setId(key));
        return Registry.register(BuiltInRegistries.ITEM, key, item);
    }

    public static void registerModItems() {
        GildedArmor.LOGGER.info("Registering Mod Items for " + GildedArmor.MOD_ID);
    }
}