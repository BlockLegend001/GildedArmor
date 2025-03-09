package com.blocklegend001.gildedarmor.datagen;

import com.blocklegend001.gildedarmor.GildedArmor;
import com.blocklegend001.gildedarmor.items.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.item.equipment.trim.TrimPattern;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;

import javax.annotation.Nonnull;
import java.util.List;

public class ModItemModelProvider extends ItemModelProvider {
    private static final ResourceLocation GENERATED = ResourceLocation.parse("item/generated");

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GildedArmor.MODID, existingFileHelper);
    }

    @Nonnull
    @Override
    public String getName() {
        return "GildedArmor Item Models";
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.GILDED_NETHERITE_HELMET, modid("item/gilded_netherite_helmet"));
        simpleItem(ModItems.GILDED_NETHERITE_CHESTPLATE, modid("item/gilded_netherite_chestplate"));
        simpleItem(ModItems.GILDED_NETHERITE_LEGGINGS, modid("item/gilded_netherite_leggings"));
        simpleItem(ModItems.GILDED_NETHERITE_BOOTS, modid("item/gilded_netherite_boots"));
    }

    private ItemModelBuilder simpleItem(DeferredHolder<Item, ? extends Item> item, String... textures) {
        return simpleItem(item.getId(), textures);
    }

    private ItemModelBuilder simpleItem(ResourceLocation itemKey, String... textures) {
        ItemModelBuilder builder = withExistingParent(itemKey.getPath(), GENERATED);
        for (int i = 0; i < textures.length; i++) {
            builder.texture("layer" + i, textures[i]);
        }
        return builder;
    }

    private ItemModelBuilder simpleItemVariant(DeferredHolder<Item, ? extends Item> item, String suffix, String... textures) {
        ItemModelBuilder builder = withExistingParent(item.getId().getPath() + suffix, GENERATED);
        for (int i = 0; i < textures.length; i++) {
            builder.texture("layer" + i, textures[i]);
        }
        return builder;
    }

    static String modid(String s, Object... args) {
        return GildedArmor.MODID + ":" + String.format(s, args);
    }
}