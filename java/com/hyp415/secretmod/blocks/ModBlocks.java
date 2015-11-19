package com.hyp415.secretmod.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block secretBlock;
	
	public static void createBlocks(){
		GameRegistry.registerBlock(secretBlock = new BasicBlock("secret_block").setLightLevel(1.0f), "secret_block");
	}

}
