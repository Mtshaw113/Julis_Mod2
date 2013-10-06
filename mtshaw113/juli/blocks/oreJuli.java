package mtshaw113.juli.blocks;

import mtshaw113.juli.Juli;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class oreJuli extends Block {
	
	
	public static Block oreJuli;

	public oreJuli(int id) {
			super(id, Material.iron);
			
			setCreativeTab(Juli.tabCustom);
			setHardness(5F);
			setStepSound(Block.soundStoneFootstep);
			setUnlocalizedName(BlockInfo.ORE_UNLOCALIZED_NAME);
			  
			MinecraftForge.setBlockHarvestLevel(oreJuli, "pickaxe", 2);
			
		}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.ORE_ICON);
	
	}
}	
