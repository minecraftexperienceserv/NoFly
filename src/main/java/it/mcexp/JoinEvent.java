package it.mcexp;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event) {

    Player player = event.getPlayer();

    Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("NoFly"), () -> {

        player.setAllowFlight(false);
        player.setFlying(false);

    }, 40L);

    event.setJoinMessage(null);

  }

}
