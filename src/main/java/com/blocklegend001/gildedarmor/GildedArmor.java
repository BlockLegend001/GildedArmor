package com.blocklegend001.gildedarmor;

import com.blocklegend001.gildedarmor.item.ModCreativeModeTab;
import com.blocklegend001.gildedarmor.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(GildedArmor.MODID)
public class GildedArmor {

    public static final String MODID = "gildedarmor";

    private static final Logger LOGGER = LogUtils.getLogger();

    public GildedArmor() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        ModItems.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

}
