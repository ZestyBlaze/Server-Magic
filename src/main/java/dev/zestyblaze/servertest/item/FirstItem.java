package dev.zestyblaze.servertest.item;

import dev.zestyblaze.servertest.item.base.BaseItem;
import eu.pb4.polymer.core.api.item.PolymerItemUtils;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantments;
import org.jetbrains.annotations.Nullable;

public class FirstItem extends BaseItem {
    public FirstItem(Properties properties) {
        super(properties);
    }

    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayer player) {
        return Items.DIAMOND;
    }

    @Override
    public ItemStack getPolymerItemStack(ItemStack itemStack, TooltipFlag flag, @Nullable ServerPlayer player) {
        ItemStack out = PolymerItemUtils.createItemStack(itemStack, player);
        out.enchant(Enchantments.BLOCK_EFFICIENCY, 0);
        return out;
    }
}
