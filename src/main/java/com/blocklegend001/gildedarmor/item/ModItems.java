package com.blocklegend001.gildedarmor.item;

import com.blocklegend001.gildedarmor.GildedArmor;
import com.blocklegend001.gildedarmor.util.ModDataComponents;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item GILDED_NETHERITE_HELMET = registerItem("gilded_netherite_helmet",
            new GildedArmorItem(ModArmorMaterial.GILDED_NETHERITE, EquipmentType.HELMET,
                    new Item.Settings().maxCount(1).fireproof().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GildedArmor.MOD_ID, "gilded_netherite_helmet")))
                            .component(ModDataComponents.GILDED_ARMOR.get(), Boolean.valueOf(true))));

    public static final Item GILDED_NETHERITE_CHESTPLATE = registerItem("gilded_netherite_chestplate",
            new GildedArmorItem(ModArmorMaterial.GILDED_NETHERITE, EquipmentType.CHESTPLATE,
                    new Item.Settings().maxCount(1).fireproof().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GildedArmor.MOD_ID, "gilded_netherite_chestplate")))
                            .component(ModDataComponents.GILDED_ARMOR.get(), Boolean.valueOf(true))));

    public static final Item GILDED_NETHERITE_LEGGINGS = registerItem("gilded_netherite_leggings",
            new GildedArmorItem(ModArmorMaterial.GILDED_NETHERITE, EquipmentType.LEGGINGS,
                    new Item.Settings().maxCount(1).fireproof().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GildedArmor.MOD_ID, "gilded_netherite_leggings")))
                            .component(ModDataComponents.GILDED_ARMOR.get(), Boolean.valueOf(true))));

    public static final Item GILDED_NETHERITE_BOOTS = registerItem("gilded_netherite_boots",
            new GildedArmorItem(ModArmorMaterial.GILDED_NETHERITE, EquipmentType.BOOTS,
                    new Item.Settings().maxCount(1).fireproof().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GildedArmor.MOD_ID, "gilded_netherite_boots")))
                            .component(ModDataComponents.GILDED_ARMOR.get(), Boolean.valueOf(true))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GildedArmor.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.GILDED_ARMOR, GILDED_NETHERITE_HELMET);
        addToItemGroup(ModItemGroup.GILDED_ARMOR, GILDED_NETHERITE_CHESTPLATE);
        addToItemGroup(ModItemGroup.GILDED_ARMOR, GILDED_NETHERITE_LEGGINGS);
        addToItemGroup(ModItemGroup.GILDED_ARMOR, GILDED_NETHERITE_BOOTS);
    }

    public static void addToItemGroup(RegistryKey<ItemGroup> group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        GildedArmor.LOGGER.info("Registering Mod Items for " + GildedArmor.MOD_ID);
        addItemsToItemGroup();
    }
}