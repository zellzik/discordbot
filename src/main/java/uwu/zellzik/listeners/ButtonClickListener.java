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
            case "verify" -> {
                event.getGuild().addRoleToMember(event.getMember(), event.getGuild().getRoleById(000000000000000000L)).queue(); //Change role id
            }
        }
    }
}
