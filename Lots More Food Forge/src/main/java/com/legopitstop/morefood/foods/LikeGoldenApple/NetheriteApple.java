package com.legopitstop.morefood.foods.LikeGoldenApple;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class NetheriteApple extends Item {

    public NetheriteApple() {
        super(new Properties()
        .group(MoreFood.TAB)
        .food(new Food.Builder()
                .hunger(1)
                .saturation(0.3f)
                .setAlwaysEdible()

                .effect(new EffectInstance(Effects.INSTANT_HEALTH, 1*20, 0), 1.0F)
                .effect(new EffectInstance(Effects.RESISTANCE, 4*60*20, 0), 1.0F)
                .effect(new EffectInstance(Effects.ABSORPTION, 4*60*20, 0), 1.0F)
                .effect(new EffectInstance(Effects.HASTE, 4*60*20, 0), 1.0F)

                .build())

        );

    }
    // desc lines at bottom
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(this.func_219981_d_().func_240699_a_(TextFormatting.GRAY));
    }

    @OnlyIn(Dist.CLIENT)
    public IFormattableTextComponent func_219981_d_() {
        return new TranslationTextComponent(this.getTranslationKey() + ".desc");
    }
}
