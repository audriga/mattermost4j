package net.bis5.mattermost.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;
import java.util.List;

/**
 * List of imported files.
 *
 */
@Data
public class ImportList {
        private final List<String> files;

        @JsonCreator
        public ImportList(List<String> files) {
            this.files = files;
        }

        @JsonValue
        public List<String> getFiles() {
            return files;
        }
}

