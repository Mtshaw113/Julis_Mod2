package mtshaw113.juli.interfaces;

import mtshaw113.juli.tileentity.TileEntityJuli;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerBirthdayBlock extends Container{

    private TileEntityJuli juli;
    
    
    
    public ContainerBirthdayBlock(InventoryPlayer invPlayer, TileEntityJuli juli) {
        this.juli = juli;
    }
    
    
    @Override
    public boolean canInteractWith(EntityPlayer entityplayer) {
        return juli.isUseableByPlayer(entityplayer);
    }

}
