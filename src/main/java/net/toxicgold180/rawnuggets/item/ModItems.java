package net.toxicgold180.rawnuggets.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.toxicgold180.rawnuggets.RawNuggets;

public class ModItems {
    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new Item.Settings()));
    public static final Item RAW_COPPER_NUGGET = registerItem("raw_copper_nugget", new Item(new Item.Settings()));
    public static final Item RAW_GOLD_NUGGET = registerItem("raw_gold_nugget", new Item(new Item.Settings()));
    public static final Item RAW_IRON_NUGGET = registerItem("raw_iron_nugget", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RawNuggets.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RawNuggets.LOGGER.info("Registering Mod Items for " + RawNuggets.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(COPPER_NUGGET);
            entries.add(RAW_COPPER_NUGGET);
            entries.add(RAW_GOLD_NUGGET);
            entries.add(RAW_IRON_NUGGET);
        });
    }
}
