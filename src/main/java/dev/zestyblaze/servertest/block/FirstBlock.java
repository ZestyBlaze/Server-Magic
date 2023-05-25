package dev.zestyblaze.servertest.block;

import eu.pb4.polymer.core.api.block.PolymerBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class FirstBlock extends Block implements PolymerBlock {
    public FirstBlock(Properties properties) {
        super(properties);
    }

    @Override
    public Block getPolymerBlock(BlockState state) {
        return Blocks.BLUE_WOOL;
    }
}
