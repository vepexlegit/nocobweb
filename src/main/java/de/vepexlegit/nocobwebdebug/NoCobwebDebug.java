package de.vepexlegit.nocobwebdebug;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = NoCobwebDebug.MODID, version = NoCobwebDebug.VERSION)
public class NoCobwebDebug {
    public static final String MODID = "nocobwebdebug";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
    }
}
