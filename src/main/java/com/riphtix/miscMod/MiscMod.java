package com.riphtix.miscMod;

import com.riphtix.miscMod.configuration.ConfigurationHandler;
import com.riphtix.miscMod.proxy.IProxy;
import com.riphtix.miscMod.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class MiscMod {

    //Objects
    //Mod Instance
    @Mod.Instance(Reference.MOD_ID)
    public static MiscMod instance;

    //Proxy stuff
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    /*
    --preInitialization--
    >>Network Handling<<
    >>Mod Config<<
    >>Items<<
    >>Blocks<<
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preInitEvent){
        ConfigurationHandler.init(preInitEvent.getSuggestedConfigurationFile());
    }

    /*
    --Initialization--
    >>GUI<<
    >>Tile Entities<<
    >>Crafting Recipes<<
    >>General Event Handlers<<
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent initEvent){

    }

    /*
    --postInitialization--
    >>After Everything else<<
     */
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postInitEvent){

    }
}