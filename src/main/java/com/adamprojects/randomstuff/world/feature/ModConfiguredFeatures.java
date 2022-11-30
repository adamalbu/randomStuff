package com.adamprojects.randomstuff.world.feature;

import com.adamprojects.randomstuff.Randoms;
import com.adamprojects.randomstuff.registry.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static ConfiguredFeature<?, ?> OVERWORLD_WOOL_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    Blocks.WHITE_WOOL.getDefaultState(),
                    9)); // vein size
    
    public static void registerConfiguredFeatures() {
        Randoms.LOGGER.debug("Registering the ModConfiguredFeatures for " + Randoms.MOD_ID);
    }
}
