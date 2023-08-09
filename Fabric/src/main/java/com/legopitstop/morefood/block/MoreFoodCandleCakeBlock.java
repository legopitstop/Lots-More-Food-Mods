package com.legopitstop.morefood.block;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.legopitstop.morefood.registry.MoreFoodBlocks;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Map;

public class MoreFoodCandleCakeBlock extends AbstractCandleBlock {
    public static final BooleanProperty LIT;
    protected static final VoxelShape CAKE_SHAPE;
    protected static final VoxelShape CANDLE_SHAPE;
    protected static final VoxelShape SHAPE;
    private static final Iterable<Vec3d> PARTICLE_OFFSETS;
    private final Block BASE_CAKE_BLOCK;

    public MoreFoodCandleCakeBlock(Block cake, Block candle, Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(LIT, false));
        this.BASE_CAKE_BLOCK = cake;
    }

    public Block getBaseCakeBlock() {
        return this.BASE_CAKE_BLOCK;
    }

    protected Iterable<Vec3d> getParticleOffsets(BlockState state) {
        return PARTICLE_OFFSETS;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (!itemStack.isOf(Items.FLINT_AND_STEEL) && !itemStack.isOf(Items.FIRE_CHARGE)) {
            if (isHittingCandle(hit) && player.getStackInHand(hand).isEmpty() && (Boolean)state.get(LIT)) {
                extinguish(player, state, world, pos);
                return ActionResult.success(world.isClient);
            } else {
                ActionResult actionResult = MoreFoodCakeBlock.tryEat(world, pos, this.getBaseCakeBlock().getDefaultState(), player);
                if (actionResult.isAccepted()) {
                    dropStacks(state, world, pos);
                }

                return actionResult;
            }
        } else {
            setLit(world, state, pos, true);
            if (itemStack.isOf(Items.FLINT_AND_STEEL)) {
                world.playSound((PlayerEntity)null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
            } else {
                world.playSound((PlayerEntity)null, pos, SoundEvents.ITEM_FIRECHARGE_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
            }
            return ActionResult.success(world.isClient);
        }
    }

    private static boolean isHittingCandle(BlockHitResult hitResult) {
        return hitResult.getPos().y - (double)hitResult.getBlockPos().getY() > 0.5;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{LIT});
    }

    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(this.getBaseCakeBlock());
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return direction == Direction.DOWN && !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return world.getBlockState(pos.down()).isSolid();
    }

    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        return CakeBlock.DEFAULT_COMPARATOR_OUTPUT;
    }

    public boolean hasComparatorOutput(BlockState state) {
        return true;
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    // This should get refactored to be more dynamic.
    public static BlockState getCandleCakeFromCandle(Block candle, Block cakeBlock) {
        Map<Block, Block> CANDLES_TO_CANDLE_CAKES = Maps.newHashMap();
        if (cakeBlock == MoreFoodBlocks.CHOCOLATE_CAKE) {
            CANDLES_TO_CANDLE_CAKES.put(Blocks.CANDLE, MoreFoodBlocks.CANDLE_CHOCOLATE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.WHITE_CANDLE, MoreFoodBlocks.WHITE_CANDLE_CHOCOLATE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.ORANGE_CANDLE, MoreFoodBlocks.ORANGE_CANDLE_CHOCOLATE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.MAGENTA_CANDLE, MoreFoodBlocks.MAGENTA_CANDLE_CHOCOLATE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.LIGHT_BLUE_CANDLE, MoreFoodBlocks.LIGHT_BLUE_CANDLE_CHOCOLATE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.YELLOW_CANDLE, MoreFoodBlocks.YELLOW_CANDLE_CHOCOLATE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.LIME_CANDLE, MoreFoodBlocks.LIME_CANDLE_CHOCOLATE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.PINK_CANDLE, MoreFoodBlocks.PINK_CANDLE_CHOCOLATE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.GRAY_CANDLE, MoreFoodBlocks.GRAY_CANDLE_CHOCOLATE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.LIGHT_GRAY_CANDLE, MoreFoodBlocks.LIGHT_GRAY_CANDLE_CHOCOLATE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.CYAN_CANDLE, MoreFoodBlocks.CYAN_CANDLE_CHOCOLATE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.PURPLE_CANDLE, MoreFoodBlocks.PURPLE_CANDLE_CHOCOLATE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.BLUE_CANDLE, MoreFoodBlocks.BLUE_CANDLE_CHOCOLATE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.BROWN_CANDLE, MoreFoodBlocks.BROWN_CANDLE_CHOCOLATE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.GREEN_CANDLE, MoreFoodBlocks.GREEN_CANDLE_CHOCOLATE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.RED_CANDLE, MoreFoodBlocks.RED_CANDLE_CHOCOLATE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.BLACK_CANDLE, MoreFoodBlocks.BLACK_CANDLE_CHOCOLATE_CAKE);
        }

        if (cakeBlock == MoreFoodBlocks.RAINBOW_CAKE) {
            CANDLES_TO_CANDLE_CAKES.put(Blocks.CANDLE, MoreFoodBlocks.CANDLE_RAINBOW_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.WHITE_CANDLE, MoreFoodBlocks.WHITE_CANDLE_RAINBOW_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.ORANGE_CANDLE, MoreFoodBlocks.ORANGE_CANDLE_RAINBOW_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.MAGENTA_CANDLE, MoreFoodBlocks.MAGENTA_CANDLE_RAINBOW_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.LIGHT_BLUE_CANDLE, MoreFoodBlocks.LIGHT_BLUE_CANDLE_RAINBOW_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.YELLOW_CANDLE, MoreFoodBlocks.YELLOW_CANDLE_RAINBOW_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.LIME_CANDLE, MoreFoodBlocks.LIME_CANDLE_RAINBOW_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.PINK_CANDLE, MoreFoodBlocks.PINK_CANDLE_RAINBOW_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.GRAY_CANDLE, MoreFoodBlocks.GRAY_CANDLE_RAINBOW_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.LIGHT_GRAY_CANDLE, MoreFoodBlocks.LIGHT_GRAY_CANDLE_RAINBOW_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.CYAN_CANDLE, MoreFoodBlocks.CYAN_CANDLE_RAINBOW_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.PURPLE_CANDLE, MoreFoodBlocks.PURPLE_CANDLE_RAINBOW_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.BLUE_CANDLE, MoreFoodBlocks.BLUE_CANDLE_RAINBOW_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.BROWN_CANDLE, MoreFoodBlocks.BROWN_CANDLE_RAINBOW_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.GREEN_CANDLE, MoreFoodBlocks.GREEN_CANDLE_RAINBOW_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.RED_CANDLE, MoreFoodBlocks.RED_CANDLE_RAINBOW_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.BLACK_CANDLE, MoreFoodBlocks.BLACK_CANDLE_RAINBOW_CAKE);
        }
        if (cakeBlock == MoreFoodBlocks.REDWHITEBLUE_CAKE) {
            CANDLES_TO_CANDLE_CAKES.put(Blocks.CANDLE, MoreFoodBlocks.CANDLE_REDWHITEBLUE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.WHITE_CANDLE, MoreFoodBlocks.WHITE_CANDLE_REDWHITEBLUE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.ORANGE_CANDLE, MoreFoodBlocks.ORANGE_CANDLE_REDWHITEBLUE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.MAGENTA_CANDLE, MoreFoodBlocks.MAGENTA_CANDLE_REDWHITEBLUE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.LIGHT_BLUE_CANDLE, MoreFoodBlocks.LIGHT_BLUE_CANDLE_REDWHITEBLUE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.YELLOW_CANDLE, MoreFoodBlocks.YELLOW_CANDLE_REDWHITEBLUE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.LIME_CANDLE, MoreFoodBlocks.LIME_CANDLE_REDWHITEBLUE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.PINK_CANDLE, MoreFoodBlocks.PINK_CANDLE_REDWHITEBLUE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.GRAY_CANDLE, MoreFoodBlocks.GRAY_CANDLE_REDWHITEBLUE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.LIGHT_GRAY_CANDLE, MoreFoodBlocks.LIGHT_GRAY_CANDLE_REDWHITEBLUE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.CYAN_CANDLE, MoreFoodBlocks.CYAN_CANDLE_REDWHITEBLUE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.PURPLE_CANDLE, MoreFoodBlocks.PURPLE_CANDLE_REDWHITEBLUE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.BLUE_CANDLE, MoreFoodBlocks.BLUE_CANDLE_REDWHITEBLUE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.BROWN_CANDLE, MoreFoodBlocks.BROWN_CANDLE_REDWHITEBLUE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.GREEN_CANDLE, MoreFoodBlocks.GREEN_CANDLE_REDWHITEBLUE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.RED_CANDLE, MoreFoodBlocks.RED_CANDLE_REDWHITEBLUE_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.BLACK_CANDLE, MoreFoodBlocks.BLACK_CANDLE_REDWHITEBLUE_CAKE);
        }
        if (cakeBlock == MoreFoodBlocks.POUND_CAKE) {
            CANDLES_TO_CANDLE_CAKES.put(Blocks.CANDLE, MoreFoodBlocks.CANDLE_POUND_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.WHITE_CANDLE, MoreFoodBlocks.WHITE_CANDLE_POUND_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.ORANGE_CANDLE, MoreFoodBlocks.ORANGE_CANDLE_POUND_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.MAGENTA_CANDLE, MoreFoodBlocks.MAGENTA_CANDLE_POUND_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.LIGHT_BLUE_CANDLE, MoreFoodBlocks.LIGHT_BLUE_CANDLE_POUND_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.YELLOW_CANDLE, MoreFoodBlocks.YELLOW_CANDLE_POUND_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.LIME_CANDLE, MoreFoodBlocks.LIME_CANDLE_POUND_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.PINK_CANDLE, MoreFoodBlocks.PINK_CANDLE_POUND_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.GRAY_CANDLE, MoreFoodBlocks.GRAY_CANDLE_POUND_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.LIGHT_GRAY_CANDLE, MoreFoodBlocks.LIGHT_GRAY_CANDLE_POUND_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.CYAN_CANDLE, MoreFoodBlocks.CYAN_CANDLE_POUND_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.PURPLE_CANDLE, MoreFoodBlocks.PURPLE_CANDLE_POUND_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.BLUE_CANDLE, MoreFoodBlocks.BLUE_CANDLE_POUND_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.BROWN_CANDLE, MoreFoodBlocks.BROWN_CANDLE_POUND_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.GREEN_CANDLE, MoreFoodBlocks.GREEN_CANDLE_POUND_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.RED_CANDLE, MoreFoodBlocks.RED_CANDLE_POUND_CAKE);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.BLACK_CANDLE, MoreFoodBlocks.BLACK_CANDLE_POUND_CAKE);
        }
        if (cakeBlock == MoreFoodBlocks.CAKE_WITH_CHERRIES) {
            CANDLES_TO_CANDLE_CAKES.put(Blocks.CANDLE, MoreFoodBlocks.CANDLE_CAKE_WITH_CHERRIES);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.WHITE_CANDLE, MoreFoodBlocks.WHITE_CANDLE_CAKE_WITH_CHERRIES);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.ORANGE_CANDLE, MoreFoodBlocks.ORANGE_CANDLE_CAKE_WITH_CHERRIES);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.MAGENTA_CANDLE, MoreFoodBlocks.MAGENTA_CANDLE_CAKE_WITH_CHERRIES);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.LIGHT_BLUE_CANDLE, MoreFoodBlocks.LIGHT_BLUE_CANDLE_CAKE_WITH_CHERRIES);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.YELLOW_CANDLE, MoreFoodBlocks.YELLOW_CANDLE_CAKE_WITH_CHERRIES);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.LIME_CANDLE, MoreFoodBlocks.LIME_CANDLE_CAKE_WITH_CHERRIES);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.PINK_CANDLE, MoreFoodBlocks.PINK_CANDLE_CAKE_WITH_CHERRIES);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.GRAY_CANDLE, MoreFoodBlocks.GRAY_CANDLE_CAKE_WITH_CHERRIES);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.LIGHT_GRAY_CANDLE, MoreFoodBlocks.LIGHT_GRAY_CANDLE_CAKE_WITH_CHERRIES);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.CYAN_CANDLE, MoreFoodBlocks.CYAN_CANDLE_CAKE_WITH_CHERRIES);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.PURPLE_CANDLE, MoreFoodBlocks.PURPLE_CANDLE_CAKE_WITH_CHERRIES);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.BLUE_CANDLE, MoreFoodBlocks.BLUE_CANDLE_CAKE_WITH_CHERRIES);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.BROWN_CANDLE, MoreFoodBlocks.BROWN_CANDLE_CAKE_WITH_CHERRIES);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.GREEN_CANDLE, MoreFoodBlocks.GREEN_CANDLE_CAKE_WITH_CHERRIES);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.RED_CANDLE, MoreFoodBlocks.RED_CANDLE_CAKE_WITH_CHERRIES);
            CANDLES_TO_CANDLE_CAKES.put(Blocks.BLACK_CANDLE, MoreFoodBlocks.BLACK_CANDLE_CAKE_WITH_CHERRIES);
        }

        if (CANDLES_TO_CANDLE_CAKES.isEmpty()) {
            return Blocks.CANDLE_CAKE.getDefaultState();
        }
        return CANDLES_TO_CANDLE_CAKES.get(candle).getDefaultState();
    }

    public static boolean canBeLit(BlockState state) {
        return state.isIn(BlockTags.CANDLE_CAKES, (statex) -> {
            return statex.contains(LIT) && !(Boolean)state.get(LIT);
        });
    }

    private static void setLit(WorldAccess world, BlockState state, BlockPos pos, boolean lit) {
        world.setBlockState(pos, (BlockState)state.with(LIT, lit), 11);
    }

    static {
        LIT = AbstractCandleBlock.LIT;
        CAKE_SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
        CANDLE_SHAPE = Block.createCuboidShape(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
        SHAPE = VoxelShapes.union(CAKE_SHAPE, CANDLE_SHAPE);
        PARTICLE_OFFSETS = ImmutableList.of(new Vec3d(0.5, 1.0, 0.5));
    }
}
