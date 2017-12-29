package io;

import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Helper {
    static Reader openReader(String fileName) throws IOException, URISyntaxException {
        return Files.newBufferedReader(Paths.get(ClassLoader.getSystemResource(fileName).toURI()));
        //return Files.newBufferedReader(Paths.get(fileName));
    }
}
