package au.com.snakerbone.block;

import au.com.snakerbone.SnakerBoneMod;
import au.com.snakerbone.block.custom.*;
import au.com.snakerbone.item.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block BISMUTH_BLOCK = registerBlock("bismuth_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(2.5F,6.0F).sounds(BlockSoundGroup.METAL)), ModItemGroups.SNAKE);

    public static final Block BISMUTH_ORE = registerBlock("bismuth_ore",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F,3.0F)), ModItemGroups.SNAKE);

    public static final Block KUNZITE_ORE = registerBlock("kunzite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F,3.0F)), ModItemGroups.SNAKE);

    public static final Block KUNZITE_BLOCK = registerBlock("kunzite_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(2.5F,6.0F).sounds(BlockSoundGroup.METAL)), ModItemGroups.SNAKE);

    public static final Block SPEED_BLOCK = registerBlock("speed_block",
            new SpeedBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F,5.0F)), ModItemGroups.SNAKE);

    public static final Block KUNZITE_STAIRS = registerBlock("kunzite_stairs",
            new ModStairsBlock(ModBlocks.KUNZITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.of(Material.METAL).requiresTool().strength(1.5F,5.0F).sounds(BlockSoundGroup.METAL)), ModItemGroups.SNAKE);

    public static final Block KUNZITE_SLAB = registerBlock("kunzite_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(1.5F,5.0F).sounds(BlockSoundGroup.METAL)), ModItemGroups.SNAKE);

    public static final Block KUNZITE_BUTTON = registerBlock("kunzite_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(1.5F,5.0F).sounds(BlockSoundGroup.METAL)), ModItemGroups.SNAKE);

    public static final Block KUNZITE_PRESSURE_PLATE = registerBlock("kunzite_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.METAL).requiresTool().strength(1.5F,5.0F).sounds(BlockSoundGroup.METAL)), ModItemGroups.SNAKE);

    public static final Block KUNZITE_FENCE = registerBlock("kunzite_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(1.5F,5.0F).sounds(BlockSoundGroup.METAL)), ModItemGroups.SNAKE);

    public static final Block KUNZITE_FENCE_GATE = registerBlock("kunzite_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(1.5F,5.0F).sounds(BlockSoundGroup.METAL)), ModItemGroups.SNAKE);

    public static final Block KUNZITE_WALL = registerBlock("kunzite_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(1.5F,5.0F).sounds(BlockSoundGroup.METAL)), ModItemGroups.SNAKE);

    public static final Block CHERRY_BLOSSOM_PLANKS = registerBlock("cherry_blossom_planks",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(1.5F,5.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroups.SNAKE);

    public static final Block CHERRY_BLOSSOM_DOOR = registerBlock("cherry_blossom_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(1.5F,5.0F).sounds(BlockSoundGroup.WOOD).nonOpaque()), ModItemGroups.SNAKE);

    public static final Block CHERRY_BLOSSOM_TRAPDOOR = registerBlock("cherry_blossom_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(1.5F,5.0F).sounds(BlockSoundGroup.WOOD).nonOpaque()), ModItemGroups.SNAKE);

    public static final Block KUNZITE_LAMP = registerBlock("kunzite_lamp",
            new KunziteLampBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(1.5F,5.0F).sounds(BlockSoundGroup.METAL)
                    .luminance((state) -> state.get(KunziteLampBlock.CLICKED) ? 15 : 0)), ModItemGroups.SNAKE);

    public static final Block TURNIP_CROP = registerBlockWithoutBlockItem("turnip_crop",
            new ModTurnipBlock(FabricBlockSettings.copy(Blocks.BEETROOTS).sounds(BlockSoundGroup.CROP)));

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(SnakerBoneMod.MOD_ID, name), block);
    }

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
