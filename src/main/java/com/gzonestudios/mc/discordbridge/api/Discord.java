package com.gzonestudios.mc.discordbridge.api;

import com.gzonestudios.mc.discordbridge.api.exceptions.ChannelNotFoundException;
import org.jetbrains.annotations.NotNull;

public class Discord {

    private static DiscordBridge bridge;

    /**
     * Static class cannot be initialized.
     */
    private Discord() {}

    /**
     * Gets the current {@link DiscordBridge} singleton
     *
     * @return Server instance being ran
     */
    @NotNull
    public static DiscordBridge getBridge() {
        return bridge;
    }

    /**
     * Attempts to set the {@link DiscordBridge} singleton.
     * <p>
     * This cannot be done if the Server is already set.
     *
     * @param bridge DiscordBridge instance
     */
    public static void setBridge(@NotNull DiscordBridge bridge) {
        if (Discord.bridge != null) {
            throw new UnsupportedOperationException("Cannot redefine singleton Discord");
        }

        Discord.bridge = bridge;
    }

    public static void setActivity(ActivityType type, String name) {
        Discord.bridge.setActivity(type, name);
    }

    public static void info(String message) throws ChannelNotFoundException {
        Discord.bridge.info(message);
    }

    public static void info(long channelId, String message) throws ChannelNotFoundException {
        Discord.bridge.info(channelId, message);
    }

    public static void send(long channelId, String message) throws ChannelNotFoundException {
        Discord.bridge.send(channelId, message);
    }

}
