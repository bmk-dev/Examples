
package org.bmk.ccrares.listeners;

import org.bmk.ccrares.util.Items;
import org.bmk.ccrares.util.Messager;
import org.bmk.ccrares.util.Util;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.inventory.meta.ItemMeta;

public class BlockBreakListener implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockBreak(BlockBreakEvent e) {
        if (!e.isCancelled()) {
            ItemStack i = e.getPlayer().getItemInHand(); // Get item in player's hand when they broke the block
            if (i != null) {
                // Check whether the item player is holding has the lore we want
                if (Items.hasLore(i, Items.fellingAxeLore)) {
                    // Get the block broken
                    Block block = e.getBlock();

                    // Check whether it is a log
                    if (Util.isLog(block)) {
                        // Loop through integers 0-29 (to check 30 blocks above where the player broke)
                        for (int in = 0; in < 30; in++) {
                            // Get block at 'in' blocks above the original
                            Block b = block.getRelative(0, in, 0);
                            // Check whether this new block is also a log
                            if (Util.isLog(b)) {
                                // If it is a log, break it
                                b.breakNaturally();
                            } else break; // Break out of loop if we hit a block that isn't a log
                        }
                    }
                }
            
        }
    }
}
