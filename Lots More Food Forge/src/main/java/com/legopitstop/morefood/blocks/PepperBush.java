package com.legopitstop.morefood.blocks;

import com.legopitstop.morefood.init.MoreFoodItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class PepperBush extends MoreFoodBush {
    public PepperBush(Properties p_51021_) {
        super(p_51021_);
    }

    @Override
    public ItemStack getCloneItemStack(BlockGetter p_57256_, BlockPos p_57257_, BlockState p_57258_) {
        return new ItemStack(MoreFoodItems.PEPPER_SEEDS.get());
    }

    @Override
    public InteractionResult use(BlockState p_57275_, Level p_57276_, BlockPos p_57277_, Player p_57278_, InteractionHand p_57279_, BlockHitResult p_57280_) {
        int i = p_57275_.getValue(AGE);
        boolean flag = i == 3;
        if (!flag && p_57278_.getItemInHand(p_57279_).is(Items.BONE_MEAL)) {
            return InteractionResult.PASS;
        } else if (i > 1) {
            int j = 1 + p_57276_.random.nextInt(2);

            popResource(p_57276_, p_57277_, new ItemStack(MoreFoodItems.PEPPER.get(), j + (flag ? 1 : 0)));
            p_57276_.playSound((Player)null, p_57277_, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + p_57276_.random.nextFloat() * 0.4F);
            p_57276_.setBlock(p_57277_, p_57275_.setValue(AGE, Integer.valueOf(1)), 2);
            return InteractionResult.sidedSuccess(p_57276_.isClientSide);
        } else {
            return super.use(p_57275_, p_57276_, p_57277_, p_57278_, p_57279_, p_57280_);
        }
    }
}
