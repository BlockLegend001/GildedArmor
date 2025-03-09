package com.blocklegend001.gildedarmor.datagen;

import com.blocklegend001.gildedarmor.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItem(Items.NETHERITE_HELMET),
                        Ingredient.ofItem(Items.GOLD_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.GILDED_NETHERITE_HELMET
                ).criterion(hasItem(Items.NETHERITE_HELMET), conditionsFromItem(Items.NETHERITE_HELMET))
                        .offerTo(exporter, "gilded_netherite_helmet");

                SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItem(Items.NETHERITE_CHESTPLATE),
                        Ingredient.ofItem(Items.GOLD_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.GILDED_NETHERITE_CHESTPLATE
                ).criterion(hasItem(Items.NETHERITE_CHESTPLATE), conditionsFromItem(Items.NETHERITE_CHESTPLATE))
                        .offerTo(exporter, "gilded_netherite_chestplate");

                SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItem(Items.NETHERITE_LEGGINGS),
                        Ingredient.ofItem(Items.GOLD_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.GILDED_NETHERITE_LEGGINGS
                ).criterion(hasItem(Items.NETHERITE_LEGGINGS), conditionsFromItem(Items.NETHERITE_LEGGINGS))
                        .offerTo(exporter, "gilded_netherite_leggings");

                SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItem(Items.NETHERITE_BOOTS),
                        Ingredient.ofItem(Items.GOLD_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.GILDED_NETHERITE_BOOTS
                ).criterion(hasItem(Items.NETHERITE_BOOTS), conditionsFromItem(Items.NETHERITE_BOOTS))
                        .offerTo(exporter, "gilded_netherite_boots");
            }
        };
    }

    @Override
    public String getName() {
        return "Gilded Armor Recipes";
    }
}
