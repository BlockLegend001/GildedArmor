package com.blocklegend001.gildedarmor;

import com.blocklegend001.gildedarmor.config.ModConfig;
import com.blocklegend001.gildedarmor.item.ModItemGroup;
import com.blocklegend001.gildedarmor.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GildedArmor implements ModInitializer {
    public static final String MOD_ID = "gildedarmor";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final TagKey<Item> GILDED_NETHERITE = TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, "gilded_netherite"));

    @Override
    public void onInitialize() {
        ModConfig.loadConfig();
        ModItemGroup.registerCreativeModeTabs();
        ModItems.registerModItems();
    }
}