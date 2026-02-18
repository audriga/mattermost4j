package net.bis5.mattermost.client4.api;

import net.bis5.mattermost.client4.ApiResponse;
import net.bis5.mattermost.model.ImportList;
import java.io.IOException;
import java.util.List;

/**
 * Import API.
 *
 */
public interface ImportApi {
    /**
     * Lists all available import files.
     */
    ApiResponse<List<String>> listImports();
}
