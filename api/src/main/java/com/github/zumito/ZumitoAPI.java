package com.github.zumito;

import com.github.zumito.file.FileManager;
import net.dv8tion.jda.api.JDA;

import java.io.FileNotFoundException;

public class ZumitoAPI {
    public JDA jda;
    private FileManager fileManagerConfig;
    public void initConfig() throws FileNotFoundException {
        fileManagerConfig = new FileManager("config.yml");

    }


    public FileManager getConfig() {
        return fileManagerConfig;
    }

    public JDA getJda() {
        return jda;
    }
}
