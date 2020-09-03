package io.github.cooleman2007.discord.ServerManager.versionmanagement;

public class ReleaseVersion extends Version {

    String version;

    public ReleaseVersion(String version) {
        this.version = version;
    }

    @Override
    public String buildAsString() {
        return "v" + version;
    }
}
