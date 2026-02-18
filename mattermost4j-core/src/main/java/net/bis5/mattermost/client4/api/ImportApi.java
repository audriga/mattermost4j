package net.bis5.mattermost.client4.api;

import net.bis5.mattermost.client4.ApiResponse;
import net.bis5.mattermost.model.Import;
import net.bis5.mattermost.model.ImportFiles;

/**
 * Import API.
 *
 */
public interface ImportApi {
    /**
     * Lists all available import files.
     */
    ApiResponse<ImportFiles> listImports();
}
