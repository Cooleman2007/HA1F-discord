package io.github.cooleman2007.discord.ServerManager;

import io.github.cooleman2007.discord.ServerManager.eventhandling.MainListener;
import io.github.cooleman2007.discord.ServerManager.utils.CommonUtils;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.TextChannel;

public class Bot {

    JDA bot;
    JDABuilder botHandler;

    BotInfo info;

    MainListener mainListener;

    Guild loggingGuild;
    TextChannel loggingChannel;


    public Bot(JDABuilder botHandler) {
        this.botHandler = botHandler;
        info = new BotInfo();
        mainListener = new MainListener(this);
        botHandler.addEventListeners(mainListener);
    }


    public void build() {
        try {
            bot = botHandler.build();
        } catch (Exception e) {
            System.out.println("Could not login into discord.");
            CommonUtils.exit(1);
        }
    }


    public void setupLogging() {
        loggingGuild = bot.getGuildById(info.getLOGGING_GUILD_ID());
        if(loggingGuild == null) {
            System.out.println("Bot is not in guild with id: \'" + info.getLOGGING_GUILD_ID() + "\'");
            CommonUtils.exit(1);
            return;
        }
        loggingChannel = loggingGuild.getTextChannelById(info.getLOGGING_CHANNEL_ID());
        if(loggingChannel == null) {
            System.out.println("guild: \'" + info.getLOGGING_GUILD_ID() + "\' does not contain text channel with id: \'" + info.getLOGGING_CHANNEL_ID() + "\'");
            CommonUtils.exit(1);
            return;
        }
        log("Setup logging.");
        return;
    }

    public void log(String s) {
        System.out.println(s);
        loggingChannel.sendMessage(s).queue();
    }


    public BotInfo getBotInfo() {
        return info;
    }

}
