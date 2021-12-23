package com.gzonestudios.mc.discordbridge.api;

public enum ActivityType {

    /**
     * Used to indicate that the Activity should display
     * as {@code Playing...} in the official client.
     */
    PLAYING,

    /**
     * Used to indicate that the Activity should display
     * as {@code Listening...} in the official client.
     */
    LISTENING,

    /**
     * Used to indicate that the Activity should display
     * as {@code Competing in...} in the official client.
     *
     * @since  4.2.1
     */
    COMPETING;

    public static ActivityType fromString(String string) {
        return switch ( string.toLowerCase().trim() ) {
            case "listening" -> ActivityType.LISTENING;
            case "competing" -> ActivityType.COMPETING;
            default -> ActivityType.PLAYING;
        };
    }

}
