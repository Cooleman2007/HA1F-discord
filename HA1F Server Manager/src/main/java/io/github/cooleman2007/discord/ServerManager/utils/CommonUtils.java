package io.github.cooleman2007.discord.ServerManager.utils;

import java.io.IOException;

public abstract class CommonUtils {

    public static void exit(int code) {
        try {
            System.in.read();
            System.exit(code);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
