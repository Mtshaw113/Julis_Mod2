package mtshaw113.juli;

import mtshaw113.juli.biome.BiomeGenJuli;
import mtshaw113.juli.blocks.Blocks;
import mtshaw113.juli.config.ConfigHandler;
import mtshaw113.juli.interfaces.GuiHandler;
import mtshaw113.juli.items.Items;
import mtshaw113.juli.proxies.CommonProxy;
import mtshaw113.juli.tileentity.TileEntityJuli;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION)
@NetworkMod(channels = {ModInformation.CHANNEL}, clientSideRequired = true, serverSideRequired = false)
public class Juli {


    @Instance(ModInformation.ID)
    public static Juli instance; 

    @SidedProxy(clientSide="mtshaw113.juli.proxies.ClientProxy", serverSide="mtshaw113.juli.proxies.CommonProxy")
    public static CommonProxy proxy;

    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	ConfigHandler.init(event.getSuggestedConfigurationFile());    	
    	Items.init();
    	Blocks.init();
    	
    	Blocks.registerTileEntities();
    	
    	proxy.initSounds();
    	proxy.initRenderers();
    	
    }
    
    //Event Manager
    public static EventManager eventmanager = new EventManager();
    
    //Blocks
    public static Block oreJuli;
    public static Block plank;
    public static Block bbjuli;
    public static Block birthday;
    
    
    //Items
    //public static Item JuliIngot;
    public static Item ItemWand;

    //Biome
    public static BiomeGenBase JuliBiome;
    
    //Dimension
    public static int DimID = 2;

    //World Gen?
    public static boolean plantsFlag = true;
    public static boolean skyColorFlag = false;
    public static boolean useOreGens = true;

public static CreativeTabs tabCustom = new CreativeTabs("tabCustom") {


	public ItemStack getIconItemStack() {
            return new ItemStack(Item.appleGold, 1, 0);
    }
};

    
    @EventHandler
    public void load(FMLInitializationEvent event) {            
            GameRegistry.registerWorldGenerator(eventmanager);
            
            

            Items.addNames();
            Blocks.addNames();
            
            Items.registerRecipes();
            Blocks.registerRecipes();
            
            MinecraftForge.setBlockHarvestLevel(oreJuli, "pickaxe", 2);
            
            LanguageRegistry.instance().addStringLocalization("itemGroup.tabCustom", "en_US", "Juli's Mod");
            
            JuliBiome = (new BiomeGenJuli(30).setBiomeName("Juli's Biome").setDisableRain().setTemperatureRainfall(2.0F, 0.0F).setMinMaxHeight(0.1F, 0.2F));

            new GuiHandler();
            
    }
	
    @EventHandler
    public void modsloaded(FMLPostInitializationEvent event) {
    	
    }
    
}
