package net.bis5.mattermost.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Create an Upload.
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UploadCreate {
    private String type;
    @JsonProperty("filename")
    private String fileName;
    @JsonProperty("file_size")
    private long fileSize;
}
