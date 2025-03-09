package com.blocklegend001.gildedarmor.mixin;

import com.blocklegend001.gildedarmor.util.ModDataComponents;
import net.minecraft.component.ComponentType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({PiglinBrain.class})
public abstract class PiglinMixin {
    @Inject(method = {"isWearingPiglinSafeArmor"}, at = {@At("HEAD")}, cancellable = true)
    private static void isWearingGold(LivingEntity entity, CallbackInfoReturnable<Boolean> cir) {
        for (ItemStack stack : entity.getArmorItems()) {
            if (((Boolean)stack.getOrDefault((ComponentType)ModDataComponents.GILDED_ARMOR.get(), Boolean.valueOf(false))).booleanValue())
                cir.setReturnValue(Boolean.valueOf(true));
        }
    }
}
