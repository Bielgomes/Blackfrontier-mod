package com.blackfrontier.objects.tools;

import akka.io.TcpMessage;
import com.blackfrontier.Main;
import com.blackfrontier.init.ModObjects;
import com.blackfrontier.util.IHasModel;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Hammer extends Item implements IHasModel {
    public Hammer(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ModObjects.BLACKFRONTIERTAB);

        setMaxStackSize(1);

        ModObjects.ITEMS.add(this);
    }

    // Click Direito no Item
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack item = playerIn.getHeldItem(handIn);
        if (!playerIn.world.isRemote) {
            BlockPos blockpos = playerIn.rayTrace(100, 1.0F).getBlockPos();

            EntityLightningBolt bolt = new EntityLightningBolt(worldIn, blockpos.getX(), blockpos.getY(), blockpos.getZ(), true);

            worldIn.spawnEntity(bolt);
            worldIn.addWeatherEffect(bolt);
            worldIn.setRainStrength(2f);

            worldIn.newExplosion(null, blockpos.getX(), blockpos.getY(), blockpos.getZ(), 3f, true, true);

            playerIn.getCooldownTracker().setCooldown(item.getItem(), 15);
        }

        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
    }

    // Usando o Item
    // public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
    //    return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    // }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
