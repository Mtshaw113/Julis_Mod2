package mtshaw113.juli.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mtshaw113.juli.Juli;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraftforge.common.MinecraftForge;

    

    public class BlockJuli extends Block{
     
        public static Block blockj;
     
        public BlockJuli(int id, Material par2Material) {
            super(id, par2Material);
     
            setCreativeTab(Juli.tabCustom);
            setHardness(5F);
            setStepSound(Block.soundStoneFootstep);
            setUnlocalizedName(BlockInfo.BLOCK_JULI_UNLOCALIZED_NAME);
     
            MinecraftForge.setBlockHarvestLevel(blockj, "pickaxe", 1);
     
        }
     
       /* @Override
        public boolean onBlockActivated(final World world, final int x,
                final int y, final int z, EntityPlayer par5EntityPlayer, int par6,
                float par7, float par8, float par9) {
            if (!world.isRemote) {
                if (world.getBlockTileEntity(x, y, z) != null) {
                    ((TileEntityJuli) world.getBlockTileEntity(x, y, z)).toggleState();
                }
            }
     
            return true;
        }
     
        @Override
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister register) {
            blockIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":"
                    + BlockInfo.BLOCK_JULI_ICON);
     
        }
     
        @Override
        public TileEntity createNewTileEntity(World world) {
            return new TileEntityJuli();
       }
       */ 
        
        @Override
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister register) {
            blockIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":"
                    + BlockInfo.BLOCK_JULI_ICON);
     
        }
        
        }
    
    
