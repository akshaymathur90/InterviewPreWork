import java.util.Collections;
import java.util.List;

// Checkpoint 3

public class KthSmallest {
    public int kthsmallest(final List<Integer> a, int k) {
        Collections.sort(a);
        return a.get(k-1);
    }
}
