package com.legopitstop.morefood.entities;

import com.legopitstop.morefood.init.MorefoodEntityTypes;
import net.minecraft.block.BlockState;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import javax.swing.text.MutableAttributeSet;

public class ExoticTraderEntity extends AnimalEntity {

    public static final Ingredient TEMPTATION_ITEMS = Ingredient.fromItems(Items.CARROT, Items.POTATO, Items.BEETROOT);

    public ExoticTraderEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
        super(type, worldIn);
    }

    //func_233666_p_ --> registerAttributes()
    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                // field_233818_a_ -> MAX_HEALTH
                // field_233821_d_ -> MOVEMENT_SPEED
                // func_233814_a_ -> createMutableAttribute
                .func_233814_a_(Attributes.field_233818_a_) //12.0D
                .func_233814_a_(Attributes.field_233821_d_); //0.25D
    }

    // mob AI/GOALS
    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.25D));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.1D, TEMPTATION_ITEMS, false));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.1D));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class,6.0f));
        this.goalSelector.addGoal(7, new LookRandomlyGoal(this));
    }

    // experiance when killed
    @Override
    protected int getExperiencePoints(PlayerEntity player) {
        return 1 + this.world.rand.nextInt(4);
    }

    // ambient sound
    @Override
    protected SoundEvent getAmbientSound() { return SoundEvents.ENTITY_WANDERING_TRADER_AMBIENT; }

    // death sound
    @Override
    protected SoundEvent getDeathSound() { return SoundEvents.ENTITY_WANDERING_TRADER_DEATH; }

    // hurt sound
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) { return SoundEvents.ENTITY_WANDERING_TRADER_HURT; }

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        // field_232855_rz_ -> ENTITY_ZOGLIN_STEP
        this.playSound(SoundEvents.field_232855_rz_, 0.15f, 1.0f);
    }

    @Nullable
    public AgeableEntity createChild(AgeableEntity ageable) {
        return MorefoodEntityTypes.EXOTIC_TRADER.get().create(this.world);
    }

    @Override
    public AgeableEntity func_241840_a(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {
        return null;
    }
}