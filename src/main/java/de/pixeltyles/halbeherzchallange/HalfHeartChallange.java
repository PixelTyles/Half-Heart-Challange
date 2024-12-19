package de.pixeltyles.halbeherzchallange;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class HalfHeartChallange extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager pl = Bukkit.getPluginManager();
        pl.registerEvents(new HeartListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
