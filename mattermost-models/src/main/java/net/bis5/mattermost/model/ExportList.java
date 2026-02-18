package net.bis5.mattermost.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;

/**
 * List of exported files.
 *
 */
public class ExportList {
    private final List<String> files;

    @JsonCreator
    public ExportList(List<String> files) {
        this.files = files;
    }

    @JsonValue
    public List<String> getFiles() {
        return files;
    }
}