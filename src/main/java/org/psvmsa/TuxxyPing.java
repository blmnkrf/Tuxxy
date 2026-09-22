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
            String content = message.getContentRaw();

            if (content.startsWith("!ping"))
            {
                MessageChannel channel = event.getChannel();
                channel.sendMessage("Pidaru o zis: " + content).queue();

                System.out.println("mama moarta");
            }
        }
    }
}
