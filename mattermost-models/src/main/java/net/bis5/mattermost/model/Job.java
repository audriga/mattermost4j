package net.bis5.mattermost.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class Job {
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
    private Map<String, String> data;
}
