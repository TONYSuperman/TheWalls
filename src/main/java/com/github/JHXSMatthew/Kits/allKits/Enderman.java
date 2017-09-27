package com.github.JHXSMatthew.Kits.allKits;

import com.github.JHXSMatthew.Kits.KitBasic;
import com.github.JHXSMatthew.Kits.KitType;
import org.bukkit.event.Listener;

import java.util.UUID;

/**
 * Created by Matthew on 2016/5/21.
 */
public class Enderman extends KitBasic implements Listener {

    public Enderman(UUID uuid, int level) {
        super(uuid, level, KitType.enderman);
    }

}
