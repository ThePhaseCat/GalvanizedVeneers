package phase.galvanized_veneers.ModBlocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import phase.galvanized_veneers.GalvanizedVeneers;

import static net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking.getServer;

public class GalvanizedSteelDefault extends FallingBlock {


    public GalvanizedSteelDefault(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        GalvanizedVeneers.LOGGER.info(String.valueOf(stack));
        //now replace this block with true galvanized square steel
        if(world.isClient) {
            return ItemActionResult.SUCCESS;
        }
        else{
            world.setBlockState(pos, GalvanizedVeneers.TRUE_GALVANIZED_SQUARE_STEEL.getDefaultState());
            return ItemActionResult.SUCCESS;
        }

    }

    @Override
    protected MapCodec<? extends FallingBlock> getCodec() {
        return null;
    }
}
