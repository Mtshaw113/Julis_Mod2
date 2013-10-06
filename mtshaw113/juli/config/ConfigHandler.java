package mtshaw113.juli.config;

import java.io.File;

import mtshaw113.juli.blocks.BlockInfo;
import mtshaw113.juli.items.ItemInfo;
import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	
	public static void init(File file) {
		Configuration config = new Configuration(file);
		
		config.load();
		
		//Blocks
		BlockInfo.ORE_ID = config.getBlock(BlockInfo.ORE_KEY, BlockInfo.ORE_DEFAULT).getInt();
		BlockInfo.PLANK_ID = config.getBlock(BlockInfo.PLANK_KEY, BlockInfo.PLANK_DEFAULT).getInt();
		BlockInfo.BIRTHDAY_ID = config.getBlock(BlockInfo.BIRTHDAY_KEY, BlockInfo.BIRTHDAY_DEFAULT).getInt();
		BlockInfo.BLOCK_JULI_ID = config.getBlock(BlockInfo.BLOCK_JULI_KEY, BlockInfo.BLOCK_JULI_DEFAULT).getInt();	
		
		//Items
		ItemInfo.WAND_ID = config.getItem(ItemInfo.WAND_KEY, ItemInfo.WAND_DEFAULT).getInt() - 256;
		ItemInfo.CARD_ID = config.getItem(ItemInfo.CARD_KEY, ItemInfo.CARD_DEFAULT).getInt() - 256;
		ItemInfo.INGOT_ID = config.getItem(ItemInfo.INGOT_KEY, ItemInfo.INGOT_DEFAULT).getInt() -256;
		
		
		config.save();
		
	}
	
}
