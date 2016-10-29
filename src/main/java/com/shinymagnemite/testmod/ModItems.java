package com.shinymagnemite.testmod;

import com.shinymagnemite.testmod.help.RegisterHelper;
import com.shinymagnemite.testmod.items.TestModItem;

import net.minecraft.item.Item;

public class ModItems
{
	public static Item testIngot = new TestModItem().setUnlocalizedName("testIngot");
	
	public static void init()
	{
		RegisterHelper.registerItem(testIngot);
	}
	
}