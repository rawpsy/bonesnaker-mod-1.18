package au.com.snakerbone.util;

import au.com.snakerbone.SnakerBoneMod;
import au.com.snakerbone.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.ComposterBlock;

public class ModRegistries {

    public static void registerModStuffs() {
        registerFuels();
        regsisterModComposterMethod();
    }

    private static void registerFuels() {
        System.out.println("Registring Fuels For " + SnakerBoneMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.CHARGED_PEAT, 9000);
    }

    private static void regsisterModComposterMethod() {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.TURNIP_SEEDS, 0.5f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.TURNIP, 0.75f);
    }

}
