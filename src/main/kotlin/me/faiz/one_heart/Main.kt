package me.faiz.one_heart
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin

class Main:JavaPlugin(),Listener {

    override fun onEnable() {
        this.server.pluginManager.registerEvents(this,this)
        this.server.logger.info("§l§bone_heart plugin is loaded!")
    }

    @EventHandler
    fun onJoin(e:PlayerJoinEvent){
        e.player.maxHealth = 0.1
        e.player.health = 0.1
    }



}