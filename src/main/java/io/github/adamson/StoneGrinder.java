package io.github.adamson;

import org.bukkit.plugin.java.JavaPlugin;

public class StoneGrinder extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new GrindEventListener(), this);
    }
}
