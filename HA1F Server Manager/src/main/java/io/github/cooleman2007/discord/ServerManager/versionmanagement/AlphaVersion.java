package io.github.cooleman2007.discord.ServerManager.versionmanagement;

public class AlphaVersion extends ReleaseVersion{


    public AlphaVersion(String version) {
        super(version);
    }

    @Override
    public String buildAsString() {
        return "alpha-" + this.version;
    }
}
