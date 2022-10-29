package it.mcexp;

import it.mcexp.commands.CestinoCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoFly extends JavaPlugin {

  @Override
  public void onEnable() {

    this.getServer().getPluginManager().registerEvents(new JoinEvent(), this);
    this.getServer().getPluginManager().registerEvents(new QuitEvent(), this);

    this.getCommand("disposal").setExecutor(new CestinoCommand());

  }
}
