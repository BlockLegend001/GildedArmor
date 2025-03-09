package com.blocklegend001.gildedarmor;

import com.blocklegend001.gildedarmor.items.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(GildedArmor.MODID)
public class GildedArmor {
    public static final String MODID = "gildedarmor";

    public static final TagKey<Item> GILDED_ARMOR = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, "gilded_armor"));

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> GILDEDARMOR = CREATIVE_MODE_TABS.register("gildedarmor",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.gildedarmortab"))
            .icon(() -> ModItems.GILDED_NETHERITE_HELMET.get().getDefaultInstance()).displayItems((parameters, output) -> {
        output.accept(ModItems.GILDED_NETHERITE_HELMET.get());
        output.accept(ModItems.GILDED_NETHERITE_CHESTPLATE.get());
        output.accept(ModItems.GILDED_NETHERITE_LEGGINGS.get());
        output.accept(ModItems.GILDED_NETHERITE_BOOTS.get());
    }).build());

    public GildedArmor(IEventBus modEventBus) {
        ModItems.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
