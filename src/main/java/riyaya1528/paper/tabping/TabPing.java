package riyaya1528.paper.tabping;

import org.bukkit.plugin.java.JavaPlugin;

public final class TabPing extends JavaPlugin {
    public static TabPing Plugin;

    @Override
    public void onEnable() {
        Plugin = this;
        Timer.Start();
        getLogger().info("プラグインが有効になりました");
    }

    @Override
    public void onDisable() {
        getLogger().info("プラグインが無効になりました");
    }
}
