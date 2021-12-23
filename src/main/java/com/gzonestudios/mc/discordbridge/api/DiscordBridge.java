package com.gzonestudios.mc.discordbridge.api;

import com.gzonestudios.mc.discordbridge.api.exceptions.ChannelNotFoundException;

public interface DiscordBridge {

    public void setActivity(ActivityType type, String name);

    public void info(String message) throws ChannelNotFoundException;

    public void info(long channelId, String message) throws ChannelNotFoundException;

    public void send(long channelId, String message) throws ChannelNotFoundException;

}
