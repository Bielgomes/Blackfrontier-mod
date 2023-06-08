package com.blackfrontier.objects.recipes;

import com.blackfrontier.init.ModObjects;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
    public static void init() {
        GameRegistry.addSmelting(new ItemStack(Items.IRON_INGOT), new ItemStack(ModObjects.STEELINGOT), 0.4f);
    }
}
