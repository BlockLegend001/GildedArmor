package com.blocklegend001.gildedarmor.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;

public class ModConfig {
    public static final ForgeConfigSpec.Builder mycfg = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec.IntValue ProtectionValueGildedBoots = mycfg
            .comment("Protection Value of Gilded Boots")
            .defineInRange("ProtectionValueGildedBoots", 6, 0, Integer.MAX_VALUE);

    public static final ForgeConfigSpec.IntValue ProtectionValueGildedLeggings = mycfg
            .comment("Protection Value of Gilded Leggings")
            .defineInRange("ProtectionValueGildedLeggings", 7, 0, Integer.MAX_VALUE);

    public static final ForgeConfigSpec.IntValue ProtectionValueGildedChestplate = mycfg
            .comment("Protection Value of Gilded Chestplate")
            .defineInRange("ProtectionValueGildedChestplate", 10, 0, Integer.MAX_VALUE);

    public static final ForgeConfigSpec.IntValue ProtectionValueGildedHelmet = mycfg
            .comment("Protection Value of Gilded Helmet")
            .defineInRange("ProtectionValueGildedHelmet", 6, 0, Integer.MAX_VALUE);

    public static final ForgeConfigSpec.IntValue EnchantmentValueGildedArmor = mycfg
            .comment("Enchantment Value of Gilded Armor")
            .defineInRange("EnchantmentValueGildedArmor", 15, 0, Integer.MAX_VALUE);

    public static final ForgeConfigSpec.FloatValue ToughnessValueGildedArmor = mycfg
            .comment("Toughness Value of Gilded Armor")
            .defineInRange("ToughnessValueGildedArmor", 4.0F, 0.0F, Float.MAX_VALUE);

    public static final ForgeConfigSpec.FloatValue KnockbackResistanceValueGildedArmor = mycfg
            .comment("Knockback Resistance Value of Gilded Armor")
            .defineInRange("KnockbackResistanceValueGildedArmor", 0.1F, 0.0F, Float.MAX_VALUE);

    public static final ForgeConfigSpec.IntValue DurabilityValueGildedBoots = mycfg
            .comment("Durability Value of Gilded Boots")
            .defineInRange("DurabilityValueGildedBoots", 49, 0, Integer.MAX_VALUE);

    public static final ForgeConfigSpec.IntValue DurabilityValueGildedLeggings = mycfg
            .comment("Durability Value of Gilded Leggings")
            .defineInRange("DurabilityValueGildedLeggings", 45, 0, Integer.MAX_VALUE);

    public static final ForgeConfigSpec.IntValue DurabilityValueGildedChestplate = mycfg
            .comment("Durability Value of Gilded Chestplate")
            .defineInRange("DurabilityValueGildedChestplate", 45, 0, Integer.MAX_VALUE);

    public static final ForgeConfigSpec.IntValue DurabilityValueGildedHelmet = mycfg
            .comment("Durability Value of Gilded Helmet")
            .defineInRange("DurabilityValueGildedHelmet", 49, 0, Integer.MAX_VALUE);

    public static ForgeConfigSpec SPEC = mycfg.build();

    public static int protectionValueGildedBoots;
    public static int protectionValueGildedLeggings;
    public static int protectionValueGildedChestplate;
    public static int protectionValueGildedHelmet;
    public static int enchantmentValueGildedArmor;
    public static float toughnessValueGildedArmor;
    public static float knockbackResistanceValueGildedArmor;
    public static int durabilityValueGildedBoots;
    public static int durabilityValueGildedLeggings;
    public static int durabilityValueGildedChestplate;
    public static int durabilityValueGildedHelmet;

    public static void loadConfig(ForgeConfigSpec spec, Path path) {
        final CommentedFileConfig config = CommentedFileConfig.builder(path).sync().autoreload().build();
        config.load();
        spec.setConfig(config);

        protectionValueGildedBoots = ProtectionValueGildedBoots.get();
        protectionValueGildedLeggings = ProtectionValueGildedLeggings.get();
        protectionValueGildedChestplate = ProtectionValueGildedChestplate.get();
        protectionValueGildedHelmet = ProtectionValueGildedHelmet.get();
        enchantmentValueGildedArmor = EnchantmentValueGildedArmor.get();
        toughnessValueGildedArmor = ToughnessValueGildedArmor.get();
        knockbackResistanceValueGildedArmor = KnockbackResistanceValueGildedArmor.get();
        durabilityValueGildedBoots = DurabilityValueGildedBoots.get();
        durabilityValueGildedLeggings = DurabilityValueGildedLeggings.get();
        durabilityValueGildedChestplate = DurabilityValueGildedChestplate.get();
        durabilityValueGildedHelmet = DurabilityValueGildedHelmet.get();
    }
}
