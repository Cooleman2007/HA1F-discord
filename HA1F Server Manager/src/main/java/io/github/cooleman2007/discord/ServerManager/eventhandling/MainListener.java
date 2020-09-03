package io.github.cooleman2007.discord.ServerManager.eventhandling;

import io.github.cooleman2007.discord.ServerManager.Bot;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class MainListener extends ListenerAdapter {


    Bot outer;

    public MainListener(Bot outer) {
        this.outer = outer;
    }


    @Override
    public void onReady(@Nonnull ReadyEvent event) {
        outer.setupLogging();

        outer.log("Bot online, using version: " + outer.getBotInfo().getVersion().buildAsString());
    }
}
