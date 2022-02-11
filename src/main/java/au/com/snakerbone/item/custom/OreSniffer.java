package au.com.snakerbone.item.custom;

import au.com.snakerbone.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class OreSniffer extends Item {
    public OreSniffer(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

        if(Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("item.snakerbone.ore_sniffer.tooltip.shift"));
        } else {
            tooltip.add(new TranslatableText("item.snakerbone.ore_sniffer.tooltip"));
        }

    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getWorld().isClient) {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;

            for (int i = 0; i <= positionClicked.getY(); i++) {
                Block blockBelow = context.getWorld().getBlockState(positionClicked.down(i)).getBlock();

                if(isValuableBlock(blockBelow)) {
                    outputValuableCoords(positionClicked, player, blockBelow);

                    foundBlock = true;
                    break;
                }
            }

            if(!foundBlock) {
                player.sendMessage(new TranslatableText("item.snakerbone.ore_sniffer.no_valuables"), false);
            }

        }

        context.getStack().damage(1, context.getPlayer(), (player) -> player.sendToolBreakStatus(player.getActiveHand()));


        return super.useOnBlock(context);
    }

    private void outputValuableCoords(BlockPos blockPos, PlayerEntity player, Block blockBelow) {
        player.sendMessage(new LiteralText("Found " + blockBelow.asItem().getName().getString() + " at " +
                "(" + blockPos.getX() + ", " + blockPos.getY() + ", " + blockPos.getZ() + ")"), false);
    }

    private boolean isValuableBlock(Block block) {
        return ModTags.Blocks.ORE_SNIFFER_DETECTABLE_BLOCKS.contains(block);
    }
}
