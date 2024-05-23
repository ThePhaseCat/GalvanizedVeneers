package phase.galvanized_veneers.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import phase.galvanized_veneers.GalvanizedVeneers;

import java.util.concurrent.CompletableFuture;

public class BlockLootTableGen extends FabricBlockLootTableProvider {

    public BlockLootTableGen(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(GalvanizedVeneers.GALVANIZED_SQUARE_STEEL);
    }
}
