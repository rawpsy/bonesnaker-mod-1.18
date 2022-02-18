package au.com.snakerbone.item;

import au.com.snakerbone.SnakerBoneMod;
import au.com.snakerbone.block.ModBlocks;
import au.com.snakerbone.item.custom.*;
import au.com.snakerbone.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
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
            new ModPickaxeItem(ModToolMaterial.BISMUTH, 5, 75f,
                    new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item BISMUTH_AXE = registerItem("bismuth_axe",
            new ModAxeItem(ModToolMaterial.BISMUTH, 20, 75f,
                    new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item BISMUTH_HOE = registerItem("bismuth_hoe",
            new ModHoeItem(ModToolMaterial.BISMUTH, 0, 75f,
                    new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item BISMUTH_SHOVEL = registerItem("bismuth_shovel",
            new ShovelItem(ModToolMaterial.BISMUTH, 1, 75f,
                    new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item BISMUTH_SWORD = registerItem("bismuth_sword",
            new SwordItem(ModToolMaterial.BISMUTH, 3, 75f,
                    new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item KUNZITE_PAXEL = registerItem("kunzite_paxel",
            new ModPaxelItem(ModToolMaterial.KUNZITE, 2, 75f,
                    new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item ANEURYSM_BLADE = registerItem("aneurysm_blade",
            new ModAneurysmBlade(ModToolMaterial.WOOD, 1, 75f,
                    new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item KUNZITE_HELMET = registerItem("kunzite_helmet",
            new ModArmorItem(ModArmorMaterials.KUNZITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item KUNZITE_CHESTPLATE = registerItem("kunzite_chestplate",
            new ArmorItem(ModArmorMaterials.KUNZITE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item KUNZITE_LEGGINGS = registerItem("kunzite_leggings",
            new ArmorItem(ModArmorMaterials.KUNZITE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item KUNZITE_BOOTS = registerItem("kunzite_boots",
            new ArmorItem(ModArmorMaterials.KUNZITE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item DATA_TABLET = registerItem("data_tablet",
            new DataTabletItem(new FabricItemSettings().group(ModItemGroups.SNAKE).maxCount(1)));

    public static final Item TURNIP_SEEDS = registerItem("turnip_seeds",
            new AliasedBlockItem(ModBlocks.TURNIP_CROP, new FabricItemSettings().group(ModItemGroups.SNAKE)));

    public static final Item KALI_MUSIC_DISC = registerItem("kali_music_disc",
            new ModMusicDiscItem(9, ModSounds.KALI, new FabricItemSettings().group(ModItemGroups.SNAKE).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SnakerBoneMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Items For " + SnakerBoneMod.MOD_ID);
    }
}
