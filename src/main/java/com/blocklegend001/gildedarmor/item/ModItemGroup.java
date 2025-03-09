package com.blocklegend001.gildedarmor.item;

import com.blocklegend001.gildedarmor.GildedArmor;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup GILDED_ARMOR = FabricItemGroupBuilder.build(
            new Identifier(GildedArmor.MOD_ID, "gildedarmortab"), ()-> new ItemStack(ModItems.GILDED_NETHERITE_HELMET));
}
