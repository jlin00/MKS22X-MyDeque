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
      if (i != size - 1) output += " "; //add comma
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
    if (size == data.length){
      resize(); //resize if filled up array
      //System.out.println("had to resize"); //for debugging purposes
    }
    if (size != 0){ //if size is zero, start doesn't change
      if (start == 0){ //if start is at beginning of array
        start = data.length - 1; //loop around
      }
      else start--; //else decrease start
    }
    data[start] = element; //add in element
    size++; //increase size
  }

  public void addLast(E element){
    if (size == data.length){
      resize(); //resize if filled up array
      //System.out.println("had to resize"); //for debugging purposes
    }
    if (size != 0){ //if size is zero, end doesn't change
      if (end == data.length - 1){ //if end is at the end of the array
        end = 0; //loop back around
      }
      else end++; //else increase end
    }
    data[end] = element; //add in element
    size++; //increase size
  }

  public E removeFirst(){
    E original = data[start]; //stores original element
    if (start == data.length - 1) start = 0; //if start is at the end of the array
    else start++; //else increase start normally
    size--;
    return original;
  }

  public E removeLast(){
    E original = data[end]; //stores original element
    if (end == 0) end = data.length - 1; //if end is at the beginning of the array
    else end--; //else decrease end normally
    size--;
    return original;
  }

  public E getFirst(){
    return data[start]; //return start
  }

  public E getLast(){
    return data[end]; //return end
  }

}
