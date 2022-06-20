import java.util.ArrayList;
import java.util.List;
    public class StreamExample {
        public static void main(String[] args) {

            List<String> memberNames = new ArrayList<>();
            memberNames.add("Ira");
            memberNames.add("Ada");
            memberNames.add("Adela");
            memberNames.add("Arbis");
            memberNames.add("Jane");

            /*
            memberNames.stream().filter((s) -> s.startsWith("A"))
                    .forEach(System.out::println);
*/


            memberNames.stream().filter((s) -> s.startsWith("A"))
                    .map(String::toUpperCase)
                    .forEach(System.out::println);


        }

    }

