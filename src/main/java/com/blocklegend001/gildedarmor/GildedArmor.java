package com.blocklegend001.gildedarmor;

import com.blocklegend001.gildedarmor.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GildedArmor implements ModInitializer {
    public static final String MOD_ID = "gildedarmor";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final TagKey<Item> GILDED_NETHERITE = TagKey.of(Registry.ITEM_KEY, new Identifier(MOD_ID, "gilded_netherite"));

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
