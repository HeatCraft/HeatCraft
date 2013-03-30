package heatcraft.items;

import net.minecraft.item.Item;

public class ItemManager {
    public ItemManager() {
    }

    // Loading Items
    public final static Item testItem = new TestItem(5000);
    public final static Item thermometerItem = new Thermometer(5001);
}
