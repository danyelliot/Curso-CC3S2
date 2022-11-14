package pregunta1;

import java.util.List;

public class CompletarSinErrorDeCompilacion {

    public void remove(List<Character> chars) {
        char end = 'z';
        chars.removeIf(c -> {
            char start = 'a'; return start <= c && c <= end; });
            char start = 'a';
            char c = 'y';
    }
}
