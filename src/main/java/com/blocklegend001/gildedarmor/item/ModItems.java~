package com.blocklegend001.gildedarmor.item;

import com.blocklegend001.gildedarmor.GildedArmor;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GildedArmor.MODID);

    public static final RegistryObject<Item> GILDED_NETHERITE_HELMET = ITEMS.register("gilded_netherite_helmet",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, ArmorItem.Type.HELMET,
                    new Item.Properties().stacksTo(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(49))));

    public static final RegistryObject<Item> GILDED_NETHERITE_CHESTPLATE = ITEMS.register("gilded_netherite_chestplate",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().stacksTo(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(45))));

    public static final RegistryObject<Item> GILDED_NETHERITE_LEGGINGS = ITEMS.register("gilded_netherite_leggings",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().stacksTo(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(45))));

    public static final RegistryObject<Item> GILDED_NETHERITE_BOOTS = ITEMS.register("gilded_netherite_boots",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, ArmorItem.Type.BOOTS,
                    new Item.Properties().stacksTo(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(45))));

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}

