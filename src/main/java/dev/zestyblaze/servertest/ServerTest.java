package dev.zestyblaze.servertest;

import dev.zestyblaze.servertest.registry.BlockRegistry;
import dev.zestyblaze.servertest.registry.EntityRegistry;
import dev.zestyblaze.servertest.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerTest implements ModInitializer {
	public static final String MODID = "servertest";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	public static ResourceLocation id(String id) {
		return new ResourceLocation(MODID, id);
	}

	@Override
	public void onInitialize() {
		EntityRegistry.init();
		BlockRegistry.init();
		ItemRegistry.register();
	}
}
