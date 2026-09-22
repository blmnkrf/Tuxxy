package org.psvmsa;

import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.guild.voice.GuildVoiceUpdateEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class VoiceJoinPinger extends ListenerAdapter {
    @Override
    public void onGuildVoiceUpdate(GuildVoiceUpdateEvent event) {
        if (/*event.getChannelLeft() == null && */event.getChannelJoined() != null) {
            var member = event.getMember();
            var channelJoined = event.getChannelJoined();

            TextChannel general = event.getJDA().getTextChannelById(1551592571430633517L);
            general.sendMessage("@everyone SOMEONE IS STUDYING!").queue();
            System.out.printf("%s joined voice channel: %s%n", member.getEffectiveName(), channelJoined.getName());
        }
    }
}
