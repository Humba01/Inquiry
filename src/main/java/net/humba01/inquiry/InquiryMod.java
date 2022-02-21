package net.humba01.inquiry;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InquiryMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static String MOD_ID = "inquiry";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public final static Item WOODEN_NANO_STICK = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public final static Item WOODEN_DOUBLE_NANO_STICK = new Item(new FabricItemSettings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.""

		LOGGER.info("Hello Fabric world!");

		Registry.register(Registry.ITEM, new Identifier(InquiryMod.MOD_ID, "wooden_nano_stick"), WOODEN_NANO_STICK);
	}
}
