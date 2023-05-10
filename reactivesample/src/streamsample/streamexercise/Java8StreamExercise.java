package streamsample.streamexercise;

import static streamsample.StreamSource.INTEGER_STREAM;

public class Java8StreamExercise {

    public static void main(String[] args) {
        //print all the numbers in the input stream
        INTEGER_STREAM.get().forEach(System.out::print);
        //print numbers from stream less than 5
        System.out.println("print numbers from stream less than 5");
        INTEGER_STREAM.get().filter(value -> value < 5).forEach(System.out::print);
    }
}
