package phase.galvanized_veneers.ModItems;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import phase.galvanized_veneers.GalvanizedVeneers;

public class ModItems {

    public static final Item LITTLE_JOHN_DISC = register(
            new Item(new Item.Settings().jukeboxPlayable(GalvanizedVeneers.LITTLE_JOHN_SONG).maxCount(1)),
            "little_john_disc"
    );

    public static final Item EXPANSION_SCREW = register(
            new Item(new Item.Settings().maxCount(64)),
            "expansion_screw"
    );

    public static void initialize() {
    }

    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        Identifier itemID = Identifier.of(GalvanizedVeneers.modID, id);

        // Register the item.
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        // Return the registered item!
        return registeredItem;
    }
}
