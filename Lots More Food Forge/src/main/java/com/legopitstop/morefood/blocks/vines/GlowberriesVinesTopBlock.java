package com.legopitstop.morefood.blocks.vines;

import com.legopitstop.morefood.init.MorefoodBlocks;
import net.minecraft.block.*;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.VoxelShape;

import java.util.Random;

public class GlowberriesVinesTopBlock extends MorefoodAbstractTopPlantBlock {
    protected static final VoxelShape field_235636_e_ = Block.makeCuboidShape(4.0D, 9.0D, 4.0D, 12.0D, 16.0D, 12.0D);

    public GlowberriesVinesTopBlock(AbstractBlock.Properties p_i241194_1_) {
        super(p_i241194_1_, Direction.DOWN, field_235636_e_, false, 0.1D);
    }

    protected int func_230332_a_(Random p_230332_1_) {
        return PlantBlockHelper.func_235515_a_(p_230332_1_);
    }

    protected Block func_230330_d_() {
        return MorefoodBlocks.GLOWBERRIES_VINES_PLANT.get();
    }

    protected boolean func_230334_h_(BlockState p_230334_1_) {
        return PlantBlockHelper.func_235514_a_(p_230334_1_);
    }
}
