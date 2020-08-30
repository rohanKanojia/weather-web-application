package org.jboss.as.quickstarts.helloworld;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class APIKeyService {
    private static final String API_KEY_MOUNTPATH = "/etc/foo";
    public static final String APITOKEN = "apitoken";

    private APIKeyService() { }

    public static String getApiKey() throws IOException {
        File apiKeyTokenFile = new File(API_KEY_MOUNTPATH, APITOKEN);
        return new String(Files.readAllBytes(apiKeyTokenFile.toPath()));
    }
}
