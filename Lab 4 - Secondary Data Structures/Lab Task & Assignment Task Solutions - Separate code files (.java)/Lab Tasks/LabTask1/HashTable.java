/*You will have to complete the FruitNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and insert()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    //ht[] :: is the HashTable array that stores the FruitNode objects
    private FruitNode[] ht;

    //Constructor that initializes the HashTable array
 //DO NOT change this Constructor
    public HashTable(int size){
        this.ht = new FruitNode[size];
    }
    
    //This method basically prints the HashTable
    //DO NOT change this method
    public void show(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" " );
            FruitNode n = ht[i];
            while (n!=null){
                System.out.print("('"+n.fruit[0]+"', "+n.fruit[1]+") --> ");
                n = n.next;
            }
            System.out.println();
        }
    }

    //you need to COMPLETE this method
    private int hashFunction( String key ){
      int sum = 0;
      if (key.length()%2==0) {
        for (int i = 0; i<key.length(); i++) {
          if (i%2==0) {
            sum += key.codePointAt(i);}}}
      else {
        for (int i = 0; i<key.length(); i++) {
          if (i%2!=0) {
            sum += key.codePointAt(i);}}}
      return sum%ht.length;
    }

    //you need to COMPLETE this method
    //The insert() method will create a FruitNode using name(Key) & price(value)
 //then inserts it in the proper hashed index
    //If collision occurs resolve using the steps explained in the question
    public void insert(String key, Integer value){
        int keyindex = hashFunction(key);
        
        if (ht[keyindex]!=null) {
          
          FruitNode n = ht[keyindex];
          boolean found = false;
          while (n!=null) {
            if (key.equals((String)n.fruit[0])) {
              n.fruit[1] = value;
              found = true;}
            n = n.next;}
          
          if (found == false) {
            boolean found2 = false;
            FruitNode temp = new FruitNode(key, value);
            n = ht[keyindex];
            FruitNode prev = null;
            while (n!=null) {
              if (value>=(int)n.fruit[1]) {
                if (n == ht[keyindex]) {
                  temp.next = ht[keyindex];
                  ht[keyindex] = temp;
                  found2 = true;}
                else {
                  prev.next = temp;
                  temp.next = n;
                  found2 = true;}}
              prev = n;
              n = n.next;}
            
            if (found2 == false) {
              n = ht[keyindex];
              while (n.next!=null) {
                n = n.next;}
              n.next = temp;}}}
        
        else {
          ht[keyindex] = new FruitNode(key, value);}
    }

}
