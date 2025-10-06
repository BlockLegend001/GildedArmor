package com.blocklegend001.gildedarmor.datagen;

import com.blocklegend001.gildedarmor.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

import static com.blocklegend001.gildedarmor.GildedArmor.GILDED_NETHERITE;

public class ModItemTagsGeneration extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsGeneration(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataOutput, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        valueLookupBuilder(GILDED_NETHERITE)
                .add(ModItems.GILDED_NETHERITE_HELMET,
                        ModItems.GILDED_NETHERITE_CHESTPLATE,
                        ModItems.GILDED_NETHERITE_LEGGINGS,
                        ModItems.GILDED_NETHERITE_BOOTS);

        valueLookupBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_HELMET,
                        ModItems.GILDED_NETHERITE_CHESTPLATE,
                        ModItems.GILDED_NETHERITE_LEGGINGS,
                        ModItems.GILDED_NETHERITE_BOOTS);

        valueLookupBuilder(ItemTags.EQUIPPABLE_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_HELMET,
                        ModItems.GILDED_NETHERITE_CHESTPLATE,
                        ModItems.GILDED_NETHERITE_LEGGINGS,
                        ModItems.GILDED_NETHERITE_BOOTS);

        valueLookupBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_HELMET,
                        ModItems.GILDED_NETHERITE_CHESTPLATE,
                        ModItems.GILDED_NETHERITE_LEGGINGS,
                        ModItems.GILDED_NETHERITE_BOOTS);

        valueLookupBuilder(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_HELMET);

        valueLookupBuilder(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_BOOTS);

        valueLookupBuilder(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_CHESTPLATE);

        valueLookupBuilder(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(ModItems.GILDED_NETHERITE_LEGGINGS);

        valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.GILDED_NETHERITE_HELMET,
                        ModItems.GILDED_NETHERITE_CHESTPLATE,
                        ModItems.GILDED_NETHERITE_LEGGINGS,
                        ModItems.GILDED_NETHERITE_BOOTS);
    }
}