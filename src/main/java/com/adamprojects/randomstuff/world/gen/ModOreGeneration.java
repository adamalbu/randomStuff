package com.adamprojects.randomstuff.world.gen;

import com.adamprojects.randomstuff.world.feature.ModConfiguredFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import com.adamprojects.randomstuff.world.feature.ModPlacedFeatures;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("tutorial", "overworld_wool_ore"), ModConfiguredFeatures.OVERWORLD_WOOL_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("tutorial", "overworld_wool_ore"),
                ModPlacedFeatures.OVERWORLD_WOOL_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier("tutorial", "overworld_wool_ore")));
    }
}