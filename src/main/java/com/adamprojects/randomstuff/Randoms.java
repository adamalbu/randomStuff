package com.adamprojects.randomstuff;

import com.adamprojects.randomstuff.registry.ModBlocks;
import com.adamprojects.randomstuff.registry.ModItems;
import com.adamprojects.randomstuff.world.feature.ModConfiguredFeatures;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Randoms implements ModInitializer {

	public static final String MOD_ID = "randoms";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.debug("Initializing " + MOD_ID);
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
}
