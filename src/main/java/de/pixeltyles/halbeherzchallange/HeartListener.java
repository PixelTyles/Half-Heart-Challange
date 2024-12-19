package de.pixeltyles.halbeherzchallange;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class HeartListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.setJoinMessage(null);
        event.getPlayer().setHealthScale(1);
    }

    @EventHandler
    public void onDie(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();

            event.setCancelled(true);
            player.setGameMode(GameMode.SPECTATOR);
            player.sendMessage("§8» §9PixelTyles §8| Du hast verloren");
        }



    }
}
