package net.bis5.mattermost.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

/**
 * List of imported files.
 *
 */
@Data
@NoArgsConstructor
public class ImportList extends ArrayList<String> {

    private static final long serialVersionUID = 1L;
}

