package org.psvmsa;

import net.dv8tion.jda.api.JDABuilder;

public class Main {
    public static void main(String[] args) {
        JDABuilder jdaBuilder = JDABuilder.createDefault(System.getenv("TOKEN"));
    }
}