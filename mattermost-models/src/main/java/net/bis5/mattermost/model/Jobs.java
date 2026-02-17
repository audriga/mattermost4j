package net.bis5.mattermost.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Jobs {
    private String id;
    private String type;
    @JsonProperty("create_at")
    private long createAt;
    @JsonProperty("start_at")
    private long startAt;
    @JsonProperty("last_activity_at")
    private long lastActivityAt;
    private String status;
    private long progress;
    // TODO @param data
}
