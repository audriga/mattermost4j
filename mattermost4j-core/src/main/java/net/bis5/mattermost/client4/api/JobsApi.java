package net.bis5.mattermost.client4.api;

import net.bis5.mattermost.client4.ApiResponse;
import net.bis5.mattermost.client4.Pager;
import net.bis5.mattermost.model.Jobs;

/**
 * Jobs API.
 *
 */
public interface JobsApi {
    /**
     * Create a job.
     */
    ApiResponse<Jobs> createJob(String Type);

    /**
     * Get jobs.
     */
    ApiResponse<Jobs> getJobs(String jobType, Pager pager, String status);
}
