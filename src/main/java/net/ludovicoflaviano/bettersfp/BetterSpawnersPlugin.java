package net.ludovicoflaviano.bettersfp;
import net.ludovicoflaviano.bettersfp.command.BetterCommand;
import net.ludovicoflaviano.bettersfp.data.SpawnerStore;
import net.ludovicoflaviano.bettersfp.economy.EconomyHook;
import net.ludovicoflaviano.bettersfp.gui.SpawnerGui;
import net.ludovicoflaviano.bettersfp.listener.SpawnerListener;
import net.ludovicoflaviano.bettersfp.production.ProductionTask;
import org.bukkit.plugin.java.JavaPlugin;
public final class BetterSpawnersPlugin extends JavaPlugin {
 private SpawnerStore store; private EconomyHook economy; private SpawnerGui gui;
 public void onEnable(){saveDefaultConfig();economy=new EconomyHook(this);if(getConfig().getBoolean("settings.require-vault",true)&&!economy.isReady()){getLogger().severe("No Vault economy service found.");getServer().getPluginManager().disablePlugin(this);return;}store=new SpawnerStore(this);store.load();gui=new SpawnerGui(this,store,economy);getServer().getPluginManager().registerEvents(new SpawnerListener(this,store,gui),this);BetterCommand cmd=new BetterCommand(this,store);getCommand("betterspawners").setExecutor(cmd);getCommand("betterspawners").setTabCompleter(cmd);long ticks=Math.max(20L,getConfig().getLong("settings.production-interval-seconds",5)*20L);getServer().getScheduler().runTaskTimer(this,new ProductionTask(this,store),ticks,ticks);}
 public void onDisable(){if(store!=null)store.save();}
}
