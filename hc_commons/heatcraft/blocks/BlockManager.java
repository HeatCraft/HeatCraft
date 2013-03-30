package heatcraft.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockManager {
	// Added blocks
	public final static Block heatBlock = new HeatBlock(500,0,Material.iron).setHardness(1.0F).setStepSound(Block.soundStoneFootstep)
			.setBlockName("heatBlock").setCreativeTab(CreativeTabs.tabBlock);
	
	// Block Manager constructor
	public BlockManager() {
		
		// Registers all HC blocks
		RegisterBlocks();
	}
	
	private void RegisterBlocks() {
		GameRegistry.registerBlock(heatBlock, "heatBlock");
		LanguageRegistry.addName(heatBlock, "Heat Block");
	}
}
