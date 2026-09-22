package org.psvmsa;

import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main{
    public static void main(String[] args) throws LoginException {
        JDABuilder jdaBuilder = JDABuilder.createDefault(System.getenv("TOKEN"));

        jdaBuilder.addEventListeners(new TuxxyPing());
        jdaBuilder.build();
    }
}