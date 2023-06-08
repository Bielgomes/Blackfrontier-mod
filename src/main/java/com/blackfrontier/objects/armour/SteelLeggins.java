package com.blackfrontier.objects.armour;

import com.blackfrontier.Main;
import com.blackfrontier.init.ModObjects;
import com.blackfrontier.util.IHasModel;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class SteelLeggins extends ItemArmor implements IHasModel {
    public SteelLeggins(String name, ItemArmor.ArmorMaterial material, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(material, renderIndexIn, equipmentSlotIn);
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
