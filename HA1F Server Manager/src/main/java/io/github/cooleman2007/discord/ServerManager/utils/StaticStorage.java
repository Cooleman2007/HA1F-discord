package io.github.cooleman2007.discord.ServerManager.utils;

import java.util.HashMap;

public abstract class StaticStorage {

    static HashMap<String, Object> storage;

    public static Object get(String key) {

        return storage.get(key);

    }


    public static void set(String key, Object obj) {
        storage.put(key, obj);
    }

    public static void setup() {
        storage = new HashMap<>();
    }


}
