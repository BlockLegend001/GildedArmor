package com.blocklegend001.gildedarmor.datagen;

import com.blocklegend001.gildedarmor.GildedArmor;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = GildedArmor.MODID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper helper = event.getExistingFileHelper();

        ModBlockTagGenerator blockTagsProvider = new ModBlockTagGenerator(packOutput, lookupProvider, GildedArmor.MODID, helper);
        ModItemTagGenerator itemTagsProvider = new ModItemTagGenerator(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), helper);
        ModItemModelProvider itemModelProvider = new ModItemModelProvider(packOutput, helper);
        ModEquipmentAssetProvider equipmentAssetProvider = new ModEquipmentAssetProvider(packOutput, GildedArmor.MODID);

        event.addProvider(blockTagsProvider);
        event.addProvider(itemTagsProvider);
        event.addProvider(itemModelProvider);
        event.addProvider(equipmentAssetProvider);
    }
}