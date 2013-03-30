package heatcraft;

import cpw.mods.fml.common.registry.LanguageRegistry;
import heatcraft.items.ItemManager;

public class LanguageManager {
    public LanguageManager() {
        // Item names
        LanguageRegistry.addName(ItemManager.testItem, "Test Item");
        
        // Block names
        
        // Other
        LanguageRegistry.instance().addStringLocalization("itemGroup.HeatCraft", "en_US", "HeatCraft");
    }
}
