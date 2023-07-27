package com.legopitstop.morefood.block;

import com.legopitstop.morefood.block.cauldron.ModCauldronBehavior;
import net.minecraft.block.AbstractCauldronBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ModSapCauldronBlock extends AbstractCauldronBlock {

    public ModSapCauldronBlock(Settings settings) {
        super(settings, ModCauldronBehavior.SAP_CAULDRON_BEHAVIOR);
    }

    @Override
    protected double getFluidHeight(BlockState state) {
        return 0.9375;
    }

    @Override
    public boolean isFull(BlockState state) {
        return true;
    }

    @Override
    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {return 3;}

}
