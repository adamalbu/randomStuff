package com.adamprojects.randomstuff.Items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class SapphireItem extends Item {

    public SapphireItem() {
        super(new FabricItemSettings().group(ItemGroup.MATERIALS));
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {

        // Server: giving/removing, entities/blocks
        // Client: rendering, particle, music/sound

        if (!user.getWorld().isClient()) {
            // Server side
            if (entity.getType() == EntityType.SHEEP){
                // Set sheep color to blue
                SheepEntity sheep = (SheepEntity) entity;
                sheep.setColor(DyeColor.BLUE);
                if (!user.isCreative()) {
                    user.getStackInHand(hand).decrement(1);
                }
                return ActionResult.SUCCESS;
            } else {
                // Send message to chat
                user.sendMessage(Text.literal("That's not a sheep..."));
                return ActionResult.FAIL;
            }
        }

        return super.useOnEntity(stack, user, entity, hand);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block block = world.getBlockState(context.getBlockPos()).getBlock();
        PlayerEntity player = context.getPlayer();

        if (block == Blocks.GRASS_BLOCK) {

            if (!world.isClient()) {
                world.setBlockState(context.getBlockPos(), Blocks.LAPIS_BLOCK.getDefaultState());
                player.getStackInHand(context.getHand()).decrement(1);
            } else {
                player.playSound(SoundEvents.ENTITY_CREEPER_PRIMED, 1.0f, 5.0f);
            }
        }

        return super.useOnBlock(context);
    }
}
