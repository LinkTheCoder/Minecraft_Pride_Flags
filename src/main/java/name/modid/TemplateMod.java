package name.modid;

import item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplateMod implements ModInitializer {
	public static final String MOD_ID = "template-mod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.initialize();

		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(output -> {
			output.accept(new ItemStack(ModItems.PRIDE_FLAG), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			output.accept(new ItemStack(ModItems.ACE_FLAG), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			output.accept(new ItemStack(ModItems.AGENDER_FLAG), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			output.accept(new ItemStack(ModItems.ALLY_FLAG), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			output.accept(new ItemStack(ModItems.ARO_FLAG), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			output.accept(new ItemStack(ModItems.BI_FLAG), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			output.accept(new ItemStack(ModItems.ENBY_FLAG), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			output.accept(new ItemStack(ModItems.GENDERFLUID_FLAG), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			output.accept(new ItemStack(ModItems.LESBIAN_FLAG), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			output.accept(new ItemStack(ModItems.MLM_FLAG), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			output.accept(new ItemStack(ModItems.PAN_FLAG), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			output.accept(new ItemStack(ModItems.PROGRESS_FLAG), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			output.accept(new ItemStack(ModItems.TRANS_FLAG), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
		});

		LOGGER.info("Hello Fabric world!");
	}
}