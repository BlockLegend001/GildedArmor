package com.blocklegend001.gildedarmor.mixin;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static com.blocklegend001.gildedarmor.GildedArmor.GILDED_NETHERITE;

@Mixin(PiglinBrain.class)
public abstract class PiglinMixin {
    @Inject(method = "isWearingPiglinSafeArmor", at = @At("HEAD"), cancellable = true)
    private static void isWearingGold(LivingEntity entity, CallbackInfoReturnable<Boolean> cir) {
        for (EquipmentSlot slot : EquipmentSlot.values()) {
            if (slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR) {
                ItemStack stack = entity.getEquippedStack(slot);
                if (stack.isIn(GILDED_NETHERITE)) {
                    cir.setReturnValue(true);
                    return;
                }
            }
        }
    }
}