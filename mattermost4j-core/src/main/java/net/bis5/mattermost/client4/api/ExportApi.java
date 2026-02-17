package net.bis5.mattermost.client4.api;

import net.bis5.mattermost.client4.ApiResponse;
import net.bis5.mattermost.model.Export;

/**
 * Export API.
 *
 */
public interface ExportApi {

    /**
     * returns a list of available exports.
     */
    ApiResponse<Export> listExports();
}
