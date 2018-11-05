public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }
  public int findIndex(T element) {
    int index = 0;
    boolean valid = true;
    while (index < this.size() && valid) {
      int val = element.compareTo(this.get(index));
      if (val <= 0 && valid) {
        valid = false;
      }
      else {
        index++;
      }
    }
    return index;
  }
  public boolean add(T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    int index = findIndex(element);
    super.add(index, element);
    return true;
  }
  public void add(int index, T element) {
    this.add(element);
  }
  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    else {
      T val = this.get(index);
      this.remove(index);
      this.add(element);
      return val;
    }
  }
}
