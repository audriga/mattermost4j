package net.bis5.mattermost.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Import files.
 *
 */
@Data
public class Import {
    @JsonProperty("status_code")
    private long statusCode;
    private String id;
    private String message;
    @JsonProperty("request_id")
    private String requestId;
}
