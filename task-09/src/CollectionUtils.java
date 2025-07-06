import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class CollectionUtils {
	// collection set hashset linkedhashset
	
	// HashSet does not preserve insertion order
	public static <T> Collection<T> addToSetUnordered(Collection<T> input) {
		return new HashSet<T>(input);
	}
	
	// LinkedHashSet preserves insertion order
	public static <T> Collection<T> addToSetOrdered(Collection<T> input) {
		return new LinkedHashSet<T>(input);
	}
	
}
