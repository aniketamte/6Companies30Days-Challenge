
import java.util.*;


public class Leetcode703 {
    //6Company 30 Days Challenge 
    //Leetcode 703 ==> Kth Largest Element in a Stream

    PriorityQueue<Integer> pq;
    int k;
    public Leetcode703(int k, int[] nums) {
      this.k = k;
      pq = new PriorityQueue<>();
      for(int num : nums){
            add(num);
      }
    }

    public int add(int val) {
      if(pq.size()<k || val>pq.peek()){
            pq.offer(val);
            if(pq.size()>k){
                  pq.poll();
            }
      }
      return pq.peek();
    }

    public static void main(String[] args) {

    }
}
