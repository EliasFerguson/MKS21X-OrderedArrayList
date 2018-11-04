public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }
  public int findIndex(T element) {
    int returner = 0;
    for (int i = 0; i < this.size(); i++) {
      int val = this.get(i).compareTo(this.get(i + 1));
      if (val <= 0) {
        returner = i;
      }
    }
    return returner;
  }
  public boolean add(T element) {
    int index = findIndex(element);
    super.add(index, element);
    return true;
  }
  public void add(int index, T element) {
    index = findIndex(element);
    super.add(index, element);
  }
  public T set(int index, T element) {
    index = findIndex(element);
    return super.set(index, element);
  }
}
