package com.blackfrontier.objects.tools;

import com.blackfrontier.Main;
import com.blackfrontier.init.ModObjects;
import com.blackfrontier.util.IHasModel;
import net.minecraft.item.ItemPickaxe;

public class SteelPickaxe extends ItemPickaxe implements IHasModel {
    public SteelPickaxe(String name, ToolMaterial material) {
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
