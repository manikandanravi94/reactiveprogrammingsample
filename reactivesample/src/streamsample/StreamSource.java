package streamsample;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamSource {

    public static Supplier<Stream<Integer>> INTEGER_STREAM = () -> Stream.of(1, 2, 3, 4, 5, 6, 7, 8);


    public static Supplier<Stream<String>> NUMBER_STRING_STREAM = () -> Stream.of("one", "two", "three", "four", "five", "six", "seven", "eight");

    public static Supplier<Stream<User>> USER_STREAM = () -> Stream.of(
            new User(1, "leo", "messi"),
            new User(2, "cristanio", "ronaldo"),
            new User(3, "zid", "zidane"),
            new User(4, "jr", "neymer")
    );


}
