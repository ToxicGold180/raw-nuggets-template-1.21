package net.toxicgold180.rawnuggets;

import net.fabricmc.api.ModInitializer;

import net.toxicgold180.rawnuggets.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RawNuggets implements ModInitializer {
	public static final String MOD_ID = "rawnuggets";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}