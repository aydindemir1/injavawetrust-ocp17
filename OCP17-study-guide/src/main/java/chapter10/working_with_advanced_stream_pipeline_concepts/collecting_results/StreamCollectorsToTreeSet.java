package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.TreeSet;

public class StreamCollectorsToTreeSet {

    public static void main(String[] args) {

        String[] roseQuote = "a rose is a rose is a rose".split(" ");

        Set<String> words = Arrays.stream(roseQuote).collect(Collectors.toCollection(TreeSet::new));
        words.forEach(System.out::println);
    }
}
