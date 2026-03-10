package net.bis5.mattermost.model;

import lombok.Data;

/**
 * Server limit of the server.
 *
 */
@Data
public class ServerLimit {
    private long maxUsersLimit;
    private long activeUserCount;
}
