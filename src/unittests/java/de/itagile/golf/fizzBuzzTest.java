package de.itagile.golf;


import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;


@RunWith(Parameterized.class)
public class fizzBuzzTest {

    private final Integer input ;
    private final String output;

    public fizzBuzzTest(Integer input,  String output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static List<Object[]> parameters() {
        Object[][] testData = new Object[][] {
                {-15, "fizzbuzz"},
                {-1, "-1"},
                {0, "fizzbuzz"}, /* hmmmm */
                {1, "1"},
                {2, "2"},
                {3, "fizz"},
                {4, "4"},
                {5, "buzz"},
                {6, "fizz"},
                {10, "buzz"},
                {15, "fizzbuzz"},
                {30, "fizzbuzz"},
                {33, "fizz"},
                {45, "fizzbuzz"},
                {97, "97"},
                {99, "fizz"},
                {100, "buzz"},

        };
        return Arrays.asList(testData);
    }

    @Test
    public void testFizzBuzzFunction() throws Exception {
        assertThat(fizzBuzz.calculate(input), is(output));
    }

}