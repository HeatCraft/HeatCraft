package heatcraft.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class ItemManager {
    public ItemManager() {
        loadLanguages();
    }

    // Loading Items
    private final static Item testItem = new TestItem(5000);
    
    public static void loadLanguages() {
        LanguageRegistry.addName(testItem, "Test Item");
    }
}
