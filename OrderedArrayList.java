public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }
  public void sorter() {
    for (int i = 0; i < this.size() - 1; i++) {
      int val = this.get(i).compareTo(this.get(i + 1));
      if (val > 0) {
        T first = this.get(i);
        T second = this.get(i + 1);
        this.set(i, second);
        this.set(i + 1, first);
      }
    }
  }
  public T set(int index, T element) {
    T rVal = super.remove(index);
    add(element);
    return rVal;
  }
}
