package phase.galvanized_veneers;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import phase.galvanized_veneers.datagen.BlockLootTableGen;
import phase.galvanized_veneers.datagen.BlockTagGen;
import phase.galvanized_veneers.datagen.RecipeGen;

public class GalvanizedVeneersDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack myPack = fabricDataGenerator.createPack();
		myPack.addProvider(BlockLootTableGen::new);
		myPack.addProvider(BlockTagGen::new);
		myPack.addProvider(RecipeGen::new);
	}
}
