package com.github.zumito;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class RunApp {
    public static JDA Jda;

    public void run() {
        try {
            Jda = JDABuilder.createDefault("TOKENHERE")
                    .build().awaitReady();
            //Jda.addEventListener(new MessageHandler());

        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println("[ZumitoJava] Started Zumito Bot!");
    }
}