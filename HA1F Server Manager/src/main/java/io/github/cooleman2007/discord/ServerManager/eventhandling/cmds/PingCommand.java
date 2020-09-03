package io.github.cooleman2007.discord.ServerManager.eventhandling.cmds;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class PingCommand extends Command {


    @Override
    public void execute(MessageReceivedEvent e, String[] args) {
        e.getTextChannel().sendMessage("Pong.").queue();
        return;
    }
}
