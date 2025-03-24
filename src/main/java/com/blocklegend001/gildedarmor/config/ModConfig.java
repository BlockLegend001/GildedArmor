package com.blocklegend001.gildedarmor.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModConfig {
    private static final File CONFIG_FILE = new File("config/gildedarmor/gildedarmor.toml");

    public static float toughnessValueGildedArmor = 4.0F;
    public static int enchantmentValueGildedArmor = 15;
    public static float knockbackResistanceValueGildedArmor = 0.1F;
    public static int protectionValueGildedBoots = 6;
    public static int protectionValueGildedLeggings = 7;
    public static int protectionValueGildedChestplate = 10;
    public static int protectionValueGildedHelmet = 6;

    public static int durabilityValueGildedBoots = 49;
    public static int durabilityValueGildedLeggings = 45;
    public static int durabilityValueGildedChestplate = 45;
    public static int durabilityValueGildedHelmet = 45;

    public static void loadConfig() {
        File configDir = new File("config/gildedarmor");
        if (!configDir.exists()) {
            configDir.mkdirs();
        }

        if (!CONFIG_FILE.exists()) {
            saveConfig();
        } else {
            try (FileReader reader = new FileReader(CONFIG_FILE)) {
                JsonObject config = JsonParser.parseReader(reader).getAsJsonObject();

                toughnessValueGildedArmor = config.get("toughnessValueGildedArmor").getAsFloat();
                enchantmentValueGildedArmor = config.get("enchantmentValueGildedArmor").getAsInt();
                knockbackResistanceValueGildedArmor = config.get("knockbackResistanceValueGildedArmor").getAsFloat();
                protectionValueGildedBoots = config.get("protectionValueGildedBoots").getAsInt();
                protectionValueGildedLeggings = config.get("protectionValueGildedLeggings").getAsInt();
                protectionValueGildedChestplate = config.get("protectionValueGildedChestplate").getAsInt();
                protectionValueGildedHelmet = config.get("protectionValueGildedHelmet").getAsInt();

                durabilityValueGildedBoots = config.get("durabilityValueGildedBoots").getAsInt();
                durabilityValueGildedLeggings = config.get("durabilityValueGildedLeggings").getAsInt();
                durabilityValueGildedChestplate = config.get("durabilityValueGildedChestplate").getAsInt();
                durabilityValueGildedHelmet = config.get("durabilityValueGildedHelmet").getAsInt();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void saveConfig() {
        JsonObject config = new JsonObject();

        config.addProperty("toughnessValueGildedArmor", toughnessValueGildedArmor);
        config.addProperty("enchantmentValueGildedArmor", enchantmentValueGildedArmor);
        config.addProperty("knockbackResistanceValueGildedArmor", knockbackResistanceValueGildedArmor);
        config.addProperty("protectionValueGildedBoots", protectionValueGildedBoots);
        config.addProperty("protectionValueGildedLeggings", protectionValueGildedLeggings);
        config.addProperty("protectionValueGildedChestplate", protectionValueGildedChestplate);
        config.addProperty("protectionValueGildedHelmet", protectionValueGildedHelmet);

        config.addProperty("durabilityValueGildedBoots", durabilityValueGildedBoots);
        config.addProperty("durabilityValueGildedLeggings", durabilityValueGildedLeggings);
        config.addProperty("durabilityValueGildedChestplate", durabilityValueGildedChestplate);
        config.addProperty("durabilityValueGildedHelmet", durabilityValueGildedHelmet);

        try (FileWriter writer = new FileWriter(CONFIG_FILE)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            writer.write(gson.toJson(config));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}