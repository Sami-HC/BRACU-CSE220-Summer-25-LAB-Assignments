//YOU NEED TO ONLY WRITE THE FOLLOWING METHODS
// enqueueCall()
// dequeueCall()
// displayQueue()
// Inside of these methods you need to utilize the objects of LinkedListQueue class
// vipQueue and regularQueue objects are already created for you
class CallQueue {

    private LinkedListQueue vipQueue;
    // VIP queue
    private LinkedListQueue regularQueue;
    // Regular queue

    //DO NOT CHANGE THIS CONSTRUCTOR
    public CallQueue() {
        this.vipQueue = new LinkedListQueue();
        this.regularQueue = new LinkedListQueue();
    }

    //You have to write this method
    public void enqueueCall(int customerId, boolean isVip) {
      if (isVip) {
        System.out.println("Customer "+customerId+" added to VIP queue.");
        vipQueue.enqueue(customerId);}
      else {
        System.out.println("Customer "+customerId+" added to Regular queue.");
        regularQueue.enqueue(customerId);}
    }

    //You have to write this method
    public void dequeueCall() {
      if (vipQueue.isEmpty() && !regularQueue.isEmpty()) {
        System.out.println("Processing Regular Customer "+regularQueue.peek());
        regularQueue.dequeue();}
      else if (!vipQueue.isEmpty()) {
        System.out.println("Processing VIP Customer "+vipQueue.peek());
        vipQueue.dequeue();}
      else {
        System.out.println("No calls in the queue.");}
    }

    //You have to write this method
    public void displayQueue() {
      System.out.println("VIP Queue:");
      vipQueue.displayQueue();
      System.out.println("Regular Queue:");
      regularQueue.displayQueue();
    }

}
