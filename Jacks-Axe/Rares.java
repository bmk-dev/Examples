package org.bmk.ccrares;

import org.bmk.ccrares.commands.RewardCommand;
import org.bmk.ccrares.listeners.*;
import org.bmk.ccrares.util.Messager;
import org.bmk.ccrares.util.ParticleManager;
import org.bmk.ccrares.util.RandomFireWorks;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class Rares extends JavaPlugin {

    public static boolean debug = true;
    public static Plugin plugin;

    @Override
    public void onEnable() {

        // Plugin startup logic
        plugin = this;
        getServer().getPluginManager().registerEvents(new BlockBreakListener(),this);


        
    }

    @Override
    public void onDisable() {
        
        // Plugin shutdown logic
    }

  
}
