package heatcraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class TestItem extends Item {
    
    public TestItem(int id) {
        super(id);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMisc);
        setItemName("testItem");
        setTextureFile(heatcraft.CommonProxy.ITEMS_PNG);
        setIconIndex(0);
    }
}
