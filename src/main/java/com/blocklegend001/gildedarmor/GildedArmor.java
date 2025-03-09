package com.blocklegend001.gildedarmor;

import com.blocklegend001.gildedarmor.item.ModItemGroup;
import com.blocklegend001.gildedarmor.item.ModItems;
import com.blocklegend001.gildedarmor.util.ModDataComponents;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GildedArmor implements ModInitializer {
    public static final String MOD_ID = "gildedarmor";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final TagKey<Item> GILDED_NETHERITE = TagKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "gilded_netherite"));

    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroup();
        ModDataComponents.DATA_COMPONENET_TYPES.register();
        ModItems.registerModItems();
    }
}