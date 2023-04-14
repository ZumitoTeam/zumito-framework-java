package com.github.bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import com.github.bot.handler.MessageHandler;

import javax.security.auth.login.LoginException;


public class MainBot {
    public static JDA Jda;

    public static void main(String[] args) {
        try {
            Jda = JDABuilder.createDefault("TOKENHERE")
                    .build().awaitReady();
            Jda.addEventListener(new MessageHandler());

        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println("[ZumitoJava] Started Zumito Bot!");
    }
}
