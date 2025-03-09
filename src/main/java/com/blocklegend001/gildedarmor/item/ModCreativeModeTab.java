package com.blocklegend001.gildedarmor.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab GILDEDARMOR_TAB = new CreativeModeTab("gildedarmortab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GILDED_NETHERITE_HELMET.get());
        }
    };
}