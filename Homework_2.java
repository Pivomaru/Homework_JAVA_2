import javax.xml.transform.Source;

/**
 * Homework_2
 */
public class Homework_2 {
    public static void main(String[] args) {
        System.out.println(isPolind("adda"));
    }

    public static boolean isPolind(String source) {
        StringBuilder builder = new StringBuilder(source);
        builder.reverse();
        return source.equals(new StringBuilder(source).reverse().toString());
    }
}
   
