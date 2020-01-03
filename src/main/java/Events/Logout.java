package Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class Logout implements Listener {
    @EventHandler
    public void logout (fr.xephi.authme.events.LogoutEvent e){
        Player player = e.getPlayer();
        player.kickPlayer("Reconnect to login again");
    }
}
