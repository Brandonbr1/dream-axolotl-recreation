package me.brandon.dreamaxolotl.recreation.dreamaxolotlrecreation;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;
import org.bukkit.entity.Entity.Spigot;

public class Drown implements Listener {
    private final String prefix = (Object) ChatColor.BOLD + "SkyShock" + ChatColor.DARK_GRAY.toString() + (Object)ChatColor.BOLD + ">>" + " ";

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        player.setVelocity(new Vector(player.getVelocity().getX(), player.getVelocity().getY() / 0.01, player.getVelocity().getZ()));
        player.setFallDistance(player.getFallDistance() / 3.0f); //will fix later
        player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 3));
        player.sendMessage(String.valueOf(this.prefix) + (Object)ChatColor.DARK_AQUA + "You have entered a space realm...");
        player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Integer.MAX_VALUE, 1));
        player.setMaximumAir(300); // setMaximumAir(int 10); a.getKey().setRemainingAir(a.getValue() / 100 * 3); may be better

    }

}
