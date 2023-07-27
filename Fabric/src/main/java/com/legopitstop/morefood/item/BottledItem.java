package com.legopitstop.morefood.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class BottledItem extends Item {
    public Item glassItem;
    public Item drinkItem;
    private int Uses;

    public BottledItem(Item glassItem, Item drinkItem, Settings settings) {
        super(settings);
        this.glassItem = glassItem;
        this.drinkItem = drinkItem;
    }

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        this.addUses(stack, 4);
    }

    @Override
    public boolean isItemBarVisible(ItemStack stack) {
        NbtCompound nbt = stack.getOrCreateNbt();
        this.readUsesFromNbt(nbt);
        return this.Uses < 4 && this.Uses >= 0;
    }

    @Override
    public int getItemBarStep(ItemStack stack) {
        NbtCompound nbt = stack.getOrCreateNbt();
        this.readUsesFromNbt(nbt);
        return Math.round((float)this.Uses * 13.0f / 4);
    }

    @Override
    public int getItemBarColor(ItemStack stack) {
        NbtCompound nbt = stack.getOrCreateNbt();
        this.readUsesFromNbt(nbt);
        float f = Math.max(0.0f, (float)this.Uses / 4);
        return MathHelper.hsvToRgb(f / 3.0f, 1.0f, 1.0f);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (hand == Hand.MAIN_HAND) {
            ItemStack mainhand = user.getStackInHand(Hand.MAIN_HAND);
            ItemStack offhand = user.getStackInHand(Hand.OFF_HAND);

            NbtCompound nbt = mainhand.getOrCreateNbt();
            this.readUsesFromNbt(nbt);

            if (this.Uses > 0 && this.glassItem == offhand.getItem()) {
                this.Uses--;
                this.writeUsesToNbt(nbt);
                user.giveItemStack(new ItemStack(this.drinkItem));

                if (!user.getAbilities().creativeMode) {
                    offhand.decrement(1);
                }
            }
        }

        return super.use(world, user, hand);
    }

    private boolean readUsesFromNbt(NbtCompound nbt) {
        if (nbt.contains("Uses", 3)) {
            this.Uses = nbt.getInt("Uses");
            return true;
        } else {
            return false;
        }
    }

    private boolean writeUsesToNbt(NbtCompound nbt) {
        nbt.putInt("Uses", this.Uses);
        return true;
    }

    public static ItemStack addUses(ItemStack stack, int uses) {
        NbtCompound nbt = stack.getOrCreateNbt();
        nbt.putInt("Uses", uses);
        return stack;
    }

    public void setUses(int uses) {
        this.Uses = uses;
    }
}
