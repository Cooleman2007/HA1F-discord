package io.github.cooleman2007.discord.ServerManager.utils;

public class UnsupportedDefaultConstructorException extends RuntimeException{

    public UnsupportedDefaultConstructorException() {
        super("Using unsupported default constructor");
    }
}
