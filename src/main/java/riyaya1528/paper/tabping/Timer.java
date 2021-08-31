package riyaya1528.paper.tabping;

import org.bukkit.scheduler.BukkitRunnable;

public class Timer {
    public static void Start() {
        new BukkitRunnable() {
                    @Override
                    public void run() {
                        TabShower.ShowPing();
                        Start();
                    }
                }.runTaskLater(TabPing.Plugin, 200);
    }
}
