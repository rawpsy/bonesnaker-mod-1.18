package au.com.snakerbone;

import au.com.snakerbone.block.ModBlocks;
import au.com.snakerbone.block.entity.ModBlockEntities;
import au.com.snakerbone.enchantment.ModEnchantments;
import au.com.snakerbone.item.ModItems;
import au.com.snakerbone.painting.ModPaintings;
import au.com.snakerbone.recipe.ModRecipes;
import au.com.snakerbone.util.ModLootTableModifiers;
import au.com.snakerbone.util.ModRegistries;
import au.com.snakerbone.world.feature.ModConfiguredFeatures;
import au.com.snakerbone.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SnakerBoneMod implements ModInitializer {

	public static final String MOD_ID = "snakerbone";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();
		ModEnchantments.registerModEnchantments();
		ModLootTableModifiers.modifyLootTables();
		ModPaintings.registerPaintings();
		ModBlockEntities.registerAllEntities();
		ModRecipes.register();
		ModWorldGen.generateModWorldGen();
	}
}
