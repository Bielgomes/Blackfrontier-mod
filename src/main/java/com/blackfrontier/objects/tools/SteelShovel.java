package com.blackfrontier.objects.tools;

import com.blackfrontier.Main;
import com.blackfrontier.init.ModObjects;
import com.blackfrontier.util.IHasModel;
import net.minecraft.item.ItemSpade;

public class SteelShovel extends ItemSpade implements IHasModel {
    public SteelShovel(String name, ToolMaterial material) {
        super(material);
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
