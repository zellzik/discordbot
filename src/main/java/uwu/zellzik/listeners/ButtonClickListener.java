package uwu.zellzik.listeners;

import net.dv8tion.jda.api.events.interaction.ButtonClickEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

/**
 * @author zellzik
 * @since 16.01.2022
 */

public class ButtonClickListener extends ListenerAdapter {
    public void onButtonClick(@NotNull ButtonClickEvent event) {

        switch (event.getComponentId()) {
            case "verification" -> {
                event.getGuild().addRoleToMember(event.getMember(), event.getGuild().getRoleById(925639532811001907L)).queue(); //Change role id
                event.getMessage().getChannel().sendMessage("Zweryfikowano pomyślnie!").queue();
            }
        }
    }
}
