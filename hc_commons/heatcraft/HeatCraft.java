package heatcraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import heatcraft.blocks.BlockManager;
import heatcraft.items.ItemManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid="HeatCraft", name="HeatCraft", version="0.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class HeatCraft {
        @Instance("HeatCraft")
        public static HeatCraft instance;
        
        @SidedProxy(clientSide="heatcraft.client.ClientProxy", serverSide="heatcraft.CommonProxy")
        public static CommonProxy proxy;
        
        @PreInit
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
        
        @Init
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                new ItemManager();
                new BlockManager();
                new LanguageManager();
        }
        
        @PostInit
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
        
        public static CreativeTabs tabHeatCraft = new CreativeTabs("HeatCraft") {
            public ItemStack getIconItemStack() {
                return new ItemStack(Item.eyeOfEnder, 1, 0);
            }
        }; 
}
