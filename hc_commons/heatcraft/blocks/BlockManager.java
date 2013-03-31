package heatcraft.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockManager {
	// Added blocks
	public final static Block heaterBlock = new HeaterBlock(500);
	
	// Block Manager constructor
	public BlockManager() {
		
		// Registers all HC blocks
		RegisterBlocks();
	}
	
	private void RegisterBlocks() {
		GameRegistry.registerBlock(heaterBlock, "heaterBlock");
		//LanguageRegistry.addName(heaterBlock, "Heater");
	}
}
