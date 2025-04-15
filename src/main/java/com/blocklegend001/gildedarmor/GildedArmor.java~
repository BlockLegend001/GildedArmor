package com.blocklegend001.gildedarmor;

import com.blocklegend001.gildedarmor.item.ModCreativeModeTab;
import com.blocklegend001.gildedarmor.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

@Mod(GildedArmor.MODID)
public class GildedArmor {

    public static final String MODID = "gildedarmor";

    private static final Logger LOGGER = LogUtils.getLogger();
    public static final TagKey<Item> GILDED_ARMOR = TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(), ResourceLocation.fromNamespaceAndPath(MODID, "gilded_armor"));

    public GildedArmor() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, com.blocklegend001.gildedarmor.config.ModConfig.SPEC, "gildedarmor/gildedarmor.toml");
        com.blocklegend001.gildedarmor.config.ModConfig.loadConfig(com.blocklegend001.gildedarmor.config.ModConfig.SPEC, FMLPaths.CONFIGDIR.get().resolve("gildedarmor/gildedarmor.toml"));
        ModCreativeModeTab.register(modEventBus);
        modEventBus.addListener(this::addCreative);
        ModItems.register(modEventBus);
        modEventBus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void setup(final FMLCommonSetupEvent event) {
        com.blocklegend001.gildedarmor.config.ModConfig.loadConfig(com.blocklegend001.gildedarmor.config.ModConfig.SPEC, FMLPaths.CONFIGDIR.get().resolve("gildedarmor/gildedarmor.toml"));
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTab() == ModCreativeModeTab.GILDED_ARMOR.get()) {
            event.accept(ModItems.GILDED_NETHERITE_HELMET);
            event.accept(ModItems.GILDED_NETHERITE_CHESTPLATE);
            event.accept(ModItems.GILDED_NETHERITE_LEGGINGS);
            event.accept(ModItems.GILDED_NETHERITE_BOOTS);
        }
    }
}