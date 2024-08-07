package phase.galvanized_veneers.ModBlocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
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
        //GalvanizedVeneers.LOGGER.info(String.valueOf(stack));
        //now replace this block with true galvanized square steel
        if(world.isClient) {
            return ItemActionResult.SUCCESS;
        }
        else{
            //check what player is holding expansion screw
            if(stack.getItem() != GalvanizedVeneers.EXPANSION_SCREW){
                //GalvanizedVeneers.LOGGER.info("nu uh uh");
                return ItemActionResult.FAIL;
            }
            //GalvanizedVeneers.LOGGER.info("yum");
            world.playSound(null, pos, SoundEvents.BLOCK_ANVIL_PLACE, SoundCategory.BLOCKS, 1.0f, 1.0f);
            world.setBlockState(pos, GalvanizedVeneers.TRUE_GALVANIZED_SQUARE_STEEL.getDefaultState());
            stack.decrement(1);
            return ItemActionResult.SUCCESS;
        }

    }

    @Override
    protected MapCodec<? extends FallingBlock> getCodec() {
        return null;
    }
}
