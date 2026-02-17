package net.bis5.mattermost.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

/**
 * User filtered stats condition.
 *
 */
@Data
@Builder
public class UsersStatsFiltered {
    @JsonProperty("channel_roles")
    private String channelRoles;
    @JsonProperty("in_channel")
    private String inChannel;
    @JsonProperty("in_team")
    private String inTeam;
    @JsonProperty("include_bots")
    private boolean includeBots;
    @JsonProperty("include_deleted")
    private boolean includeDeleted;
    @JsonProperty("roles")
    private String roles;
    @JsonProperty("team_roles")
    private String teamRoles;
}