public class MaxHeap {
  private int [] heap;
  private int capacity;
  private int size;
  
  public MaxHeap (int capacity) {
    this.capacity = capacity;
    this.size = 0;
    this.heap = new int [capacity+1];}
  
  public void insert (int a) {
    if (size == capacity) {
      System.out.println("Capacity Full");}
    else {
      size = size+1;
      heap[size] = a;
      swim(size);}}
  
  public int extractMax () {
    int temp = heap[1];
    heap[1] = heap[size];
    heap[size] = temp;
    size = size-1;
    sink(1);
    return temp;}
  
  public void sort () {
    while (size!=0) {
      int temp = heap[1];
      heap[1] = heap[size];
      heap[size] = temp;
      size = size-1;
      sink(1);}}
  
  public void swim (int i) {
    while (i!=1) {
      if (heap[i] > heap[i/2]) {
        int temp = heap[i];
        heap[i] = heap[i/2];
        heap[i/2] = temp;
        i = i/2;}
      else {
        break;}}}
  
  public void sink (int i) {
    while (i<size) {
      if (((2*i)<=size) && (heap[i] < heap[2*i])) {
        int temp = heap[i];
        heap[i] = heap[2*i];
        heap[2*i] = temp;
        i = 2*i;}
      else if ((((2*i)+1)<=size) && (heap[i] < heap[(2*i)+1])) {
        int temp = heap[i];
        heap[i] = heap[(2*i)+1];
        heap[(2*i)+1] = temp;
        i = (2*i)+1;}
      else {
        break;}}}
  
  public int [] getheap () {
    if (size == 0) {
      System.out.println("Empty Heap");
      return null;}
    else {
      int [] output = new int [size];
      for (int i = 1; i<=size; i++) {
        output[i-1] = heap[i];}
      return output;}}
  
}