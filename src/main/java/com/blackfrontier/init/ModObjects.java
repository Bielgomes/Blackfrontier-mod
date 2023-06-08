package com.blackfrontier.init;

import com.blackfrontier.objects.blocks.*;
import com.blackfrontier.objects.items.*;
import com.blackfrontier.objects.tabs.BlackfrontierTab;
import com.blackfrontier.objects.tools.*;
import com.blackfrontier.objects.armour.*;

import com.blackfrontier.util.Resource;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModObjects {
    public static final List<Item> ITEMS = new ArrayList<Item>();
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    // TABS
    public static final CreativeTabs BLACKFRONTIERTAB = new BlackfrontierTab("blackfrontier");

    // MATERIALS
    public static final ToolMaterial STEEL_TOOL = EnumHelper.addToolMaterial("steel_tool", 3, 1561, 8.0F, 3.0F, 10);
    public static final ArmorMaterial STEEL_ARMOUR = EnumHelper.addArmorMaterial("steel_armour", Resource.MODID + ":steel", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.BLOCK_METAL_PLACE, 2.0F);

    // BLOCKS
    public static final Block STEELBLOCK = new SteelBlock("steel_block", Material.IRON);

    // ITEMS
    public static final Item STEELINGOT = new SteelIngot("steel_ingot");
    public static final Item HAMMER = new Hammer("hammer");

    // TOOLS
    public static final Item STEELAXE = new SteelAxe("steel_axe", STEEL_TOOL);
    public static final Item STEELHOE = new SteelHoe("steel_hoe", STEEL_TOOL);
    public static final Item STEELSHOVELE = new SteelShovel("steel_shovel", STEEL_TOOL);
    public static final Item STEELPICKAXE = new SteelPickaxe("steel_pickaxe", STEEL_TOOL);
    public static final Item STEELSWORD = new SteelSword("steel_sword", STEEL_TOOL);

    // ARMOUR
    public static final Item STEELHELMET = new SteelHelmet("steel_helmet", STEEL_ARMOUR, 1, EntityEquipmentSlot.HEAD);
    public static final Item STEELCHESTPLATE = new SteelChestplate("steel_chestplate", STEEL_ARMOUR, 1, EntityEquipmentSlot.CHEST);
    public static final Item STEELLEGGINS = new SteelLeggins("steel_leggins", STEEL_ARMOUR, 2, EntityEquipmentSlot.LEGS);
    public static final Item STEELBOOTS = new SteelBoots("steel_boots", STEEL_ARMOUR, 1, EntityEquipmentSlot.FEET);

    public static Item[] registerItems() {
        return ITEMS.toArray(new Item[0]);
    }

    public static Block[] registerBlocks() {
        return BLOCKS.toArray(new Block[0]);
    }
}
