package phase.galvanized_veneers.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import phase.galvanized_veneers.GalvanizedVeneers;

public class GalvanizedSteelDefault extends Block {

    public GalvanizedSteelDefault(Settings settings) {
        super(settings);
    }


    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        GalvanizedVeneers.LOGGER.info(String.valueOf(stack));
        return super.onUseWithItem(stack, state, world, pos, player, hand, hit);
    }
}
