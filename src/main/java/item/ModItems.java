package item;

import name.modid.TemplateMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
	public static final Item PRIDE_FLAG = register("pride_flag", Item::new, new Item.Properties());
	public static final Item ACE_FLAG = register("ace_flag", Item::new, new Item.Properties());
	public static final Item AGENDER_FLAG = register("agender_flag", Item::new, new Item.Properties());
	public static final Item ALLY_FLAG = register("ally_flag", Item::new, new Item.Properties());
	public static final Item ARO_FLAG = register("aro_flag", Item::new, new Item.Properties());
	public static final Item BI_FLAG = register("bi_flag", Item::new, new Item.Properties());
	public static final Item ENBY_FLAG = register("enby_flag", Item::new, new Item.Properties());
	public static final Item GENDERFLUID_FLAG = register("genderfluid_flag", Item::new, new Item.Properties());
	public static final Item LESBIAN_FLAG = register("lesbian_flag", Item::new, new Item.Properties());
	public static final Item MLM_FLAG = register("mlm_flag", Item::new, new Item.Properties());
	public static final Item PAN_FLAG = register("pan_flag", Item::new, new Item.Properties());
	public static final Item PROGRESS_FLAG = register("progress_flag", Item::new, new Item.Properties());
	public static final Item TRANS_FLAG = register("trans_flag", Item::new, new Item.Properties());

	public static void initialize() {
	}

	public static <T extends Item> T register(String name, Function<Item.Properties, T> itemFactory, Item.Properties settings) {
		// Create the item key.
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TemplateMod.MOD_ID, name));

		// Create the item instance.
		T item = itemFactory.apply(settings.setId(itemKey));

		// Register the item.
		Registry.register(BuiltInRegistries.ITEM, itemKey, item);

		return item;
	}
}

