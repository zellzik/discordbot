package uwu.zellzik.commands;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

/**
 * @author zellzik
 * @since 16.01.2022
 */

@RequiredArgsConstructor
@Getter
public abstract class Command {
    private final String commandName;

    public abstract void execute(final GuildMessageReceivedEvent event, final String... arguments);
}
