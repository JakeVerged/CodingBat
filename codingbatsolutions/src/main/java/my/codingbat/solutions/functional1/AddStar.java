package my.codingbat.solutions.functional1;

/*

Given a list of strings, return a list where each string has "*" added at its end.


addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
addStar(["hello", "there"]) → ["hello*", "there*"]
addStar(["*"]) → ["**"]

Refer:
https://codingbat.com/prob/p170181
*/
public class AddStar {

    public List<String> addStar(List<String> strings) {
        return strings.stream().map(i->i+"*").collect(Collectors.toList());
      }
    
}
