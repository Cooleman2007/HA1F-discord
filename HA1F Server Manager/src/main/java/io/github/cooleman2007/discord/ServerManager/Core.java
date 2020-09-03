package io.github.cooleman2007.discord.ServerManager;

import io.github.cooleman2007.discord.ServerManager.utils.CommonUtils;
import io.github.cooleman2007.discord.ServerManager.utils.StaticStorage;
import io.github.cooleman2007.discord.ServerManager.versionmanagement.AlphaVersion;
import net.dv8tion.jda.api.JDABuilder;

import java.util.Map;

public class Core {

    public static void main(String[] args) {
        Map<String, String> env = System.getenv();
        new Core(env.get("DISCORD_SERVER_MANAGER_TOKEN"), env.get("DISCORD_SERVER_MANAGER_LOGGING_GUILD_ID"), env.get("DISCORD_SERVER_MANAGER_LOGGING_CHANNEL_ID"));
    }

    public Core(String token, String logGuildId, String logChannelId) {

        if(token == null) {
            System.err.println("Specify a token.");
            CommonUtils.exit(1);
            return;
        }
        if(logGuildId == null) {
            System.err.println("Specify a log guild id.");
            CommonUtils.exit(1);
            return;
        }
        if(logChannelId == null) {
            System.err.println("Specify a log channel id");
            CommonUtils.exit(1);
            return;
        }



        StaticStorage.setup();

        JDABuilder builder = JDABuilder.createDefault(token);
        Bot bot = new Bot(builder);
        StaticStorage.set("bot", bot);
        BotInfo botInfo = bot.getBotInfo();
        botInfo.setNAME("Server Manager");
        botInfo.setVersion(new AlphaVersion("0.0.1"));
        botInfo.setTOKEN(token);
        botInfo.setLOGGING_GUILD_ID(logGuildId);
        botInfo.setLOGGING_CHANNEL_ID(logChannelId);
        bot.build();


    }




}
