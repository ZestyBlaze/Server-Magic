package dev.zestyblaze.servertest.registry;

import dev.zestyblaze.servertest.ServerTest;
import dev.zestyblaze.servertest.entity.FirstEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.monster.Zombie;

public class EntityRegistry {
    public static final EntityType<FirstEntity> FIRST_ENTITY = (EntityType<FirstEntity>) register("first_entity", FabricEntityTypeBuilder.create(MobCategory.MONSTER, FirstEntity::new).dimensions(EntityDimensions.scalable(1.0f, 1.0f)).build());

    private static EntityType<?> register(String name, EntityType<?> item) {
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, ServerTest.id(name), item);
    }

    public static void init() {
        FabricDefaultAttributeRegistry.register(FIRST_ENTITY, Zombie.createAttributes());
    }
}
