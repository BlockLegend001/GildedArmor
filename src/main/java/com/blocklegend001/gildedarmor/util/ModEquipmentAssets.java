package com.blocklegend001.gildedarmor.util;

import com.blocklegend001.gildedarmor.GildedArmor;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.function.BiConsumer;

public final class ModEquipmentAssets {
    private static final ResourceKey<? extends Registry<EquipmentAsset>> ROOT_ID = ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));

    public static final ResourceKey<EquipmentAsset> GILDED_NETHERITE = id("gilded_netherite");

    private static ResourceKey<EquipmentAsset> id(String name) {
        return ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(GildedArmor.MODID, name));
    }

    public static void bootstrap(BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> consumer)
    {
        consumer.accept(ModEquipmentAssets.GILDED_NETHERITE, onlyHumanoid("gilded_netherite"));
    }

    private static EquipmentClientInfo onlyHumanoid(String name)
    {
        return EquipmentClientInfo.builder().addHumanoidLayers(Identifier.fromNamespaceAndPath(GildedArmor.MODID, name)).build();
    }
}
