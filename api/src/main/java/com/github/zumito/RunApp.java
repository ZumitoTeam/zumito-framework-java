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


    public void run() {

        try {

            zumitoAPI.jda = JDABuilder
                    .createDefault(zumitoAPI.getConfig().getString("token"))
                    .build()
                    .awaitReady();
            yaml = new Yaml();
            Config config = yaml.loadAs(new FileInputStream("config.yml"), Config.class);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("[ZumitoJava] Started Zumito Bot!");
    }
}