package com.blocklegend001.gildedarmor.item;

import com.blocklegend001.gildedarmor.GildedArmor;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GildedArmor.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {

    public static CreativeModeTab GILDED_ARMOR;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        GILDED_ARMOR = event.registerCreativeModeTab(new ResourceLocation(GildedArmor.MODID, "gilded_armor"),
                builder -> builder.icon(() -> new ItemStack(ModItems.GILDED_NETHERITE_HELMET.get())).title(Component.literal("Immersive Ores")).build());
    }
}
