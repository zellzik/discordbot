package uwu.zellzik.listeners;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import uwu.zellzik.basic.DiscordApp;

/**
 * @author zellzik
 * @since 16.01.2022
 */

public class GuildMessageReceivedListener extends ListenerAdapter {
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return;

        String messageContent = event.getMessage().getContentRaw();
        if (messageContent.length() == 0) return;

        if (messageContent.charAt(0) != DiscordApp.prefix) return;

        String[] args = messageContent.substring(1).split(" ");
        DiscordApp.instance.getCommandManager().get(args[0]).ifPresent(value -> value.execute(event, args));
    }
}
