package net.bis5.mattermost.client4.api;

import net.bis5.mattermost.client4.ApiResponse;
import net.bis5.mattermost.model.Export;
import net.bis5.mattermost.model.ExportList;

import java.io.IOException;
import java.nio.file.Path;

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
    ApiResponse<Path> downloadExport(String exportName) throws IOException;
}
