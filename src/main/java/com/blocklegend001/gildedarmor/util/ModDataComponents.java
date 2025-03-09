package com.blocklegend001.gildedarmor.util;

import com.mojang.serialization.Codec;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.component.ComponentType;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.registry.RegistryKeys;

import java.util.function.UnaryOperator;

public class ModDataComponents {
    public static final DeferredRegister<ComponentType<?>> DATA_COMPONENET_TYPES = DeferredRegister.create("gildedarmor", RegistryKeys.DATA_COMPONENT_TYPE);

    public static RegistrySupplier<ComponentType<Boolean>> GILDED_ARMOR;

    static {
        GILDED_ARMOR = register("gilded_netherite", builder -> builder.codec((Codec) Codec.BOOL).packetCodec(PacketCodecs.BOOLEAN));
    }

    public static <T> RegistrySupplier<ComponentType<T>> register(String name, UnaryOperator<ComponentType.Builder<T>> unaryOperator) {
        return DATA_COMPONENET_TYPES.register(name, () -> ((ComponentType.Builder) unaryOperator.apply(ComponentType.builder())).build());
    }
}