package dev.zestyblaze.servertest.item.base;

import eu.pb4.polymer.core.api.item.PolymerItem;
import net.minecraft.world.item.Item;

public abstract class BaseItem extends Item implements PolymerItem {
    public BaseItem(Properties properties) {
        super(properties);
    }
}
