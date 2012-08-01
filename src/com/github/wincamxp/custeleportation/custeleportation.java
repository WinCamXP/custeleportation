package com.github.wincamxp.custeleportation;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class custeleportation extends JavaPlugin {

	public void onEnable(){
		getLogger().info("Custeleportation 1.0 initialized.");
	}
	
	public void onDisable(){
		getLogger().info("Custeleportation 1.0 disabled.");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		if(cmd.getName().equalsIgnoreCase("tp")){
			if(args.length == 2){
				Player tper = (Bukkit.getServer().getPlayer(args[0]));
				Player tpto = (Bukkit.getServer().getPlayer(args[1]));
				if (tper == null){
					return false;
				}else if (tpto == null){
					return false;
				}else{
					Location loc = tpto.getLocation();
					tper.teleport(loc);
					return true;
				}
			}else if (args.length == 1){
				Player tpto = (Bukkit.getServer().getPlayer(args[0]));
				if (tpto == null){
					return false;
				}else{
					if ((sender instanceof Player)){
						Location loc = tpto.getLocation();
					Player p = (Player) sender;
					p.teleport(loc);
					return true;
					}
				}
			}else{
				return false;
			}
		}
	return false;
	}
		
}