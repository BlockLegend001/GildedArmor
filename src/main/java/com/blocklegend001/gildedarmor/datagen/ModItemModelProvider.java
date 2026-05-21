package com.blocklegend001.gildedarmor.datagen;

import com.blocklegend001.gildedarmor.items.ModItems;
import com.blocklegend001.gildedarmor.util.ModEquipmentAssets;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.EquipmentAsset;

public class ModItemModelProvider extends ModelProvider {
    public ModItemModelProvider(PackOutput packOutput, String modId) {
        super(packOutput, modId);
    }

    protected void registerModels(BlockModelGenerators blockModelGenerators, ItemModelGenerators itemModels) {
        armorModel(itemModels, ModItems.GILDED_NETHERITE_HELMET.get(), ModEquipmentAssets.GILDED_NETHERITE);
        armorModel(itemModels, ModItems.GILDED_NETHERITE_CHESTPLATE.get(), ModEquipmentAssets.GILDED_NETHERITE);
        armorModel(itemModels, ModItems.GILDED_NETHERITE_LEGGINGS.get(), ModEquipmentAssets.GILDED_NETHERITE);
        armorModel(itemModels, ModItems.GILDED_NETHERITE_BOOTS.get(), ModEquipmentAssets.GILDED_NETHERITE);
    }

    public void armorModel(ItemModelGenerators itemModels, Item item, ResourceKey<EquipmentAsset> equipmentKey) {
        Identifier id = BuiltInRegistries.ITEM.getKey(item);
        String armorType = "";
        if (id.getPath().contains("helmet"))
            armorType = "helmet";
        else if (id.getPath().contains("chestplate"))
            armorType = "chestplate";
        else if (id.getPath().contains("leggings"))
            armorType = "leggings";
        else if (id.getPath().contains("boots"))
            armorType = "boots";
        itemModels.generateTrimmableItem(item, equipmentKey, Identifier.withDefaultNamespace("trims/items/" + armorType + "_trim"), false);
    }
}