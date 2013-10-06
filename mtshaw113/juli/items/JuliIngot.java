package mtshaw113.juli.items;

import mtshaw113.juli.Juli;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class JuliIngot extends Item{

	public JuliIngot(int id) {
			super(id);
			
			maxStackSize = 64;
			setCreativeTab(Juli.tabCustom);
			setUnlocalizedName("ingotJuli");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.INGOT_ICON);
	
	}
}