    package mtshaw113.juli.tileentity;

import java.awt.Color;
import java.util.Random;

import mtshaw113.juli.fireworks.FireworkHelper;
import mtshaw113.juli.fireworks.FireworkHelper.FireworkExplosion;
import mtshaw113.juli.fireworks.FireworkHelper.FireworkType;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

    public class TileEntityJuli extends TileEntity{
     
        private int seconds;
        private int tick;
        private boolean isActive;
     
        @Override
        public void updateEntity() {
            tick++;
     
            if (tick >= 20) {
                tick = 0;
                seconds += 1;
            }
     
            if (!worldObj.isRemote) {
                if (isActive) {
                    if (seconds >= 2) {
                        Random random = new Random();
                        for (int i = 0; i < random.nextInt(5) + 5; i++) {
                            int color = new Color(30 + random.nextInt(256 - 30),
                                    30 + random.nextInt(256 - 30),
                                    30 + random.nextInt(256 - 30)).getRGB();
                            FireworkExplosion explosion = new FireworkExplosion(
                                    true,
                                    FireworkType.values()[random
                                            .nextInt(FireworkType.values().length)],
                                    color, false);
                            FireworkHelper.spawnInWorld(
                                    worldObj,
                                    xCoord + random.nextFloat() - 5
                                            + random.nextInt(9),
                                    yCoord + random.nextFloat(),
                                    zCoord - 5 + random.nextInt(9)
                                            + random.nextFloat(), explosion,
                                    random.nextInt(2) + 1);
                        }
                    }
                }
            }
            if(seconds >= 2) {
                seconds = 0;
            }
        }
     
        public void toggleState() {
            isActive = !isActive;
        }
     
        @Override
        public void writeToNBT(NBTTagCompound tagCompound) {
            super.writeToNBT(tagCompound);
            tagCompound.setBoolean("Active", isActive);
        }
     
        @Override
        public void readFromNBT(NBTTagCompound tagCompound) {
            super.readFromNBT(tagCompound);
            isActive = tagCompound.getBoolean("Active");
        }

        public boolean isUseableByPlayer(EntityPlayer entityplayer) {
            return entityplayer.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) <= 64;
        }

        
        
        

     
    }

