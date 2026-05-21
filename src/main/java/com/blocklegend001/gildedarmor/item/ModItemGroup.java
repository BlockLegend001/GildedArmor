package com.blocklegend001.gildedarmor.item;

import com.blocklegend001.gildedarmor.GildedArmor;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup {
    public static final CreativeModeTab GILDED_ARMOR = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(GildedArmor.MOD_ID, "gildedarmor"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GILDED_NETHERITE_HELMET))
                    .title(Component.translatable("itemGroup.gildedarmortab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.GILDED_NETHERITE_HELMET);
                        output.accept(ModItems.GILDED_NETHERITE_CHESTPLATE);
                        output.accept(ModItems.GILDED_NETHERITE_LEGGINGS);
                        output.accept(ModItems.GILDED_NETHERITE_BOOTS);
                    }).build());


    public static void registerCreativeModeTabs() {
        GildedArmor.LOGGER.info("Registering Creative Mode Tabs for " + GildedArmor.MOD_ID);
    }
}
