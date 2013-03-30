package heatcraft.items;

import net.minecraft.item.Item;
import heatcraft.HeatCraft;

public class TestItem extends Item {
    
    public TestItem(int id) {
        super(id);
        setMaxStackSize(64);
        setCreativeTab(HeatCraft.tabHeatCraft);
        setItemName("testItem");
        setTextureFile(heatcraft.CommonProxy.ITEMS_PNG);
        setIconIndex(0);
    }
}
