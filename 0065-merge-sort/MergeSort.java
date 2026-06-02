import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class MergeSort {
    static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) result.add(left.get(i++));
            else result.add(right.get(j++));
        }
        while (i < left.size()) result.add(left.get(i++));
        while (j < right.size()) result.add(right.get(j++));
        return result;
    }

    static List<Integer> mergeSort(List<Integer> items) {
        if (items.size() <= 1) return items;
        int mid = items.size() / 2;
        return merge(mergeSort(items.subList(0, mid)), mergeSort(items.subList(mid, items.size())));
    }

    public static void main(String[] args) {
        List<Integer> data = List.of(3, 1, 4, 1, 5, 2);
        List<Integer> sorted = mergeSort(data);

        StringJoiner out = new StringJoiner(" ");
        for (int x : sorted) {
            out.add(String.valueOf(x));
        }
        System.out.println(out);
    }
}
