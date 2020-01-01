package Events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnJoin implements Listener {
    @EventHandler
    public void  onJoin (PlayerJoinEvent e){
        Player player = e.getPlayer();
        Location flatLogin = new Location(Bukkit.getWorld("flatLogin"),0.5,5,0.5,90,0);
        player.teleport(flatLogin);

    }
}
