package com.blocklegend001.gildedarmor.datagen;

import com.blocklegend001.gildedarmor.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

import static com.blocklegend001.gildedarmor.GildedArmor.GILDED_NETHERITE;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {

        builder(GILDED_NETHERITE)
                .add(ModItems.GILDED_NETHERITE_HELMET_KEY,
                        ModItems.GILDED_NETHERITE_CHESTPLATE_KEY,
                        ModItems.GILDED_NETHERITE_LEGGINGS_KEY,
                        ModItems.GILDED_NETHERITE_BOOTS_KEY);

        builder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_HELMET_KEY,
                        ModItems.GILDED_NETHERITE_CHESTPLATE_KEY,
                        ModItems.GILDED_NETHERITE_LEGGINGS_KEY,
                        ModItems.GILDED_NETHERITE_BOOTS_KEY);

        builder(ItemTags.EQUIPPABLE_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_HELMET_KEY,
                        ModItems.GILDED_NETHERITE_CHESTPLATE_KEY,
                        ModItems.GILDED_NETHERITE_LEGGINGS_KEY,
                        ModItems.GILDED_NETHERITE_BOOTS_KEY);

        builder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_HELMET_KEY,
                        ModItems.GILDED_NETHERITE_CHESTPLATE_KEY,
                        ModItems.GILDED_NETHERITE_LEGGINGS_KEY,
                        ModItems.GILDED_NETHERITE_BOOTS_KEY);

        builder(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_HELMET_KEY);

        builder(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_BOOTS_KEY);

        builder(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_CHESTPLATE_KEY);

        builder(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_LEGGINGS_KEY);

        builder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.GILDED_NETHERITE_HELMET_KEY,
                        ModItems.GILDED_NETHERITE_CHESTPLATE_KEY,
                        ModItems.GILDED_NETHERITE_LEGGINGS_KEY,
                        ModItems.GILDED_NETHERITE_BOOTS_KEY);
    }
}