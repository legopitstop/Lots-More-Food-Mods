package com.legopitstop.morefood.client.render;

import com.legopitstop.morefood.MoreFood;
import com.legopitstop.morefood.client.model.ExoticTraderModel;
import com.legopitstop.morefood.entities.ExoticTraderEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ExoticTraderRenderer extends MobRenderer<ExoticTraderEntity, ExoticTraderModel<ExoticTraderEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(MoreFood.MOD_ID,"textures/entity/exotic_trader.png");

    public ExoticTraderRenderer(EntityRendererManager rendererManagerIn) {
        super(rendererManagerIn, new ExoticTraderModel<>(),0.7f);
    }

    @Override
    public ResourceLocation getEntityTexture(ExoticTraderEntity entity) {
        return TEXTURE;
    }
}
