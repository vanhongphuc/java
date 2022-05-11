import java.util.LinkedHashSet;
import java.util.Set;

public class App60 {
    public static void main(String[] arg) {

        Set<String> linkHashSet = new LinkedHashSet<String>();
        linkHashSet.add("java");
        linkHashSet.add("C++");
        linkHashSet.add("java");
        linkHashSet.add("PHP");

        for (String str : linkHashSet  ) {
            System.out.println(str);
        }
        
    }
}