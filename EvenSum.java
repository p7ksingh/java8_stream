import java.util.List;

public class EvenSum {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5,6,7,8,9);
       int sum= list.stream()
            .filter(s->s%2 == 0)
            .mapToInt(Integer :: intValue)
            .sum();
            System.out.println(sum);
    }
    
}
