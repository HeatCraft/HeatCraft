package heatcraft.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class TestItem extends Item {
    
    public TestItem(int id) {
        super(id);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMisc);
        setItemName("testItem");
        setTextureFile("ITEMS_PNG");
        setIconCoord(1,1);
        setIconIndex(1);
    }
}
