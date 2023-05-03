package com.github.bot;

import com.github.zumito.RunApp;
import com.github.zumito.ZumitoAPI;

public class MainBot {
    public static void main(String[] args) {
        //new RunApp().run(new ZumitoAPI().getConfig().getString("token"));
        new RunApp().run("TOKEN");
    }
}
