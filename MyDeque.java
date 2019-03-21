public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    size = 0;
  }

  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    size = 0;
  }

  public int size(){
    return size;
  }

  public String toString(){
    String output = "";
    int index = start;
    for (int i = 0; i < size; i++){
      output += data[index % data.length];
      index++;
    }
    return output;
  }

  public void addFirst(E element){

  }

  public void addLast(E element){

  }

  public E removeFirst(){
    return data[0];
  }

  public E removeLast(){
    return data[0];
  }

  public E getFirst(){
    return data[0];
  }

  public E getLast(){
    return data[0];
  }

}
