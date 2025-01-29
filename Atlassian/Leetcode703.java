
import java.util.PriorityQueue;


public class Leetcode703 {
    //6Company 30 Days Challenge 
    //Leetcode 703 ==> Kth Largest Element in a Stream

    PriorityQueue<Integer> pq;
    int k;
    public static KthLargest(int k, int[] nums) {
      this.k = k;
      pq = new PriorityQueue<>();
      for(int num : nums){
            add(num);
      }
    }

    public static int add(int val) {

    }

    public static void main(String[] args) {

    }
}
