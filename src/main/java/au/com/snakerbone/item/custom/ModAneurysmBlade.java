package au.com.snakerbone.item.custom;

import au.com.snakerbone.item.ModToolMaterial;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class ModAneurysmBlade extends SwordItem {
    public ModAneurysmBlade(ModToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 300, 1), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 300, 10), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 300, 1), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 300, 1), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 300, 10), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 1), attacker);
        return super.postHit(stack, target, attacker);
    }
}
