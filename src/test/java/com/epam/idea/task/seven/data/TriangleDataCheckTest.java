package com.epam.idea.task.seven.data;

import com.epam.idea.task.seven.exception.InputFileException;
import org.junit.Assert;
import org.junit.Test;

public class TriangleDataCheckTest {
    TriangleDataCheck dataCheck = new TriangleDataCheck();

    @Test
    public void testCheckInputShouldCheckWhenNumbersMoreThenSix (){
        String triangleInput = "-1, -2, 1, 2, 3, 4, 2";
        boolean flag = dataCheck.checkInput(triangleInput);
        Assert.assertFalse(flag);
    }

    @Test
    public void testCheckInputShouldCheckWhenNumbersLessThenSix(){
        String triangleInput = "-1, -2, 1, 2, 3";
        boolean flag = dataCheck.checkInput(triangleInput);
        Assert.assertFalse(flag);
    }

    @Test
    public void testCheckInputShouldCheckWhenInputContainsLetters(){
        String triangleInput = "-1, -2, 1, f, 3, 5";
        boolean flag = dataCheck.checkInput(triangleInput);
        Assert.assertFalse(flag);
    }
}
