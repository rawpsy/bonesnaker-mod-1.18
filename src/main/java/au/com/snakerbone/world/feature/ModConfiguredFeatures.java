package au.com.snakerbone.world.feature;

import au.com.snakerbone.SnakerBoneMod;
import au.com.snakerbone.block.ModBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ConfiguredFeature<TreeFeatureConfig, ?> CHERRY_BLOSSOM_TREE =
            register("cherry_blossom", Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.CHERRY_BLOSSOM_LOG),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.CHERRY_BLOSSOM_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build()));

    public static final ConfiguredFeature<RandomFeatureConfig, ?> CHERRY_BLOSSOM_TREE_RANDOM = register("cherry_blossom_feature",
            Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(List.of(new RandomFeatureEntry(
                    CHERRY_BLOSSOM_TREE.withWouldSurviveFilter(ModBlocks.CHERRY_BLOSSOM_SAPLING), 0.1f)),
                    CHERRY_BLOSSOM_TREE.withWouldSurviveFilter(ModBlocks.CHERRY_BLOSSOM_SAPLING))));

    public static final ConfiguredFeature<RandomPatchFeatureConfig, ?> PINK_ROSE =
            ModConfiguredFeatures.register("pink_rose", Feature.FLOWER.configure(
                    createRandomPatchFeatureConfig(BlockStateProvider.of(ModBlocks.PINK_ROSE), 64)));

    public static final List<OreFeatureConfig.Target> OVERWORLD_BISMUTH_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BISMUTH_ORE.getDefaultState()));

    public static final ConfiguredFeature<?, ?> BISMUTH_ORE = register("bismuth_ore",
            Feature.ORE.configure(new OreFeatureConfig(OVERWORLD_BISMUTH_ORES, 9)));

    // registry start

    private static RandomPatchFeatureConfig createRandomPatchFeatureConfig(BlockStateProvider block, int tries) {
        return ConfiguredFeatures.createRandomPatchFeatureConfig(tries,
                Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(block)).withInAirFilter());
    }

    public static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(SnakerBoneMod.MOD_ID, name),
                configuredFeature);
    }

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures For " + SnakerBoneMod.MOD_ID);
    }

}
