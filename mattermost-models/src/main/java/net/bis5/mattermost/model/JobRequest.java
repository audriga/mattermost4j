package net.bis5.mattermost.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * Job request.
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobRequest {
    private String type;
    private Map<String, String> data;
}
