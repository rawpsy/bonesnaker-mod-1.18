package au.com.snakerbone.block.entity;

import au.com.snakerbone.SnakerBoneMod;
import au.com.snakerbone.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {

    public static BlockEntityType<KunziteBlasterEntity> KUNZITE_BLASTER;

        public static void registerAllEntities() {
            KUNZITE_BLASTER = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                    new Identifier(SnakerBoneMod.MOD_ID, "kunzite_blaster"),
                        FabricBlockEntityTypeBuilder.create(KunziteBlasterEntity::new,
                            ModBlocks.KUNZITE_BLASTER).build(null));
        }
}
