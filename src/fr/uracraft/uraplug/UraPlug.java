package fr.uracraft.uraplug;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class UraPlug extends JavaPlugin {

    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE + "[UraPlug] Bonjour !");
        saveDefaultConfig();
        PluginManager pm = getServer().getPluginManager();
        //pm.registerEvents(new MaClasse(this), this);
    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE + "[UraPlug] A la prochaine !");
    }
}