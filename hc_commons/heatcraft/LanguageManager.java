package heatcraft;

import cpw.mods.fml.common.registry.LanguageRegistry;
import heatcraft.blocks.BlockManager;
import heatcraft.items.ItemManager;

public class LanguageManager {
    public LanguageManager() {
        // Item names
        LanguageRegistry.addName(ItemManager.testItem, "Test Item");
        LanguageRegistry.addName(ItemManager.thermometerItem, "Thermometer");
       
        // Block names
        LanguageRegistry.addName(BlockManager.heaterBlock, "Heater");
        
        // Other
        LanguageRegistry.instance().addStringLocalization("itemGroup.HeatCraft", "en_US", "HeatCraft");
    }
}
