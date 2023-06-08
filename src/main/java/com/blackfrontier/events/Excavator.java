package com.blackfrontier.events;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class Excavator {
    @SubscribeEvent
    public void RightClickEvent(PlayerInteractEvent.RightClickItem event) {
        EntityPlayer player = event.getEntityPlayer();

        if (!player.world.isRemote) {
            Vec3d aim = player.getLookVec();

            for (int i = 1; i <= 20; i++) {
                player.world.newExplosion(player, player.posX + (aim.x * i) + Math.ceil(aim.x), player.posY + (aim.y * i) + Math.ceil(aim.y), player.posZ + (aim.z * i) + Math.ceil(aim.z), 1f, false, true);
            }
        }
    }
}
