package mtshaw113.juli.items;

import mtshaw113.juli.blocks.BlockInfo;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {

	public static Item wand;
	public static Item card;
	public static Item ingot;
	public static Block ore;

	
	public static void init() {
		wand = new ItemWand(ItemInfo.WAND_ID);
		card = new ItemCard(ItemInfo.CARD_ID);
		ingot = new JuliIngot(ItemInfo.INGOT_ID);
	}
		
	
	public static void addNames() {
		LanguageRegistry.addName(wand, ItemInfo.WAND_NAME);
		
		for (int i = 0; i < ItemInfo.CARD_NAMES.length; i++) {
			LanguageRegistry.addName(new ItemStack(card, 1, i), ItemInfo.CARD_NAMES[i]);
		}
			
		LanguageRegistry.addName(ingot, ItemInfo.INGOT_NAME);
		
	}

	
	public static void registerRecipes() {
		
		GameRegistry.addRecipe(new ItemStack(wand), 
				new Object[] {    "  X",
							      " / ",
								  "/  ",
								  
								  'X', Item.goldenCarrot,
								  '/', Item.stick
							});
			
		GameRegistry.addSmelting(BlockInfo.ORE_ID, new ItemStack(ingot), 0.7f);
		
	
		
	}
	
}
