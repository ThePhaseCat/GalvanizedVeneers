package phase.galvanized_veneers.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import phase.galvanized_veneers.GalvanizedVeneers;


public class RecipeGen extends FabricRecipeProvider
{
    public RecipeGen(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(dataOutput, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, GalvanizedVeneers.GALVANIZED_SQUARE_STEEL)
                .pattern("bbb").pattern("b b").pattern("bbb")
                .input('b', Items.IRON_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, GalvanizedVeneers.WOOD_VENEER)
                .pattern("sss").pattern("sss").pattern("sss")
                .input('s', Items.OAK_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.OAK_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(Items.OAK_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, GalvanizedVeneers.LITTLE_JOHN_DISC)
                .pattern("sAs").pattern("AsA").pattern("sAs")
                .input('s', GalvanizedVeneers.GALVANIZED_SQUARE_STEEL)
                .input('A', GalvanizedVeneers.WOOD_VENEER)
                .criterion(FabricRecipeProvider.hasItem(GalvanizedVeneers.GALVANIZED_SQUARE_STEEL),
                        FabricRecipeProvider.conditionsFromItem(GalvanizedVeneers.GALVANIZED_SQUARE_STEEL))
                .criterion(FabricRecipeProvider.hasItem(GalvanizedVeneers.WOOD_VENEER),
                        FabricRecipeProvider.conditionsFromItem(GalvanizedVeneers.WOOD_VENEER))
                .offerTo(exporter);
    }
}
