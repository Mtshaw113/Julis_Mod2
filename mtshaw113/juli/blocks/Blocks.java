package mtshaw113.juli.blocks;

import mtshaw113.juli.items.ItemInfo;
import mtshaw113.juli.items.JuliIngot;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks
{

	public static Block ore;
	public static Block blockJ;
	public static Block plank;
	public static Item ingot;
	public static Block birthday;
	
	public static void init() 
	{
	    
	    ingot = new JuliIngot(ItemInfo.INGOT_ID);
	    
		ore = new oreJuli(BlockInfo.ORE_ID);
		GameRegistry.registerBlock(ore, BlockInfo.ORE_KEY);
		
		blockJ = new BlockJuli(BlockInfo.BLOCK_JULI_ID, Material.rock);
        GameRegistry.registerBlock(blockJ, BlockInfo.BLOCK_JULI_KEY);
        
        plank = new Plank(BlockInfo.PLANK_ID, Material.wood);
        GameRegistry.registerBlock(plank, BlockInfo.PLANK_KEY);
        
        birthday = new BirthdayBlock(BlockInfo.BIRTHDAY_ID, Material.rock);
        GameRegistry.registerBlock(birthday, BlockInfo.BIRTHDAY_KEY);
        
	}
	
	
	public static void addNames() {
		LanguageRegistry.addName(ore, BlockInfo.ORE_NAME);
		LanguageRegistry.addName(blockJ, BlockInfo.BLOCK_JULI_NAME);
		LanguageRegistry.addName(plank, BlockInfo.PLANK_NAME);
		LanguageRegistry.addName(birthday, BlockInfo.BIRTHDAY_NAME);
	}
	
	public static void registerRecipes() {
	        
	    //GameRegistry.addRecipe(new ItemStack(blockJuli), 
	    //        new Object[]{
	   //     "XXX",
	   //     "XXX",
	   //     "XXX",
	   //         'X', ingot
	  //  });
	    
	    GameRegistry.addRecipe(new ItemStack(blockJ), new Object[]{    
	                              "XXX",
                                  "XXX",
                                  "XXX",
                                  
                                  'X', ingot
                                  
                            });
	    
	    
	    
	}
	
	
}
