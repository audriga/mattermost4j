package net.bis5.mattermost.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UsersStats {
    @JsonProperty("total_users_count")
    private long totalUsersCount;
}