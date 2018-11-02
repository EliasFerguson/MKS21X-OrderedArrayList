public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }
  public int findIndex(T element) {
    for (int i = 0; i < this.size(); i++) {
      int val = this.get(i).compareTo(this.get(i + 1));
      if (val > 0) {

      }
    }
  }
  public boolean add(T element) {
    int index = findIndex(element);
    super.add(element);
  }
//  public void add
  public T set(int index, T element) {
    T rVal = super.remove(index);
    add(element);
    return rVal;
  }
}
