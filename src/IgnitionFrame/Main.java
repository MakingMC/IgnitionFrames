package IgnitionFrame;


import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.painting.PaintingBreakByEntityEvent;
import org.bukkit.event.painting.PaintingBreakEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener
{
    public void onEnable(){
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(this, this);
    }
    public void onDisable(){

    }
    @EventHandler
    public void onPaintingShot(PaintingBreakByEntityEvent e){
        e.setCancelled(true);
    }
    @EventHandler
    public void onPaintingBreak(PaintingBreakEvent e){
        e.setCancelled(true);
    }
    @EventHandler
    public void onFrameShot(EntityDamageByEntityEvent e) {
        if (e.getEntityType().equals(EntityType.ITEM_FRAME)) {
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void onFrameBreak(EntityDamageEvent e) {
        if (e.getEntityType().equals(EntityType.ITEM_FRAME)) {
            e.setCancelled(true);
        }
    }
}
