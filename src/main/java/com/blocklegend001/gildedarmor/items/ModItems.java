package com.blocklegend001.gildedarmor.items;

import com.blocklegend001.gildedarmor.GildedArmor;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Registries.ITEM, GildedArmor.MODID);

    public static final DeferredHolder<Item, GildedArmorItem> GILDED_NETHERITE_HELMET = ITEMS.register("gilded_netherite_helmet",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, ArmorItem.Type.HELMET,
                    new Item.Properties().stacksTo(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(49))));

    public static final DeferredHolder<Item, GildedArmorItem> GILDED_NETHERITE_CHESTPLATE = ITEMS.register("gilded_netherite_chestplate",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().stacksTo(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(45))));

    public static final DeferredHolder<Item, GildedArmorItem> GILDED_NETHERITE_LEGGINGS = ITEMS.register("gilded_netherite_leggings",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().stacksTo(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(45))));

    public static final DeferredHolder<Item, GildedArmorItem> GILDED_NETHERITE_BOOTS = ITEMS.register("gilded_netherite_boots",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, ArmorItem.Type.BOOTS,
                    new Item.Properties().stacksTo(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(45))));

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
