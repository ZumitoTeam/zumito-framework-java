package com.github.zumito;

import com.github.zumito.file.FileManager;
import net.dv8tion.jda.api.JDA;

import java.io.FileNotFoundException;

public class ZumitoAPI {
    public JDA jda;

    public FileManager getConfig() {
        try {
            return new FileManager("./resource/config.yml");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public JDA getJda() {
        return jda;
    }
}
