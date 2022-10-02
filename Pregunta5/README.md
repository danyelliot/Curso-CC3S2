## ¿Cuál es el resultado del siguiente código? (3 puntos)
La salida de el código es un ***error*** -> `java: int cannot be dereferenced`
>Esto se debe a que las variables `height` y `limit` son `int` , y en este caso no se puede utilizar un `append()` ya que este no funciona con `primitivas`.

<img src="https://i.imgur.com/3stMvvJ.png" height="400" >

## Corrección
El error se encuentra en la expresión `Lambda` 
```
check((h,m)->h.append(m).isEmpty(),5);
```
Se necesita asignarle una variable de referencia de Climb. Y no una variable primitiva como se mostro anteriormente ya que esta no funciona con `append()`
```
check((h, m) -> h > m, 5);
```
<img src="https://i.imgur.com/YXJ6MDc.png" height="400">

La salida es correcta ya que 5 no pasa el limite establecido que es 10.

Esta salida es correcta ya que 11 si pasa el limite establecido.
<img src="https://i.imgur.com/AvVgGvm.png" height="400">
