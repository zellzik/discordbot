package uwu.zellzik.basic;

import lombok.Getter;
import net.dv8tion.jda.api.JDABuilder;
import uwu.zellzik.listeners.ButtonClickListener;
import uwu.zellzik.listeners.GuildMessageReceivedListener;
import uwu.zellzik.managers.CommandManager;

import javax.security.auth.login.LoginException;

/**
 * @author zellzik
 * @since 16.01.2022
 */

@Getter
public class DiscordApp {
    private final CommandManager commandManager = new CommandManager();
    public static final char prefix = '.'; //You can change the bot prefix
    public static DiscordApp instance;

    public DiscordApp() {
        instance = this;

        try {
            JDABuilder.createDefault("token") //Add bot token
                    .addEventListeners(new ButtonClickListener(), new GuildMessageReceivedListener())
                    .setAutoReconnect(true)
                    .build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}

