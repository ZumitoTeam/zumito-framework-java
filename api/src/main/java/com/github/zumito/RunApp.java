package com.github.zumito;

import com.github.zumito.file.FileManager;
import net.dv8tion.jda.api.JDABuilder;
import org.yaml.snakeyaml.Yaml;
import sun.security.krb5.Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RunApp {
    private ZumitoAPI zumitoAPI;
    private Yaml yaml;

    public void run(String token) {

        try {
            zumitoAPI.jda = JDABuilder
                    .createDefault(token)
                    .build()
                    .awaitReady();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println("[ZumitoJava] Started Zumito Bot!");
    }
}