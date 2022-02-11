package au.com.snakerbone.item;

import au.com.snakerbone.SnakerBoneMod;
import au.com.snakerbone.item.custom.ModAxeItem;
import au.com.snakerbone.item.custom.ModHoeItem;
import au.com.snakerbone.item.custom.ModPickaxeItem;
import au.com.snakerbone.item.custom.OreSniffer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item KUNZITE_INGOT = registerItem("kunzite_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item RAW_KUNZITE = registerItem("raw_kunzite",
            new Item(new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item BISMUTH = registerItem("bismuth",
            new Item(new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item ORE_SNIFFER = registerItem("ore_sniffer",
            new OreSniffer(new FabricItemSettings().group(ModItemGroups.SNAKE).maxDamage(32)));

    public static final Item TURNIP = registerItem("turnip",
            new Item(new FabricItemSettings().group(ModItemGroups.SNAKE).food(ModFoodComponents.TURNIP)));

    public static final Item CHARGED_PEAT = registerItem("charged_peat",
            new Item(new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item BISMUTH_PICKAXE = registerItem("bismuth_pickaxe",
            new ModPickaxeItem(ModToolMaterial.BISMUTH, 5, 10f,
                    new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item BISMUTH_AXE = registerItem("bismuth_axe",
            new ModAxeItem(ModToolMaterial.BISMUTH, 20, 5f,
                    new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item BISMUTH_HOE = registerItem("bismuth_hoe",
            new ModHoeItem(ModToolMaterial.BISMUTH, 5, 10f,
                    new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item BISMUTH_SHOVEL = registerItem("bismuth_shovel",
            new ShovelItem(ModToolMaterial.BISMUTH, 5, 10f,
                    new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item BISMUTH_SWORD = registerItem("bismuth_sword",
            new SwordItem(ModToolMaterial.BISMUTH, 10, 20f,
                    new FabricItemSettings().group(ModItemGroups.SNAKE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SnakerBoneMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Items For " + SnakerBoneMod.MOD_ID);
    }
}
