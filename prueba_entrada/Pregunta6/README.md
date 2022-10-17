## Responde las siguientes preguntas (5 puntos)
*Jessica Abejita, está diseñando una aplicación SuperAwesomeApp que utiliza un tipo de datos que
inventó llamado SuperFastList. Revisó las notas de la clase CC-3S2 y se dio cuenta de que debía
desacoplar la aplicación del tipo de datos con una interfaz, por lo que ideó el siguiente diagrama de
dependencia, en el que SuperFastCollection es una interfaz. Desafortunadamente, se olvidó de su idea
inicial y necesita un consejo, así que los llamo a ustedes que asisten a clases.*

<p align="center">
  <img src="https://i.imgur.com/SEgVvPP.png" height="280" width="180">
</p>

***¿Qué puedes decir de las siguientes declaraciones ?***
- El diagrama también debe mostrar una dependencia de SuperAwesomeApp en SuperFastList, ya que una 
clase no puede depender solo de una interfaz y debe tener acceso a la implementación.
- SuperFastList depende de SuperFastCollection porque lo implementa, y un cambio en la interfaz probablemente implica un cambio en la clase.
- Si este diagrama es correcto, no se puede crear una instancia de SuperFastList dentro de SuperAwesomeApp, 
pero se puede pasar un objeto de tipo SuperFastList a SuperAwesomeApp. 



*Jessica les dice que su amigo CesarL. Hacker señaló que SuperFastList implementa correctamente todos
los métodos declarados en la interfaz java.util.List. Él le sugirió que debería reemplazar la interfaz
SuperFastCollection en el diagrama por java.util.List.*

***Jessica quiere tu opinión.***

- Sería deseable reemplazar SuperFastCollection por java.util.List si es posible
- No será posible reemplazar SuperFastCollection por java.util.List si SuperFastCollection
contiene métodos adicionales que no están en java.util.List
- Puede que no sea posible reemplazar SuperFastCollection por java.util.List, porque
SuperAwesomeApp puede llamar a métodos que no pertenecen a java.util.List
- Puede que no sea posible reemplazar SuperFastCollection por java.util.List, porque
SuperFastList puede contener métodos que no pertenecen a java.util.List

*Jessica descubre que su aplicación necesita un método de lista extra para conquerWorld que
actualmente no es un método de SuperFastList. Entonces crea una subclase ExtraSuperFastList de
SuperFastList. Actualmente, SuperAwesomeApp usa solo una lista superrápida que se crea fuera y se
pasa como parámetro. CesarL advierte a Jessica que es posible que deba cambiar la forma en que se pasa
este parámetro.*

***Para que SuperAwesomeApp llame a este nuevo método,¿cuál debe ser el tipo declarado/tipo de tiempo de ejecución del parámetro?***

- [ ] a) SuperFastCollection / SuperFastList
- [ ] b) SuperFastCollection / ExtraSuperFastList
- [ ] c) SuperFastList / ExtraSuperFastList
- [ ] d) ExtraSuperFastList / ExtraSuperFastList
