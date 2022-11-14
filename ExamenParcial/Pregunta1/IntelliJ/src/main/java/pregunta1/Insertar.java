package pregunta1;
import java.util.List;
public class Insertar {
    public void remove(List<Character> chars) {
        char end = 'z';
        chars = null ;
        chars.removeIf(c -> {
            char start = 'a'; return start <= c && c <= end; });
    }
}
