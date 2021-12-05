package my.codingbat.solutions.functional1;

public class Copies {
    
    public List<String> copies3(List<String> strings) {
        return strings.stream().map(i->i+i+i).collect(Collectors.toList());
      }
}
