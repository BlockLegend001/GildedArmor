package com.blocklegend001.gildedarmor.datagen;

import com.blocklegend001.gildedarmor.item.ModItems;
import com.blocklegend001.gildedarmor.util.ModEquipmentAssets;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.registerArmor(ModItems.GILDED_NETHERITE_HELMET, ModEquipmentAssets.GILDED_NETHERITE,
                "gilded_netherite", false);

        itemModelGenerator.registerArmor(ModItems.GILDED_NETHERITE_CHESTPLATE, ModEquipmentAssets.GILDED_NETHERITE,
                "gilded_netherite", false);

        itemModelGenerator.registerArmor(ModItems.GILDED_NETHERITE_LEGGINGS, ModEquipmentAssets.GILDED_NETHERITE,
                "gilded_netherite", false);

        itemModelGenerator.registerArmor(ModItems.GILDED_NETHERITE_BOOTS, ModEquipmentAssets.GILDED_NETHERITE,
                "gilded_netherite", false);
    }
}
