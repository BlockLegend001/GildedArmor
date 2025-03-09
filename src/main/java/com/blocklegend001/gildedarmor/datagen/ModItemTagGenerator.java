package com.blocklegend001.gildedarmor.datagen;

import com.blocklegend001.gildedarmor.GildedArmor;
import com.blocklegend001.gildedarmor.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                               CompletableFuture<TagLookup<Block>> lookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {

        super(packOutput, completableFuture, lookupCompletableFuture, GildedArmor.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(GildedArmor.GILDED_ARMOR)
                .add(ModItems.GILDED_NETHERITE_BOOTS.get())
                .add(ModItems.GILDED_NETHERITE_CHESTPLATE.get())
                .add(ModItems.GILDED_NETHERITE_HELMET.get())
                .add(ModItems.GILDED_NETHERITE_LEGGINGS.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.GILDED_NETHERITE_BOOTS.get())
                .add(ModItems.GILDED_NETHERITE_CHESTPLATE.get())
                .add(ModItems.GILDED_NETHERITE_HELMET.get())
                .add(ModItems.GILDED_NETHERITE_LEGGINGS.get());

        this.tag(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_BOOTS.get())
                .add(ModItems.GILDED_NETHERITE_CHESTPLATE.get())
                .add(ModItems.GILDED_NETHERITE_HELMET.get())
                .add(ModItems.GILDED_NETHERITE_LEGGINGS.get());

        this.tag(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_BOOTS.get())
                .add(ModItems.GILDED_NETHERITE_CHESTPLATE.get())
                .add(ModItems.GILDED_NETHERITE_HELMET.get())
                .add(ModItems.GILDED_NETHERITE_LEGGINGS.get());

        this.tag(ItemTags.EQUIPPABLE_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_BOOTS.get())
                .add(ModItems.GILDED_NETHERITE_CHESTPLATE.get())
                .add(ModItems.GILDED_NETHERITE_HELMET.get())
                .add(ModItems.GILDED_NETHERITE_LEGGINGS.get());

        this.tag(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_BOOTS.get());

        this.tag(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_HELMET.get());

        this.tag(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_LEGGINGS.get());

        this.tag(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_CHESTPLATE.get());
    }
}
