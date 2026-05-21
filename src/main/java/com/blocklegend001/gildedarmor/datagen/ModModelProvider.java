package com.blocklegend001.gildedarmor.datagen;

import com.blocklegend001.gildedarmor.item.ModArmorMaterial;
import com.blocklegend001.gildedarmor.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateTrimmableItem(ModItems.GILDED_NETHERITE_HELMET, ModArmorMaterial.GILDED_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerator.generateTrimmableItem(ModItems.GILDED_NETHERITE_LEGGINGS, ModArmorMaterial.GILDED_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerator.generateTrimmableItem(ModItems.GILDED_NETHERITE_CHESTPLATE, ModArmorMaterial.GILDED_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerator.generateTrimmableItem(ModItems.GILDED_NETHERITE_BOOTS, ModArmorMaterial.GILDED_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
    }
}
