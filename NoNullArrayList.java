import java.util.ArrayList;
import java.util.List;
public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }
  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }
  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    else {
      return super.set(index, element);
    }
  }
  public T add();
}
