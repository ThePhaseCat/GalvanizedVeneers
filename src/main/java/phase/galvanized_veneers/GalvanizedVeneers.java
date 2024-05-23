package phase.galvanized_veneers;

import net.fabricmc.api.ModInitializer;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GalvanizedVeneers implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("galvanizedveneers");

	public static final Block GALVANIZED_SQUARE_STEEL = new Block(Block.Settings.create().strength(10.0f));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("GalvanizedVeneers Started");
		Registry.register(Registries.BLOCK, new Identifier("galvanizedveneers", "galvanized_square_steel"), GALVANIZED_SQUARE_STEEL);
		Registry.register(Registries.ITEM, new Identifier("galvanizedveneers", "galvanized_square_steel"), new BlockItem(GALVANIZED_SQUARE_STEEL, new Item.Settings()));
	}
}