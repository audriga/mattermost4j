package net.bis5.mattermost.client4.api;

import net.bis5.mattermost.client4.ApiResponse;
import net.bis5.mattermost.model.Export;
import net.bis5.mattermost.model.ExportList;

/**
 * Export API.
 *
 */
public interface ExportApi {

    /**
     * returns a list of available exports.
     */
    ApiResponse<ExportList> listExports();

    /**
     * Downloads an export file.
     */
    ApiResponse<Export> downloadExport(String exportName);
}
