package com.blocklegend001.gildedarmor.item;

import com.blocklegend001.gildedarmor.GildedArmor;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GildedArmor.MODID);

    public static final RegistryObject<Item> GILDED_NETHERITE_HELMET = ITEMS.register("gilded_netherite_helmet",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, ArmorType.HELMET,
                    new Item.Properties().stacksTo(1).fireResistant()
                            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(GildedArmor.MODID, "gilded_netherite_helmet")))));

    public static final RegistryObject<Item> GILDED_NETHERITE_CHESTPLATE = ITEMS.register("gilded_netherite_chestplate",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, ArmorType.CHESTPLATE,
                    new Item.Properties().stacksTo(1).fireResistant()
                            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(GildedArmor.MODID, "gilded_netherite_chestplate")))));

    public static final RegistryObject<Item> GILDED_NETHERITE_LEGGINGS = ITEMS.register("gilded_netherite_leggings",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, ArmorType.LEGGINGS,
                    new Item.Properties().stacksTo(1).fireResistant()
                            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(GildedArmor.MODID, "gilded_netherite_leggings")))));

    public static final RegistryObject<Item> GILDED_NETHERITE_BOOTS = ITEMS.register("gilded_netherite_boots",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, ArmorType.BOOTS,
                    new Item.Properties().stacksTo(1).fireResistant()
                            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(GildedArmor.MODID, "gilded_netherite_boots")))));

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}

