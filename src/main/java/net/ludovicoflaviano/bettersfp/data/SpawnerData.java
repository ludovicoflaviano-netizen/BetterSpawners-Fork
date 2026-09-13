package net.ludovicoflaviano.bettersfp.data;
import org.bukkit.Material;
import java.util.*;
public final class SpawnerData {
 public final String key; public UUID owner; public String entity; public int stack=1,speedLevel,yieldLevel,storageLevel; public long storedXp; public final Map<Material,Integer> items=new EnumMap<>(Material.class);
 public SpawnerData(String key,UUID owner,String entity){this.key=key;this.owner=owner;this.entity=entity;}
 public int capacity(int base,int per){return Math.max(1,base+storageLevel*per);}
 public int itemCount(){return items.values().stream().mapToInt(Integer::intValue).sum();}
}
