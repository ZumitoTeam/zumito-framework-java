package com.github.zumito.file;

import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

public class FileManager {
    private Map<String, Object> data;

    public FileManager(String filename) throws FileNotFoundException {
        Yaml yaml = new Yaml();
        FileInputStream input = new FileInputStream(filename);
        data = yaml.load(input);
    }

    public String getString(String key) {
        return (String) data.get(key);
    }

    public int getInt(String key) {
        return (int) data.get(key);
    }

    public double getDouble(String key) {
        return (double) data.get(key);
    }

    public boolean getBoolean(String key) {
        return (boolean) data.get(key);
    }

    public List<String> getStringList(String key) {
        return (List<String>) data.get(key);
    }

    public Map<String, Object> getMap(String key) {
        return (Map<String, Object>) data.get(key);
    }
}
