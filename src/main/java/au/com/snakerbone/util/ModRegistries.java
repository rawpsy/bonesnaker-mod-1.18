package au.com.snakerbone.util;

import au.com.snakerbone.SnakerBoneMod;
import au.com.snakerbone.block.ModBlocks;
import au.com.snakerbone.command.ReturnHomeCommand;
import au.com.snakerbone.command.SetHomeCommand;
import au.com.snakerbone.event.ModPlayerEventCopyFrom;
import au.com.snakerbone.item.ModItems;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.ComposterBlock;

public class ModRegistries {

    public static void registerModStuffs() {
        registerFuels();
        regsisterModComposterMethod();
        registerCommands();
        registerEvents();
        registerStrippables();
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

    private static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(SetHomeCommand::register);
        CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);
    }

    private static void registerEvents() {
        ServerPlayerEvents.COPY_FROM.register(new ModPlayerEventCopyFrom());
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.CHERRY_BLOSSOM_LOG, ModBlocks.STRIPPED_CHERRY_BLOSSOM_LOG);
        StrippableBlockRegistry.register(ModBlocks.CHERRY_BLOSSOM_WOOD, ModBlocks.STRIPPED_CHERRY_BLOSSOM_WOOD);
    }

}
