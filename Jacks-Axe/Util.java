package org.bmk.ccrares.util;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

    // Checks whether block is a log
    public static boolean isLog(Block b) {
        Material mat = b.getType();
        if(mat == Material.ACACIA_LOG || mat == Material.BIRCH_LOG || mat == Material.CHERRY_LOG || mat == Material.JUNGLE_LOG
                || mat == Material.DARK_OAK_LOG || mat == Material.DARK_OAK_LOG || mat == Material.OAK_LOG || mat == Material.MANGROVE_LOG
                || mat == Material.SPRUCE_LOG || mat == Material.STRIPPED_ACACIA_LOG || mat == Material.STRIPPED_BIRCH_LOG
                || mat == Material.STRIPPED_CHERRY_LOG || mat == Material.STRIPPED_SPRUCE_LOG || mat == Material.STRIPPED_DARK_OAK_LOG
                || mat == Material.STRIPPED_JUNGLE_LOG || mat == Material.STRIPPED_OAK_LOG || mat == Material.STRIPPED_MANGROVE_LOG) {
            return true;
        }

        // If not a log above, then we return false
        return false;
    }

}
