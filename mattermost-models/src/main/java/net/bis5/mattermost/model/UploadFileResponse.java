package net.bis5.mattermost.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Response of a file upload.
 *
 */
@Data
public class UploadFileResponse {
    private String id;
    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("post_id")
    private String postId;
    @JsonProperty("create_at")
    private String createAt;
    @JsonProperty("update_at")
    private String updateAt;
    @JsonProperty("delete_at")
    private String deleteAt;
    private String name;
    private String extension;
    private long size;
    @JsonProperty("mime_type")
    private String mimeType;
    private  long width;
    private long height;
    @JsonProperty("has_preview_image")
    private boolean hasPreviewImage;
}
