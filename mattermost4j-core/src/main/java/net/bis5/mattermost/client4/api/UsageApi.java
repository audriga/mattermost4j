package net.bis5.mattermost.client4.api;

import net.bis5.mattermost.client4.ApiResponse;
import net.bis5.mattermost.model.UsagePosts;
import net.bis5.mattermost.model.UsageStorage;

/**
 * Usage API.
 *
 */
public interface UsageApi {

    /**
     * returns total number of posts for this instance.
     */
    ApiResponse<UsagePosts> getPostsUsage();

    /**
     * returns the total file storage usage for the instance in bytes.
     */
    ApiResponse<UsageStorage> getStorageUsage();
}
