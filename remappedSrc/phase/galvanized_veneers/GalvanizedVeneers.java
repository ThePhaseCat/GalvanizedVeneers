package phase.galvanized_veneers;

import Item;
import ItemGroup;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.EitherHolder;
import net.minecraft.world.item.JukeboxPlayable;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.level.block.Block;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GalvanizedVeneers implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("galvanizedveneers");


	public static final ResourceKey<JukeboxSong> JUKEBOX_SONG_KEY = ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("galvanizedveneers", "little_john"));

	public static final JukeboxPlayable JUKEBOX_PLAYABLE = new JukeboxPlayable(new EitherHolder<>(JUKEBOX_SONG_KEY), false);

	public static final Block GALVANIZED_SQUARE_STEEL = new Block()

	public static final Block GALVANIZED_SQUARE_STEEL = new Block(Block.Settings.copy(Blocks.IRON_BLOCK).hardness(1.5f).resistance(100.0f));
	public static final Block WOOD_VENEER = new Block(Block.Settings.copy(Blocks.OAK_PLANKS).hardness(0.5f).resistance(2.5f));
	public static final Item LITTLE_JOHN_DISC = new Item(new Item.Settings());
	//public static final Item LITTLE_JOHN_DISC = new MusicDiscItem(15, little_john, new Item.Settings().maxCount(1), 48);

	private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(GALVANIZED_SQUARE_STEEL))
			.displayName(Text.literal("Galvanized Veneers"))
			.entries((context, entries) -> {
				entries.add(GALVANIZED_SQUARE_STEEL.asItem());
				entries.add(WOOD_VENEER.asItem());
				entries.add(LITTLE_JOHN_DISC);
			})
			.build();



	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("GalvanizedVeneers Started! It's time for Galvanized Square Steel!");
		Registry.register(Registries.BLOCK, Identifier.of("galvanizedveneers", "galvanized_square_steel"), GALVANIZED_SQUARE_STEEL);
		Registry.register(Registries.ITEM, Identifier.of("galvanizedveneers", "galvanized_square_steel"), new BlockItem(GALVANIZED_SQUARE_STEEL, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("galvanizedveneers", "wood_veneer"), WOOD_VENEER);
		Registry.register(Registries.ITEM, Identifier.of("galvanizedveneers", "wood_veneer"), new BlockItem(WOOD_VENEER, new Item.Settings()));
		Registry.register(Registries.ITEM, Identifier.of("galvanizedveneers", "little_john_disc"), LITTLE_JOHN_DISC);

		Registry.register(Registries.ITEM_GROUP, Identifier.of("galvanizedveneers", "item_group"), ITEM_GROUP);

		LOGGER.info("GalvanizedVeneers Finished! Hopefully this will help you expand your tiny apartment!");
	}
}