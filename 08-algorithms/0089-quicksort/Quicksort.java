import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

static List<Integer> quicksort(List<Integer> items) {
    if (items.size() <= 1) return items;
    int pivot = items.get(0);
    List<Integer> less = new ArrayList<>();
    List<Integer> greater = new ArrayList<>();
    for (var i = 1; i < items.size(); i++) {
        if (items.get(i) < pivot) less.add(items.get(i));
        else greater.add(items.get(i));
    }
    List<Integer> result = new ArrayList<>(quicksort(less));
    result.add(pivot);
    result.addAll(quicksort(greater));
    return result;
}

void main() {
    var data = List.of(3, 1, 4, 1, 5, 2);
    var out = new StringJoiner(" ");
    for (int x : quicksort(data)) out.add(String.valueOf(x));
    IO.println(out);
}
