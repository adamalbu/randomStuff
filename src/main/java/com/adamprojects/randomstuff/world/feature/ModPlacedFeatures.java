package com.adamprojects.randomstuff.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.Arrays;
import java.util.List;

public class ModPlacedFeatures {
    public static PlacedFeature OVERWORLD_WOOL_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(ModConfiguredFeatures.OVERWORLD_WOOL_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(20), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            )); // height
}