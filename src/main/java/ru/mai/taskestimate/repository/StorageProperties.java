package ru.mai.taskestimate.repository;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class StorageProperties {

    /**
     * Folder location for storing files
     */
    private String location = "path to dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}