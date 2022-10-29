package it.mcexp.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class CestinoCommand implements CommandExecutor {

  public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
    Player p = (Player)sender;

    if(sender.hasPermission("essentials.cestino")){
      Inventory inv1 = Bukkit.getServer().createInventory((InventoryHolder) p, 36, "                Cestino");
      p.openInventory(inv1);
    } else {
      p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6★ &fPer sbloccare questo comando compra un vip!"));
    }
    return true;
  }
}
