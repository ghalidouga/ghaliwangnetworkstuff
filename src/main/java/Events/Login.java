package Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class Login implements Listener {
    @EventHandler
    public void onLogin (fr.xephi.authme.events.LoginEvent e){
        Player player = e.getPlayer();
        

    }
}
