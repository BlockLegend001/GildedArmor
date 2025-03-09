package com.blocklegend001.gildedarmor.item;

import com.blocklegend001.gildedarmor.GildedArmor;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item GILDED_NETHERITE_HELMET = registerItem("gilded_netherite_helmet",
            new GildedArmorItem(ModArmorMaterial.GILDED_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.GILDED_ARMOR).maxCount(1).fireproof()));

    public static final Item GILDED_NETHERITE_CHESTPLATE = registerItem("gilded_netherite_chestplate",
            new GildedArmorItem(ModArmorMaterial.GILDED_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.GILDED_ARMOR).maxCount(1).fireproof()));

    public static final Item GILDED_NETHERITE_LEGGINGS = registerItem("gilded_netherite_leggings",
            new GildedArmorItem(ModArmorMaterial.GILDED_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.GILDED_ARMOR).maxCount(1).fireproof()));

    public static final Item GILDED_NETHERITE_BOOTS = registerItem("gilded_netherite_boots",
            new GildedArmorItem(ModArmorMaterial.GILDED_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.GILDED_ARMOR).maxCount(1).fireproof()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(GildedArmor.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GildedArmor.LOGGER.debug("Registering Mod Items for " + GildedArmor.MOD_ID);
    }
}
