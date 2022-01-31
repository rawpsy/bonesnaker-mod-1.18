package au.com.snakerbone.item;

import au.com.snakerbone.SnakerBoneMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SNAKE = FabricItemGroupBuilder.build(new Identifier(SnakerBoneMod.MOD_ID, "snake"),
            () -> new ItemStack(ModItems.AMETRINE_SHARD));
}
