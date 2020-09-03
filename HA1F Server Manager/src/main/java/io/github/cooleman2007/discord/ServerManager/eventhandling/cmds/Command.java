package io.github.cooleman2007.discord.ServerManager.eventhandling.cmds;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public abstract class Command {

    public abstract void execute(MessageReceivedEvent e, String[] args);



}
