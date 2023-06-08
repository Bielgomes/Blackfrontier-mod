package com.blackfrontier.objects.items;

import com.blackfrontier.Main;
import com.blackfrontier.init.ModObjects;
import com.blackfrontier.util.IHasModel;
import net.minecraft.item.Item;

public class SteelIngot extends Item implements IHasModel {
    public SteelIngot(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ModObjects.BLACKFRONTIERTAB);

        ModObjects.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
