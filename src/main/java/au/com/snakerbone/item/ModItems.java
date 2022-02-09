package au.com.snakerbone.item;

import au.com.snakerbone.SnakerBoneMod;
import au.com.snakerbone.item.custom.CustomItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item KUNZITE_INGOT = registerItem("kunzite_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item KUNZITE_FRAGMENT = registerItem("kunzite_fragment",
            new Item(new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item AMETRINE_SHARD = registerItem("ametrine_shard",
            new Item(new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item CUSTOM_ITEM = registerItem("custom_item",
            new CustomItem(new FabricItemSettings().group(ModItemGroups.SNAKE).maxDamage(32)));

    public static final Item TURNIP = registerItem("turnip",
            new Item(new FabricItemSettings().group(ModItemGroups.SNAKE).food(ModFoodComponents.TURNIP)));

    public static final Item CHARGED_PEAT = registerItem("charged_peat",
            new Item(new FabricItemSettings().group(ModItemGroups.SNAKE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SnakerBoneMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Items For " + SnakerBoneMod.MOD_ID);
    }
}
