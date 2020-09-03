package io.github.cooleman2007.discord.ServerManager;

import io.github.cooleman2007.discord.ServerManager.versionmanagement.Version;

public class BotInfo {

    String TOKEN, NAME, LOGGING_GUILD_ID, LOGGING_CHANNEL_ID;
    Version version = new Version() {
        @Override
        public String buildAsString() {
            return "NOT_SET";
        }
    };


    public String getLOGGING_GUILD_ID() {
        return LOGGING_GUILD_ID;
    }

    public void setLOGGING_GUILD_ID(String LOGGING_GUILD_ID) {
        this.LOGGING_GUILD_ID = LOGGING_GUILD_ID;
    }

    public String getLOGGING_CHANNEL_ID() {
        return LOGGING_CHANNEL_ID;
    }

    public void setLOGGING_CHANNEL_ID(String LOGGING_CHANNEL_ID) {
        this.LOGGING_CHANNEL_ID = LOGGING_CHANNEL_ID;
    }

    public String getTOKEN() {
        return TOKEN;
    }

    public void setTOKEN(String TOKEN) {
        this.TOKEN = TOKEN;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }
}
