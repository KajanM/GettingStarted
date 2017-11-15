package comparator;

import java.util.function.Function; /**
 * @author k4j4n
 * @since 11/11/2017
 */
public interface Comparator<T> {

    public int compare(T t1, T t2);

    static Comparator<Person> comparing(Function<Person, Comparable> f) {

        return (p1, p2) -> f.apply(p2).compareTo(f.apply(p1));
    }
}
