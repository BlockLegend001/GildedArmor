package com.blocklegend001.gildedarmor.util;

import com.blocklegend001.gildedarmor.GildedArmor;
import net.minecraft.client.render.entity.equipment.EquipmentModel;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class ModEquipmentAssets {
    private static final RegistryKey<? extends Registry<EquipmentAsset>> ROOT_ID = RegistryKey.ofRegistry(Identifier.of("equipment_asset"));

    public static final RegistryKey<EquipmentAsset> GILDED_NETHERITE = id("gilded_netherite");

    private static RegistryKey<EquipmentAsset> id(String name) {
        return RegistryKey.of(ROOT_ID, Identifier.of(GildedArmor.MOD_ID, name));
    }

    public static void bootstrap(BiConsumer<RegistryKey<EquipmentAsset>, EquipmentModel> consumer) {
        consumer.accept(ModEquipmentAssets.GILDED_NETHERITE, onlyHumanoid("gilded_netherite"));
    }

    private static EquipmentModel onlyHumanoid(String name) {
        return EquipmentModel.builder().addHumanoidLayers(Identifier.of(GildedArmor.MOD_ID, name)).build();
    }
}
