package au.com.snakerbone.util;

import au.com.snakerbone.SnakerBoneMod;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {

        public static final Tag.Identified<Block> ORE_SNIFFER_DETECTABLE_BLOCKS = createTag("ore_sniffer_detectable_blocks");

        public static final Tag.Identified<Block> KUNZITE_BLOCKS = createCommonTag("kunzite_blocks");

        public static final Tag.Identified<Block> KUNZITE_ORES = createCommonTag("kunzite_ores");

        private static Tag.Identified<Block> createTag(String name) {
            return TagFactory.BLOCK.create(new Identifier(SnakerBoneMod.MOD_ID, name));
        }

        private static Tag.Identified<Block> createCommonTag(String name) {
            return TagFactory.BLOCK.create(new Identifier("c", name));
        }
    }

    public static class Items {

        public static final Tag.Identified<Item> KUNZITE_INGOTS = createCommonTag("kunzite_ingots");

        private static Tag.Identified<Item> createTag(String name) {
            return TagFactory.ITEM.create(new Identifier(SnakerBoneMod.MOD_ID, name));
        }

        private static Tag.Identified<Item> createCommonTag(String name) {
                return TagFactory.ITEM.create(new Identifier("c", name));
        }

    }

}
