package au.com.snakerbone.util;

import au.com.snakerbone.SnakerBoneMod;
import au.com.snakerbone.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {

    public static void registerModStuffs() {
        registerFuels();
    }

    private static void registerFuels() {
        System.out.println("Registring Fuels For " + SnakerBoneMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.CHARGED_PEAT, 9000);
    }

}
