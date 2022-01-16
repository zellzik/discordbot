package uwu.zellzik.commands.impl;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.interactions.components.Button;
import uwu.zellzik.commands.Command;

/**
 * @author zellzik
 * @since 16.01.2022
 */

public class TestCommand extends Command {
    public TestCommand() {
        super("test");
    }

    @Override
    public void execute(GuildMessageReceivedEvent event, String... arguments) {
        event.getMessage().getChannel().sendMessage("Kliknij przycisk poniżej, aby się zweryfikować.").setActionRow(Button.success("verify", "Zweryfikuj się")).queue();
    }
}
