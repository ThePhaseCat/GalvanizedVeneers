package phase.galvanized_veneers.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import phase.galvanized_veneers.GalvanizedVeneers;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class LanguageGen extends FabricLanguageProvider {

    public LanguageGen(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(dataOutput, registriesFuture);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder)
    {
        translationBuilder.add(GalvanizedVeneers.GALVANIZED_SQUARE_STEEL, "Galvanized Square Steel");
        translationBuilder.add(GalvanizedVeneers.WOOD_VENEER, "Wood Veneer");
        translationBuilder.add(GalvanizedVeneers.LITTLE_JOHN_DISC, "Little John's Music");
    }
}
