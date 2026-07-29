package com.blocklegend001.gildedarmor.datagen;

import com.blocklegend001.gildedarmor.GildedArmor;
import com.blocklegend001.gildedarmor.items.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.VanillaItemTagsProvider;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends VanillaItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(packOutput, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(GildedArmor.GILDED_ARMOR)
                .add(ModItems.GILDED_NETHERITE_BOOTS.getKey())
                .add(ModItems.GILDED_NETHERITE_CHESTPLATE.getKey())
                .add(ModItems.GILDED_NETHERITE_HELMET.getKey())
                .add(ModItems.GILDED_NETHERITE_LEGGINGS.getKey());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.GILDED_NETHERITE_BOOTS.getKey())
                .add(ModItems.GILDED_NETHERITE_CHESTPLATE.getKey())
                .add(ModItems.GILDED_NETHERITE_HELMET.getKey())
                .add(ModItems.GILDED_NETHERITE_LEGGINGS.getKey());

        this.tag(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_BOOTS.getKey())
                .add(ModItems.GILDED_NETHERITE_CHESTPLATE.getKey())
                .add(ModItems.GILDED_NETHERITE_HELMET.getKey())
                .add(ModItems.GILDED_NETHERITE_LEGGINGS.getKey());

        this.tag(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_BOOTS.getKey())
                .add(ModItems.GILDED_NETHERITE_CHESTPLATE.getKey())
                .add(ModItems.GILDED_NETHERITE_HELMET.getKey())
                .add(ModItems.GILDED_NETHERITE_LEGGINGS.getKey());

        this.tag(ItemTags.EQUIPPABLE_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_BOOTS.getKey())
                .add(ModItems.GILDED_NETHERITE_CHESTPLATE.getKey())
                .add(ModItems.GILDED_NETHERITE_HELMET.getKey())
                .add(ModItems.GILDED_NETHERITE_LEGGINGS.getKey());

        this.tag(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_BOOTS.getKey());

        this.tag(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_HELMET.getKey());

        this.tag(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_LEGGINGS.getKey());

        this.tag(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_CHESTPLATE.getKey());
    }
}
