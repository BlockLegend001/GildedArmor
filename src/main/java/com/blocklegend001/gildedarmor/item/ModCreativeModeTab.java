package com.blocklegend001.gildedarmor.item;

import com.blocklegend001.gildedarmor.GildedArmor;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            GildedArmor.MODID);

    public static RegistryObject<CreativeModeTab> GILDED_ARMOR = CREATIVE_MODE_TABS.register("gilded_armor", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GILDED_NETHERITE_HELMET.get()))
                    .title(Component.translatable("itemGroup.gildedarmortab")).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
