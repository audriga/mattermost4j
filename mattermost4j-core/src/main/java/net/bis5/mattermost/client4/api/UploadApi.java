package net.bis5.mattermost.client4.api;

import net.bis5.mattermost.client4.ApiResponse;
import net.bis5.mattermost.model.UploadCreateResponse;
import net.bis5.mattermost.model.UploadFiletoSessionResponse;

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
    ApiResponse<UploadFiletoSessionResponse> uploadFileToSession(String uploadId, long contentLength, InputStream file);
}
