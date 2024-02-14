package LamdaFunctions;

import java.util.List;
import java.util.Optional;

public class MaxElementOfStringList {
    public static Optional<String> findMaxElement(List<String> stringList) {
        return stringList.stream()
                .max(String::compareTo);
    }
}
