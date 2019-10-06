package me.arasple.mc.trmenu.actions.ext;

import io.izzel.taboolib.module.locale.TLocale;
import me.arasple.mc.trmenu.actions.BaseAction;
import me.arasple.mc.trmenu.utils.Vars;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryEvent;

/**
 * @author Arasple
 * @date 2019/10/5 14:33
 */
public class IconActionActionbarBroadcast extends BaseAction {

    public IconActionActionbarBroadcast(String command) {
        super(command);
    }

    @Override
    public void onExecute(Player player, InventoryEvent e) {
        Bukkit.getOnlinePlayers().forEach(p -> TLocale.Display.sendActionBar(p, Vars.replace(player, getCommand())));
    }

}
