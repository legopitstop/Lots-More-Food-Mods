package com.legopitstop.morefood.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CompressedBlock extends Block {

    public CompressedBlock() {
        super(Block.Properties.create(Material.ORGANIC)
                .hardnessAndResistance(1.0f, 1.0f)
                .sound(SoundType.WOOD)
                .harvestLevel(0) //1 - wood, 2 - stone, 3 - iron, 4 - diamond, 5 - netherite
                .harvestTool(ToolType.AXE));
    }
}