package com.shinymagnemite.testmod;

import com.shinymagnemite.testmod.lib.Reference;
import com.shinymagnemite.testmod.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
//@NetworkMod ( channels = (Reference.CHANNEL), clientSideRequired = true, serverSideRequired = true)

public class TestMod
{
		//@SidedProxy(clientSide = Reference.PROXY_LOCATION + ".ClientProxy", serverSide = Reference.PROXY_LOCATION + ".CommonProxy")
		public static CommonProxy proxy;
		
		@Mod.EventHandler
		public void preInit(FMLPreInitializationEvent event)
		//preInit stage will create all the blocks and items
		{
			ModItems.init();
			//ModBlocks.init();
			
			proxy.initRenderers();
			proxy.initSounds();
		}
		@Mod.EventHandler
		public void Init(FMLInitializationEvent event)
		//Init stage will register recipes and on command prompts
		{
			
		}
		@Mod.EventHandler
		public void postInit(FMLPostInitializationEvent event)
		//postInit stage handles interactions/support with other mods
		{
			
		}

}
