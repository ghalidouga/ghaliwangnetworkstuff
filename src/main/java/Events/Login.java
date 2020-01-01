package Events;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.potion.PotionEffectType;

public class Login implements Listener {
    @EventHandler
    public void onLogin (fr.xephi.authme.events.LoginEvent e){
        Player player = e.getPlayer();
        Location overWorld = new Location(Bukkit.getWorld("world"),0,100,0,0,0);
        player.teleport(overWorld);




    }
}
