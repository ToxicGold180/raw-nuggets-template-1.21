package net.toxicgold180.rawnuggets.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.toxicgold180.rawnuggets.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> COPPER_NUGGET_SMELTABLES = List.of(ModItems.RAW_COPPER_NUGGET);
        List<ItemConvertible> GOLD_NUGGET_SMELTABLES = List.of(ModItems.RAW_GOLD_NUGGET);
        List<ItemConvertible> IRON_NUGGET_SMELTABLES = List.of(ModItems.RAW_IRON_NUGGET);

        offerSmelting(exporter, COPPER_NUGGET_SMELTABLES, RecipeCategory.MISC, ModItems.COPPER_NUGGET, 0.25f, 25, "copper_nugget");
        offerBlasting(exporter, COPPER_NUGGET_SMELTABLES, RecipeCategory.MISC, ModItems.COPPER_NUGGET, 0.25f, 10, "copper_nugget");

        offerSmelting(exporter, GOLD_NUGGET_SMELTABLES, RecipeCategory.MISC, Items.GOLD_NUGGET, 0.25f, 25, "gold_nugget");
        offerBlasting(exporter, GOLD_NUGGET_SMELTABLES, RecipeCategory.MISC, Items.GOLD_NUGGET, 0.25f, 10, "gold_nugget");

        offerSmelting(exporter, IRON_NUGGET_SMELTABLES, RecipeCategory.MISC, Items.IRON_NUGGET, 0.25f, 25, "iron_nugget");
        offerBlasting(exporter, IRON_NUGGET_SMELTABLES, RecipeCategory.MISC, Items.IRON_NUGGET, 0.25f, 10, "iron_nugget");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.COPPER_NUGGET, RecipeCategory.MISC, Items.COPPER_INGOT);
    }
}
