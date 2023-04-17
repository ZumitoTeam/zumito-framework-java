package com.github.zumito;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class RunApp {
    private ZumitoAPI zumitoAPI;

    public void run() {
        try {
            zumitoAPI.jda = JDABuilder
                    .createDefault("TOKENHERE")
                    .build()
                    .awaitReady();
            //Jda.addEventListener(new MessageHandler());

        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println("[ZumitoJava] Started Zumito Bot!");
    }
}