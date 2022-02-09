package au.com.snakerbone.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static FoodComponent TURNIP = new FoodComponent.Builder().hunger(20).saturationModifier(20).statusEffect(new
            StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 10000), 100f).build();
}
