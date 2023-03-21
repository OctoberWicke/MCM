package com.greymanloveslancer.Trash_Villainous;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = GreymanLovesLancer.MODID, name = GreymanLovesLancer.NAME, version = GreymanLovesLancer.VERSION)
public class GreymanLovesLancer
{
    public static final String MODID = "greymanloveslancer";
    public static final String NAME = "Greyman Loves Lancer";
    public static final String VERSION = "0.0.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
