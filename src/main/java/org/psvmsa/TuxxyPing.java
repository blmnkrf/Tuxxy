package org.psvmsa;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class TuxxyPing extends ListenerAdapter
{
    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        if (!event.getAuthor().isBot())
        {
            Message message = event.getMessage();
            String author = event.getAuthor().getName();
            String content = message.getContentStripped();

            if (content.startsWith("@Tuxxy"))
            {
                MessageChannel channel = event.getChannel();
                channel.sendMessage("Nrk " + author).queue();
            }
        }
    }
}
