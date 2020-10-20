package com.epam.idea.task.seven.input;

import com.epam.idea.task.seven.exception.InputFileException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import static java.nio.charset.StandardCharsets.UTF_8;

public class Reader {
    private static Logger logger = LogManager.getLogger();

    public List<String> read(String filename) throws InputFileException {
        logger.info("Trying to read input file");
        File file = new File(filename);
        List<String> lines;
        if (file.exists() && file.length() != 0) {
            try {
                lines = Files.readAllLines(file.toPath(), UTF_8);
                logger.info("Reading of file completed");
            } catch (IOException e) {
                logger.log(Level.FATAL, e);
                throw new RuntimeException();
            }
        } else {
            throw new InputFileException("Wrong file");
        }
        return lines;
    }
}
