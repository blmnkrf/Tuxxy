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

            TextChannel tuxxyChannel = event.getJDA().getTextChannelById(1552320563572252784L);
            tuxxyChannel.sendMessage("@everyone " + member.getEffectiveName() + " IS STUDYING " + channelJoined + "!").queue();
        }
    }
}
