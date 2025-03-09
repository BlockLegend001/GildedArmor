package com.blocklegend001.gildedarmor.items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.List;

public class GildedArmorItem extends ArmorItem {

    public GildedArmorItem(ArmorMaterial p_371793_, ArmorType p_371848_, Properties p_40388_) {
        super(p_371793_, p_371848_, p_40388_);
    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
        {
            tooltip.add(Component.translatable("tooltip.gildedarmor.description").withStyle(ChatFormatting.GOLD));
        }
    }
}
