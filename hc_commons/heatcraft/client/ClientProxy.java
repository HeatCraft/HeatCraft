package heatcraft.client;

import net.minecraftforge.client.MinecraftForgeClient;
import heatcraft.CommonProxy;

public class ClientProxy extends CommonProxy {
    
    @Override
    public void registerRenderers() {
        MinecraftForgeClient.preloadTexture(ITEMS_PNG);
        MinecraftForgeClient.preloadTexture(BLOCK_PNG);
    }
}
