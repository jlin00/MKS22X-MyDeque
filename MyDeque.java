public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10]; //default constructor
  }

  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity]; //takes size parameter
  }

  public int size(){ //returns number of elements in array
    return size;
  }

  public String toString(){
    String output = "{";
    int index = start; //starts at start
    for (int i = 0; i < size; i++){ //loops through number of elements
      output += data[index % data.length]; //add element modded by data.length
      if (i != size - 1) output += ", "; //add comma
      index++;
    }
    return output + "}";
  }

  @SuppressWarnings("unchecked")
  private void resize(){ //resize array
    E[] temp = (E[]) new Object[size() * 2 + 1]; //initialize new array that is twice as big + 1
    int index = start; //starts at start
    for (int i = 0; i < size; i++){ //loops through number of elements
      temp[i] = data[index % data.length]; //copies elements over into temporary array
      index++; //increase index
    }
    data = temp; //set data to temp
    start = 0; //start is moved to beginning
    end = size - 1; //end is moved to size - 1
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
