package io.zipcoder.microlabs.mastering_loops;


import org.junit.Test;
import org.junit.Assert;
import sun.security.provider.SHA;

public class ShapesTest {



    @Test
    public void triangleTest(){
        //: Given
        String expected = "triangle()\n*** Output ***\n*\n**\n***\n****\n*****";
        Shapes shapes = new Shapes();

        //: When
        String actual = shapes.triangle();

        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tableSquareTest(){
        //: Given
        Shapes shapes = new Shapes();
        String expected = "tableSquare()\n*** Output ***\nA 4x4 table square\n" +
                "| 1 | 2 |  3 |  4 |\n" +
                "| 2 | 4 |  6 |  8 |\n" +
                "| 3 | 6 |  9 | 12 |\n" +
                "| 4 | 8 | 12 | 16 |";
        //: When
        String actual = shapes.tableSquare();

        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tableSquaresTest(){
        // Given
        Shapes shapes = new Shapes();
        String expected = "tableSquares(6)\n*** Output ***\nA 6x6 table square\n" +
                "| 1 |  2 |  3 |  4 |  5 |  6 |\n"+
                "| 2 |  4 |  6 |  8 | 10 | 12 |\n"+
                "| 3 |  6 |  9 | 12 | 15 | 18 |\n"+
                "| 4 |  8 | 12 | 16 | 20 | 24 |\n"+
                "| 5 | 10 | 15 | 20 | 25 | 30 |\n"+
                "| 6 | 12 | 18 | 24 | 30 | 36 |";

        // When
        String actual = shapes.tableSquares(6);

        // Then
        Assert.assertEquals(expected, actual);

    }
}

