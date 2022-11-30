package com.adamprojects.randomstuff.registry;

import com.adamprojects.randomstuff.Items.SapphireItem;
import com.adamprojects.randomstuff.Randoms;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Items
    public static final Item RUBY = new Item(
            new FabricItemSettings()
                    .group(ItemGroup.MATERIALS)

    );

    public static final SapphireItem SAPPHIRE = new SapphireItem();

    //Block Items
    public static final BlockItem RUBY_BLOCK = new BlockItem(
            ModBlocks.RUBY_BLOCK, new FabricItemSettings()
            .group(ItemGroup.BUILDING_BLOCKS)
    );

    public static final BlockItem RUBY_ORE = new BlockItem(
            ModBlocks.RUBY_ORE, new FabricItemSettings()
            .group(ItemGroup.BUILDING_BLOCKS)
    );

    public static final BlockItem DEEPSLATE_RUBY_ORE = new BlockItem(
            ModBlocks.DEEPSLATE_RUBY_ORE, new FabricItemSettings()
            .group(ItemGroup.BUILDING_BLOCKS)
    );

//    public sts

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Randoms.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(Randoms.MOD_ID, "sapphire"), SAPPHIRE);
        Registry.register(Registry.ITEM, new Identifier(Randoms.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Randoms.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(Randoms.MOD_ID, "deepslate_ruby_ore"), DEEPSLATE_RUBY_ORE);
    }
}
