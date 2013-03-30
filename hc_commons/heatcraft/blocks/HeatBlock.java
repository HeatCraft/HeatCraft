package heatcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import heatcraft.CommonProxy;

public class HeatBlock extends Block {

	// Default super constructor
	public HeatBlock(int id, int texture, Material material) {
		super(id, texture, material);
		setTextureFile(CommonProxy.BLOCK_PNG);
	}
}
