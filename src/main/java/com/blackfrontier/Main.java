package com.blackfrontier;

import com.blackfrontier.events.Excavator;
import com.blackfrontier.objects.recipes.SmeltingRecipes;
import com.blackfrontier.proxy.CommonProxy;
import com.blackfrontier.util.Resource;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Resource.MODID, name = Resource.NAME, version = Resource.VERSION)
public class Main
{
    @Mod.Instance(Resource.MODID)
    public static Main instance;

    @SidedProxy(clientSide = Resource.CLIENT, serverSide = Resource.COMMON)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new Excavator());
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        SmeltingRecipes.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {}
}
