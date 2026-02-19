package net.bis5.mattermost.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Create a Upload.
 *
 */
@Data
public class UploadCreateResponse {
    private String id;
    private String type;
    @JsonProperty("create_at")
    private long create_at;
    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("channel_id")
    private String channelId;
    private String filename;
    @JsonProperty("file_size")
    private long fileSize;
    @JsonProperty("file_offset")
    private long fileOffset;
}
