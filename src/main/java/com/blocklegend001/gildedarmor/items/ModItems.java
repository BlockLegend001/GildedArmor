package com.blocklegend001.gildedarmor.items;

import com.blocklegend001.gildedarmor.GildedArmor;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Registries.ITEM, GildedArmor.MODID);

    public static final DeferredHolder<Item, GildedArmorItem> GILDED_NETHERITE_HELMET = ITEMS.register("gilded_netherite_helmet",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, ArmorType.HELMET,
                    new Item.Properties().stacksTo(1).fireResistant()
                            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(GildedArmor.MODID, "gilded_netherite_helmet")))));

    public static final DeferredHolder<Item, GildedArmorItem> GILDED_NETHERITE_CHESTPLATE = ITEMS.register("gilded_netherite_chestplate",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, ArmorType.CHESTPLATE,
                    new Item.Properties().stacksTo(1).fireResistant()
                            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(GildedArmor.MODID, "gilded_netherite_chestplate")))));

    public static final DeferredHolder<Item, GildedArmorItem> GILDED_NETHERITE_LEGGINGS = ITEMS.register("gilded_netherite_leggings",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, ArmorType.LEGGINGS,
                    new Item.Properties().stacksTo(1).fireResistant()
                            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(GildedArmor.MODID, "gilded_netherite_leggings")))));

    public static final DeferredHolder<Item, GildedArmorItem> GILDED_NETHERITE_BOOTS = ITEMS.register("gilded_netherite_boots",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, ArmorType.BOOTS,
                    new Item.Properties().stacksTo(1).fireResistant()
                            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(GildedArmor.MODID, "gilded_netherite_boots")))));

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
