package net.bis5.mattermost.client4.api;

import net.bis5.mattermost.client4.ApiResponse;
import net.bis5.mattermost.model.UploadCreateResponse;
import net.bis5.mattermost.model.UploadFileResponse;

import java.io.InputStream;

/**
 * Upload API.
 *
 */
public interface UploadApi {
    /**
     * creates an upload session.
     */
    ApiResponse<UploadCreateResponse> createUploadSession(String fileName, String type, long fileSize);

    /**
     * Starts or resumes a file upload.
     */
    ApiResponse<UploadFileResponse> uploadToSession(String uploadId, long contentLength, InputStream file);
}
