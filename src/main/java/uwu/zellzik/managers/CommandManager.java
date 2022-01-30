package uwu.zellzik.managers;


import uwu.zellzik.commands.Command;
import uwu.zellzik.commands.impl.TestCommand;

import java.util.List;
import java.util.Optional;

/**
 * @author zellzik
 * @since 16.01.2022
 */

public class CommandManager {
    private final List<Command> commands = List.of(new TestCommand()); //Class registration

    public Optional<Command> get(final String name) {
        return commands.stream().filter(command -> command.getCommandName().equalsIgnoreCase(name)).findFirst();
    }
}
