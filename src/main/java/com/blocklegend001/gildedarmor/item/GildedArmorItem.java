package com.blocklegend001.gildedarmor.item;

import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class GildedArmorItem extends ArmorItem {


    public GildedArmorItem(Holder<ArmorMaterial> p_329451_, Type p_266831_, Properties p_40388_) {
        super(p_329451_, p_266831_, p_40388_);
    }

    @Override
    public boolean isEnchantable(ItemStack p_41456_) {
        return true;
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
