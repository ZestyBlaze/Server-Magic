package dev.zestyblaze.servertest.registry;

import dev.zestyblaze.servertest.ServerTest;
import dev.zestyblaze.servertest.block.FirstBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class BlockRegistry {
    public static final Block FIRST_BLOCK = register("first_block", new FirstBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL)));

    private static Block register(String name, Block item) {
        return Registry.register(BuiltInRegistries.BLOCK, ServerTest.id(name), item);
    }

    public static void init() {}
}
