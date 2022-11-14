# Pregunta 1 ( 3 puntos) 

## ¿Cuál es el resultado de la siguiente clase?
```
1: import java.util.function.*;
2:
3: public class Panda {
4: int age;
5: public static void main(String[] args) {
6: Panda p1 = new Panda();
7: p1.age = 1;
8: check(p1, p -> p.age < 5);
9: }
10: private static void check(Panda panda,
11: Predicate<Panda> pred) {
12: String result =
13: pred.test(panda)?"match":"not match";
14: System.out.print(result);
15: } }
```
> El resultado es `match`

Se crea un objeto p1 Panda y con el metodo check que tiene de firma el objeto panda y una lambda predicate que en este caso resulta verdadero por que p.age es menor que 5 , el metodo check en su variable result se iguala a match ya que el lambda predicate es verdadero ,y finalmente retorna el result y lo imprime.

<img src="https://i.imgur.com/cYT9OXV.png" height="500">


## ¿Cuál es el resultado del siguiente código?
```
1: interface Climb {
2: boolean isTooHigh(int height, int limit);
3: }
4:
5: public class Climber {
6: public static void main(String[] args) {
7: check((h, m) -> h.append(m).isEmpty(), 5);
8: }
9: private static void check(Climb climb, int height) {
10: if (climb.isTooHigh(height, 10))
11: System.out.println("too high");

12: else
13: System.out.println("ok");
14: }
15: }
```
>La salida de el código es : `java: int cannot be dereferenced`.

>Esto se debe a que las variables `height` y `limit` son `int` , y en este caso no se puede utilizar un `append()` ya que este no funciona con `primitivas`.

<img src="https://i.imgur.com/hCbvsZc.png" height="500">

***Corrección***
El error se encuentra en la expresión `Lambda` 
```
check((h,m)->h.append(m).isEmpty(),5);
```
Se necesita asignarle una variable de referencia de Climb. Y no una variable primitiva como se mostro anteriormente ya que esta no funciona con `append()`
```
check((h, m) -> h > m, 5);
```
<img src="https://i.imgur.com/ZbhWpYc.png" height="500">

## ¿Qué lambda puede reemplazar la clase Secret1 para devolver el mismo valor?
```
interface Secret {
String magic(double d);
}
class Secret1 implements Secret {
public String magic(double d) {
return "Poof";
}
}
```
### Respuesta 
```
Secret expresion = (a) -> { String f = ""; return "Poof"; } ;
```

<img src="https://i.imgur.com/m9BneEr.png" height = "500">

## Completa sin causar un error de compilación

```
public void remove(List<Character> chars) {
char end = 'z';
chars.removeIf(c -> {
char start = 'a'; return start <= c && c <= end; });
// Inserta código
}
```
### Respuesta

```
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
```

> `start` y `c` están contenidos en lambda, entonces las variables se pueden instanciar y no causan un error de compilación.


<img src = "https://i.imgur.com/iPgy1NP.png" height = "500">

## ¿Qué puedes decir del siguiente código?

```
int length = 3;
for (int i = 0; i<3; i++) {
if (i%2 == 0) {
Supplier<Integer> supplier = () -> length; // A
System.out.println(supplier.get()); // B
} else {
int j = i;
Supplier<Integer> supplier = () -> j; // C
System.out.println(supplier.get()); // D
}
}
```
>Salida : 3 1 3

El código compila y se ejecuta de manera correcta , esto pasa ya que las variables finales estan referenciadas por lambdas , en //C j es una variable final ya que cada vez que se ingresa al condicional else se vuelve a declarar la variable.

<img src="https://i.imgur.com/czkrnpd.png" height="500">

## Inserta código sin causar un error de compilación

```
public void remove(List<Character> chars) {
char end = 'z';
// Insertar código
chars.removeIf(c -> {
char start = 'a'; return start <= c && c <= end; });
}
```

### Respuesta 
> `chars = null ;`

A diferencia de la pregunta anterior , las lambdas solo pueden hacer referencia a las variables finales y generaria un error de compilación si se declaran las variabels start , c o se cambia el valor de end. `Variable used in lambda expression should be final or effectively final`.

```
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
```

<img src= "https://i.imgur.com/zveGoKX.png" height = "500">


