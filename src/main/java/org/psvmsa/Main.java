package org.psvmsa;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class Main{
    public static void main(String[] args) throws LoginException {
        JDABuilder jdaBuilder = JDABuilder.createDefault(System.getenv("TOKEN"));

        jdaBuilder.addEventListeners(new TuxxyPing());
        jdaBuilder.addEventListeners(new VoiceJoinPinger());
        jdaBuilder.addEventListeners(new WhiteList());

        jdaBuilder.enableIntents(GatewayIntent.MESSAGE_CONTENT);
        jdaBuilder.enableIntents(GatewayIntent.GUILD_VOICE_STATES);
        jdaBuilder.enableIntents(GatewayIntent.GUILD_MEMBERS);

        jdaBuilder.build();
    }
}