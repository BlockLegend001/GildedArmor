package com.blocklegend001.gildedarmor.item;

import com.blocklegend001.gildedarmor.GildedArmor;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final RegistryKey<ItemGroup> GILDED_ARMOR = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(GildedArmor.MOD_ID, "gildedarmor"));

    public static void registerItemGroup() {
        Registry.register(Registries.ITEM_GROUP, GILDED_ARMOR, FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.GILDED_NETHERITE_HELMET))
                .displayName(Text.translatable("itemGroup.gildedarmortab"))
                .build());
    }
}
