package phase.galvanized_veneers.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import phase.galvanized_veneers.GalvanizedVeneers;

import java.util.concurrent.CompletableFuture;

public class BlockTagGen extends FabricTagProvider.BlockTagProvider{

    public BlockTagGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(GalvanizedVeneers.GALVANIZED_SQUARE_STEEL);
    }
}
