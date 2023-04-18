package com.github.bot;

import com.github.zumito.RunApp;
import com.github.zumito.ZumitoAPI;
import org.yaml.snakeyaml.Yaml;
import sun.security.krb5.Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class MainBot {
    public static void main(String[] args) {
        new RunApp().run(new ZumitoAPI().getConfig().getString("token"));
    }

    public void initConfig(){
        Yaml yaml = new Yaml();
        try {
            Config config = yaml.loadAs(new FileInputStream("config.yml"), Config.class);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
