package org.bmk.ccrares.util;

import io.papermc.paper.datacomponent.item.WrittenBookContent;
import net.kyori.adventure.inventory.Book;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.components.EquippableComponent;
import org.bukkit.inventory.view.AnvilView;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Items {

    public static String fellingAxeLore = "&7Lumberjack's Axe";


    public static boolean hasLore(ItemStack i, String lore) {
        if(i.getItemMeta() != null && i.getItemMeta().getLore() != null) {
            if (i.getItemMeta().getLore().contains(ChatColor.translateAlternateColorCodes('&', lore))) {
                return true;
            }
        }
        return false;
    }

}
