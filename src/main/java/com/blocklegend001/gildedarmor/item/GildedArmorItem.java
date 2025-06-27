package com.blocklegend001.gildedarmor.item;

import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.Equippable;

import java.util.function.Consumer;

public class GildedArmorItem extends Item {

    public GildedArmorItem(ArmorMaterial material, ArmorType type, Properties settings) {
        super(computeSettings(material, type, settings));
    }

    private static Properties computeSettings(ArmorMaterial material, ArmorType type, Properties settings) {
        settings.humanoidArmor(material, ArmorType.BODY)
                .attributes(material.createAttributes(type))
                .enchantable(material.enchantmentValue())
                .component(DataComponents.EQUIPPABLE, Equippable.builder(type.getSlot()).setEquipSound(material.equipSound()).setAsset(material.assetId()).build());
        return settings;
    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack p_41421_, TooltipContext p_333372_, TooltipDisplay p_396484_, Consumer<Component> p_392123_, TooltipFlag p_41424_) {
        super.appendHoverText(p_41421_, p_333372_, p_396484_, p_392123_, p_41424_);
        p_392123_.accept(Component.translatable("tooltip.gildedarmor.description").withStyle(ChatFormatting.GOLD));
    }
}