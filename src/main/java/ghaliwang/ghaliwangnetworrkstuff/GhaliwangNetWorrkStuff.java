package ghaliwang.ghaliwangnetworrkstuff;


import Events.Login;
import Events.Logout;
import Events.OnJoin;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class GhaliwangNetWorrkStuff extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new OnJoin(),this);
        getServer().getPluginManager().registerEvents(new Login(), this);
        getServer().getPluginManager().registerEvents(new Logout(),this);



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
