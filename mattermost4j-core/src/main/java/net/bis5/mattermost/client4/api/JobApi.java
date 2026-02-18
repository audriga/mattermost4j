package net.bis5.mattermost.client4.api;

import net.bis5.mattermost.client4.ApiResponse;
import net.bis5.mattermost.client4.Pager;
import net.bis5.mattermost.model.Job;
import net.bis5.mattermost.model.Jobs;

import java.util.Map;

/**
 * Jobs API.
 *
 */
public interface JobApi {
    /**
     * Create a job.
     */
    ApiResponse<Job> createJob(String Type, Map<String, String> data);

    /**
     * Get jobs.
     */
    ApiResponse<Jobs> getJobs(String jobType, Pager pager, String status);
}
