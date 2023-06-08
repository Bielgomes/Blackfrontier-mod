package com.blackfrontier.objects.tabs;

import com.blackfrontier.init.ModObjects;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlackfrontierTab extends CreativeTabs {
    public BlackfrontierTab(String label) {
        super(label);
        setBackgroundImageName("blackfrontier.png");
    }

    public ItemStack getTabIconItem() {
        return new ItemStack(ModObjects.STEELINGOT);
    }
}
