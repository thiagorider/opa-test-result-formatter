package com.bisnode.opa;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
class Location {
    private final String file;
    private final long row;
    private final long col;

    Location(@JsonProperty String file,
             @JsonProperty long row,
             @JsonProperty long col) {
        this.file = file;
        this.row = row;
        this.col = col;
    }

    public String getFile() {
        return file;
    }

    public long getRow() {
        return row;
    }

    public long getCol() {
        return col;
    }
}