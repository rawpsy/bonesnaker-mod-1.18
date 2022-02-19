package au.com.snakerbone.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class SpeedBlock extends Block {

    public SpeedBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        float chance = 0.35f;

        if(chance < random.nextFloat()) {
            world.addParticle(ParticleTypes.HEART, pos.getX() + random.nextDouble(),
                    pos.getY() + 0.5D, pos.getZ() + random.nextDouble(),
                    0d, 0.015d + random.nextDouble(0.075d), 0d);
        }

        if(chance < random.nextFloat()) {
            world.addParticle(ParticleTypes.HEART, pos.getX() + random.nextDouble(),
                    pos.getY() + 0.5D, pos.getZ() + random.nextDouble(),
                    0d, 0.015d + random.nextDouble(0.075d), 0d);
        }

        if(chance < random.nextFloat()) {
            world.addParticle(ParticleTypes.HEART, pos.getX() + random.nextDouble(),
                    pos.getY() + 0.5D, pos.getZ() + random.nextDouble(),
                    0d, 0.015d + random.nextDouble(0.075d), 0d);
        }

        if(chance < random.nextFloat()) {
            world.addParticle(ParticleTypes.HEART, pos.getX() + random.nextDouble(),
                    pos.getY() + 0.5D, pos.getZ() + random.nextDouble(),
                    0d, 0.015d + random.nextDouble(0.075d), 0d);
        }
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(!world.isClient) {
            if(entity instanceof LivingEntity) {
                LivingEntity livingEntity = ((LivingEntity) entity);
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200));
            }
        }
        super.onSteppedOn(world, pos, state, entity);
    }
}
