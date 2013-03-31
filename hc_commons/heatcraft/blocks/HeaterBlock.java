package heatcraft.blocks;

import heatcraft.HeatCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class HeaterBlock extends Block {

	// Default super constructor
	public HeaterBlock(int id) {
		super(id, Material.rock);
		
		this.setHardness(1.0F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setBlockName("heaterBlock");
		this.setCreativeTab(HeatCraft.tabHeatCraft);
		this.setCreativeTab(CreativeTabs.tabBlock);
		
		this.blockIndexInTexture = 0;
		
		//this.setTextureFile(CommonProxy.BLOCK_PNG);
		
	}
	
	@Override
    public int getBlockTextureFromSideAndMetadata (int side, int metadata) {
        switch(side) {
        	case 0:
                return (blockIndexInTexture + 1);
        	case 1:
                return (blockIndexInTexture + 1);
        }
        
        if (metadata == 1) {
        	return (blockIndexInTexture + 2);
        } else {
        	return blockIndexInTexture;
        }
    }
    
    @Override
    public String getTextureFile()
    {
            return heatcraft.CommonProxy.BLOCK_PNG;
    }
}
