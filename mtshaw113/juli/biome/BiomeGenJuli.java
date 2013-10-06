package mtshaw113.juli.biome;

import java.util.Random;

import mtshaw113.juli.Juli;
import mtshaw113.juli.blocks.BlockInfo;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenJuli extends BiomeGenBase
{
    public BiomeGenJuli(int par1)
    {
        super(par1);
        this.spawnableCreatureList.clear();
        this.topBlock = (byte)BlockInfo.ORE_ID;
        this.fillerBlock = (byte)Block.blockDiamond.blockID;

    }
}
