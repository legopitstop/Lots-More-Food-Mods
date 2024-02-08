package com.legopitstop.morefood.client.toque;

import com.legopitstop.morefood.MoreFood;
import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.util.Identifier;

public class Tier2Toque implements Toque {
    public Tier2Toque() {}

    @Override
    public Identifier getTexture() {
        return new Identifier(MoreFood.MOD_ID, "textures/chef_toque/tier2.png");
    }

    @Override
    public ModelPartBuilder getModel(Dilation dilation) {
        return ModelPartBuilder.create()
                .uv(0, 0).mirrored().cuboid(-4.0F, -14.0F, -4.0F, 8.0F, 2.0F, 8.0F, new Dilation(0.5F)).mirrored(false)
                .uv(0, 10).mirrored().cuboid(-4.0F, -14.0F, -4.0F, 8.0F, 9.0F, 8.0F, new Dilation(0.0F)).mirrored(false);
    }
}
