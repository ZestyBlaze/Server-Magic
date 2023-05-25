package dev.zestyblaze.servertest.registry;

import dev.zestyblaze.servertest.ServerTest;
import dev.zestyblaze.servertest.item.base.BaseItem;
import dev.zestyblaze.servertest.item.FirstItem;
import eu.pb4.polymer.core.api.item.PolymerBlockItem;
import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import eu.pb4.polymer.core.api.item.PolymerSpawnEggItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ItemRegistry {
    public static final Item FIRST_ITEM = register("first_item", new FirstItem(new Item.Properties()));
    public static final Item FIRST_BLOCK_ITEM = register("first_block", new PolymerBlockItem(BlockRegistry.FIRST_BLOCK, new Item.Properties(), Items.BLUE_WOOL));
    public static final Item FIRST_ENTITY_SPAWN_EGG = register("first_entity_spawn_egg", new PolymerSpawnEggItem(EntityRegistry.FIRST_ENTITY, Items.DONKEY_SPAWN_EGG, new Item.Properties()));

    public static void register() {
        PolymerItemGroupUtils.builder(ServerTest.id(ServerTest.MODID))
                .title(Component.translatable("creative.servertest"))
                .icon(() -> new ItemStack(Items.GLASS))
                .displayItems(((itemDisplayParameters, output) -> {
                    for (Item item : BuiltInRegistries.ITEM) {
                        if (item instanceof BaseItem || item instanceof PolymerBlockItem || item instanceof PolymerSpawnEggItem) {
                            output.accept(item);
                        }
                    }
                })
                ).build();
    }

    private static Item register(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, ServerTest.id(name), item);
    }
}
