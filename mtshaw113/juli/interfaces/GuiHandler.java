package mtshaw113.juli.interfaces;

import mtshaw113.juli.Juli;
import mtshaw113.juli.tileentity.TileEntityJuli;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler{

    public GuiHandler() {
        NetworkRegistry.instance().registerGuiHandler(Juli.instance, this);
    }
    
    
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world,
            int x, int y, int z) {
        switch (ID) {
            case 0: 
                TileEntity te = world.getBlockTileEntity(x, y, z);
                if (te != null && te instanceof TileEntityJuli) {
                    return new ContainerBirthdayBlock(player.inventory, (TileEntityJuli)te);
                }
                break;
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world,
            int x, int y, int z) {
        switch (ID) {
            case 0:
                return new GuiBirthdayBlock();
        }
        return null;
    }

}
