package com.blocklegend001.gildedarmor.datagen;

import com.blocklegend001.gildedarmor.item.ModItems;
import com.blocklegend001.gildedarmor.util.ModEquipmentAssets;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        registerArmor(ModItems.GILDED_NETHERITE_HELMET, itemModelGenerator, ModEquipmentAssets.GILDED_NETHERITE);
        registerArmor(ModItems.GILDED_NETHERITE_CHESTPLATE, itemModelGenerator, ModEquipmentAssets.GILDED_NETHERITE);
        registerArmor(ModItems.GILDED_NETHERITE_LEGGINGS, itemModelGenerator, ModEquipmentAssets.GILDED_NETHERITE);
        registerArmor(ModItems.GILDED_NETHERITE_BOOTS, itemModelGenerator, ModEquipmentAssets.GILDED_NETHERITE);
    }

    public void registerArmor(Item item, ItemModelGenerator itemModels, RegistryKey<EquipmentAsset> equipmentKey)
    {
        Identifier id = Registries.ITEM.getId(item);
        Identifier armorType = null;
        if (id.getPath().contains("helmet"))
            armorType = ItemModelGenerator.HELMET_TRIM_ID_PREFIX;
        else if (id.getPath().contains("chestplate"))
            armorType = ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX;
        else if (id.getPath().contains("leggings"))
            armorType = ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX;
        else if (id.getPath().contains("boots"))
            armorType = ItemModelGenerator.BOOTS_TRIM_ID_PREFIX;
        itemModels.registerArmor(item, equipmentKey, armorType, false);
    }
}
