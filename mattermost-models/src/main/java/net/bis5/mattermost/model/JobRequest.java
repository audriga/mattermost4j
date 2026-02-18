package net.bis5.mattermost.model;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

/**
 * Job request.
 *
 */
@Data
@Builder
public class JobRequest {
    private String type;
    private Map<String, String> data;
}
