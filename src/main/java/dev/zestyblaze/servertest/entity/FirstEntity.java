package dev.zestyblaze.servertest.entity;

import com.mojang.datafixers.util.Pair;
import eu.pb4.polymer.core.api.entity.PolymerEntity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import java.util.List;

public class FirstEntity extends Mob implements PolymerEntity {
    public FirstEntity(EntityType<? extends Mob> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public EntityType<?> getPolymerEntityType(ServerPlayer player) {
        return EntityType.ZOMBIE;
    }

    @Override
    public List<Pair<EquipmentSlot, ItemStack>> getPolymerVisibleEquipment(List<Pair<EquipmentSlot, ItemStack>> items, ServerPlayer player) {
        for (var entry : items) {
            if (entry.getFirst() == EquipmentSlot.HEAD) {
                continue;
            } else {
                items.add(Pair.of(entry.getFirst(), entry.getSecond()));
            }
        }
        items.add(new Pair<>(EquipmentSlot.HEAD, new ItemStack(Items.WITHER_SKELETON_SKULL)));

        return items;
    }
}
