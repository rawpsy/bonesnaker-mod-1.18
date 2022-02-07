package au.com.snakerbone.block;

import au.com.snakerbone.SnakerBoneMod;
import au.com.snakerbone.item.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block AMETRINE_BLOCK = registerBlock("ametrine_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(2.5F,6.0F).sounds(BlockSoundGroup.METAL)), ModItemGroups.SNAKE);

    public static final Block AMETRINE_ORE = registerBlock("ametrine_ore",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F,3.0F)), ModItemGroups.SNAKE);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(SnakerBoneMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(SnakerBoneMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering Blocks For " + SnakerBoneMod.MOD_ID);
    }

}
