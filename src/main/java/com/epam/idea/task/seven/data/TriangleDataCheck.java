package com.epam.idea.task.seven.data;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TriangleDataCheck {
    private final String VALID_TRIANGLE_INPUT = "^(\\s*-?\\d+\\.\\d+\\s-?\\d+\\.\\d+){3}\\s*$";

    public boolean checkInput(String triangleInput) {
        Pattern pattern = Pattern.compile(VALID_TRIANGLE_INPUT);
        Matcher matcher = pattern.matcher(triangleInput);
        return matcher.matches();
    }
}
