package mtshaw113.juli.blocks;

import mtshaw113.juli.Juli;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Plank extends Block {
    
    
    public static Block plank;

    public Plank(int id, Material par2Material) {
            super(id, par2Material);
            
            setCreativeTab(Juli.tabCustom);
            setHardness(5F);
            setStepSound(Block.soundWoodFootstep);
            setUnlocalizedName(BlockInfo.PLANK_UNLOCALIZED_NAME);
              
            MinecraftForge.setBlockHarvestLevel(plank, "axe", 1);
            
            
        }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        blockIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.PLANK_ICON);
    
    }
}   
