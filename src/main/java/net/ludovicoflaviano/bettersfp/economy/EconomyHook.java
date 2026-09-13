package net.ludovicoflaviano.bettersfp.economy;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.OfflinePlayer;
import org.bukkit.plugin.java.JavaPlugin;
public final class EconomyHook {
 private final Economy economy;
 public EconomyHook(JavaPlugin p){Economy e=null;var r=p.getServer().getServicesManager().getRegistration(Economy.class);if(r!=null)e=r.getProvider();economy=e;}
 public boolean isReady(){return economy!=null;}
 public boolean take(OfflinePlayer p,double a){return economy!=null&&a>=0&&economy.getBalance(p)+1e-9>=a&&economy.withdrawPlayer(p,a).transactionSuccess();}
 public String format(double a){return economy==null?String.format("$%,.0f",a):economy.format(a);}
}
