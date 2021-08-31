package riyaya1528.paper.tabping;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class TabShower {
    public static void ShowPing() {
        for(Player p : Bukkit.getOnlinePlayers()) {
            double[] TPSDouble = Bukkit.getServer().getTPS();
            int TPS = (int) Math.round(TPSDouble[0]);
            p.setPlayerListHeader("§f§l===       §d§lとろろサーバー§f§l       ===\n§b§lオンラインプレイヤー : " + Bukkit.getOnlinePlayers().size() + "人\n");
            p.setPlayerListFooter("\n§e§lPing : " + p.getPing() + " §a§lTPS :" + TPS + "\n\n§f§l===  §d§lmc.tororo.xyz:11302 §f§l ===\n§f§l=== §d§lplay.tororo.xyz:11302 §f§l===");
        }
    }
}
