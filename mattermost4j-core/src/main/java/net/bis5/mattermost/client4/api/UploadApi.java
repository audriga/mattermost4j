package net.bis5.mattermost.client4.api;

import net.bis5.mattermost.client4.ApiResponse;
import net.bis5.mattermost.model.UploadCreate;
import net.bis5.mattermost.model.UploadCreateResponse;

/**
 * Upload API.
 *
 */
public interface UploadApi {
    /**
     * creates an upload session.
     */
    ApiResponse<UploadCreateResponse> createUploadSession(String fileName, String type, long fileSize);
}
