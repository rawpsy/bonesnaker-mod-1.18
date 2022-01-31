package au.com.snakerbone;

import au.com.snakerbone.block.ModBlocks;
import au.com.snakerbone.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SnakerBoneMod implements ModInitializer {

	public static final String MOD_ID = "snakerbone";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
