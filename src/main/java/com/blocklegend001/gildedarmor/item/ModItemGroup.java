package com.blocklegend001.gildedarmor.item;

import com.blocklegend001.gildedarmor.GildedArmor;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static ItemGroup GILDED_ARMOR;

    public static void registerItemGroups() {
        GILDED_ARMOR = FabricItemGroup.builder(new Identifier(GildedArmor.MOD_ID, "gildedarmor"))
                .displayName(Text.translatable("itemGroup.gildedarmor"))
                .icon(() -> new ItemStack(ModItems.GILDED_NETHERITE_HELMET)).build();
    }
}
