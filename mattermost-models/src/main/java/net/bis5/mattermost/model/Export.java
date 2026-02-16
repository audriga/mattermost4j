package net.bis5.mattermost.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Export.
 *
 */
@Data
public class Export {
    private String id;
    @JsonProperty("status_code")
    private long statusCode;
    private String message;
    @JsonProperty("request_id")
    private String requestId;
}
