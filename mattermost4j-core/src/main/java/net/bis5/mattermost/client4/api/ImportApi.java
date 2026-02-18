package net.bis5.mattermost.client4.api;

import net.bis5.mattermost.client4.ApiResponse;
import net.bis5.mattermost.model.ImportList;
import java.io.IOException;

/**
 * Import API.
 *
 */
public interface ImportApi {
    /**
     * Lists all available import files.
     */
    ApiResponse<ImportList> listImports() throws IOException;
}
