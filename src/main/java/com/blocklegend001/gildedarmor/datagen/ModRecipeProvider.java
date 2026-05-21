package com.blocklegend001.gildedarmor.datagen;

import com.blocklegend001.gildedarmor.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.NETHERITE_HELMET),
                                Ingredient.of(Items.GOLD_INGOT),
                                RecipeCategory.COMBAT,
                                ModItems.GILDED_NETHERITE_HELMET
                        ).unlocks(getHasName(Items.NETHERITE_HELMET), has(Items.NETHERITE_HELMET))
                        .save(output, "gilded_netherite_helmet");

                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.NETHERITE_CHESTPLATE),
                                Ingredient.of(Items.GOLD_INGOT),
                                RecipeCategory.COMBAT,
                                ModItems.GILDED_NETHERITE_CHESTPLATE
                        ).unlocks(getHasName(Items.NETHERITE_CHESTPLATE), has(Items.NETHERITE_CHESTPLATE))
                        .save(output, "gilded_netherite_chestplate");

                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.NETHERITE_LEGGINGS),
                                Ingredient.of(Items.GOLD_INGOT),
                                RecipeCategory.COMBAT,
                                ModItems.GILDED_NETHERITE_LEGGINGS
                        ).unlocks(getHasName(Items.NETHERITE_LEGGINGS), has(Items.NETHERITE_LEGGINGS))
                        .save(output, "gilded_netherite_leggings");

                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(Items.NETHERITE_BOOTS),
                                Ingredient.of(Items.GOLD_INGOT),
                                RecipeCategory.COMBAT,
                                ModItems.GILDED_NETHERITE_BOOTS
                        ).unlocks(getHasName(Items.NETHERITE_BOOTS), has(Items.NETHERITE_BOOTS))
                        .save(output, "gilded_netherite_boots");
            }
        };
    }

    @Override
    public String getName() {
        return "Gilded Armor Recipes";
    }
}