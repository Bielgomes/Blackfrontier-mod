package com.blackfrontier.objects.blocks;

import com.blackfrontier.Main;
import com.blackfrontier.init.ModObjects;
import com.blackfrontier.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class SteelBlock extends Block implements IHasModel {
    public SteelBlock(String name, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(5.0f);
        setResistance(30.0f);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(ModObjects.BLACKFRONTIERTAB);

        ModObjects.BLOCKS.add(this);
        ModObjects.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
