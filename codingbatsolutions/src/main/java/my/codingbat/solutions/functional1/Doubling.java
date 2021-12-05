package my.codingbat.solutions.functional1;

public class Doubling {

    public List<Integer> doubling(List<Integer> nums) {
  
        return nums.stream().map(i -> i*2).collect(Collectors.toList());
      
      }
    
}
