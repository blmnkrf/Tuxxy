package org.psvmsa;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WhiteList extends ListenerAdapter {
    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent event) {
        Set<Long> ApprovedUsers =  new HashSet<Long>(Arrays.asList(
                1002671128910778439L, // LAURA POSER
                1118433853191766077L, // MAX
                1473030082690810152L, // SEBI
                870170509218811965L // MINZU
        ));

        Member newMember = event.getMember();
        long newUserID = newMember.getIdLong();
        Guild guild = event.getGuild();

        if (!ApprovedUsers.contains(newUserID)) {
            guild.kick(newMember).queue();

            TextChannel tuxxyChannel = event.getJDA().getTextChannelById(1552320563572252784L);
            tuxxyChannel.sendMessage("@everyone " + newMember.getEffectiveName() + " TRIED TO JOIN, BUT I KICKED HIM OUT!").queue();
        }
    }
}
