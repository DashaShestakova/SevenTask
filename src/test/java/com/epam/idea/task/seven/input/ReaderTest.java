package com.epam.idea.task.seven.input;

import com.epam.idea.task.seven.exception.DataException;
import com.epam.idea.task.seven.exception.InputFileException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ReaderTest {
    private static final String PATH = "src/test/resources/testInput.txt";

    @Test
    public void testReadShouldReadInputWhenInputAvaliable() throws InputFileException {
        Reader reader = new Reader();
        List<String> expected = Arrays.asList("1.0 1.0 0.0 0.0 2.0 0.0", "0.0 0.0 0.0 2.0 3.0 0.0", "1.0 1.0 0.0 0.0 2.0 2.0");

        List<String> actual = reader.read(PATH);

        Assert.assertEquals(expected, actual);
    }
}
