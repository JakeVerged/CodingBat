package my.codingbat.solutions.functional1;

/*

Given a list of strings, return a list where each string has "y" added at its start and end.

moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
moreY(["yay"]) → ["yyayy"]

Refer:
https://codingbat.com/prob/p177528
*/

public class MoreY {
 
    public List<String> moreY(List<String> strings) {
        return strings.stream().map(i-> "y"+i+"y").collect(Collectors.toList());
       }

}
