package net.mellow.womp.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties ALFREDO = new FoodProperties.Builder().nutrition(2).fast().meat()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.1f).build();

    public static final FoodProperties SHRIMPAL = new FoodProperties.Builder().nutrition(3).fast().meat()
            .saturationMod(0.4f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400), 0.1f).build();

    public static final FoodProperties CHICKENALF = new FoodProperties.Builder().nutrition(3).fast().meat()
            .saturationMod(0.4f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400), 0.1f).build();



}
