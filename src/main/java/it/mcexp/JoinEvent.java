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

    player.setAllowFlight(false);
    player.setFlying(false);
    player.setGameMode(org.bukkit.GameMode.SURVIVAL);
    event.setJoinMessage(null);

    Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("NoFly"), () -> {

        player.setAllowFlight(false);
        player.setFlying(false);
        player.setGameMode(org.bukkit.GameMode.SURVIVAL);


    }, 40L);

  }

}
