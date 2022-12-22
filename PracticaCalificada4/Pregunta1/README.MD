# Pregunta 1 (3 puntos)

Se incorporará una nueva característica del producto en el entorno SOA que se muestra en la figura.

<img src="https://i.imgur.com/8Ckg9vw.png" height="200">

El CRM no tiene soporte para campañas de correo electrónico. Por lo tanto, se debe implementar un
sistema para campañas de correo electrónico. Se sugiere que se creen dos servicios, uno para la creación
y ejecución de campañas y un segundo servicio para evaluar los resultados de una campaña.
Responde a las siguientes preguntas:

- ¿Se necesita la infraestructura SOA para integrar los dos nuevos servicios?

> Sí , ya que es importante tener una infraestructura de arquitectura de servicios orientada a objetos (SOA) porque proporciona un marco para desarrollar y ejecutar servicios y evaluar los resultados de la campaña. Al utilizar SOA, los servicios pueden diseñarse de manera modular y reutilizable, lo que facilita su integración y mantenimiento en el entorno de gestión de relaciones con clientes (CRM) y permite que se comuniquen de manera estandarizada y segura, lo que es esencial para garantizar la integridad y confidencialidad de los datos y operaciones de las campañas de correo electrónico


- El servicio de evaluación de campañas necesita manejar una gran cantidad de datos.


- ¿Sería mejor utilizar la replicación de datos, la integración a nivel de interfaz de usuario o las
llamadas de servicio para acceder a grandes cantidades de datos?

> La mejor opcion para manejar una gran cantidad de datos para el servicio de evaluación de resultados para campañas de correo electrónico dependerá de ciertos factores, como el rendimiento requerido, la disponibilidad de los datos, la complejidad de la integración y la escalabilidad deseada.
Sin embargo una opción viable son las llamadas de servicio , ya que esto implica  hacer solicitudes a través de la red para acceder a los datos mediante llamadas a un servicio remoto. Esto resulta beneficioso en términos de escalabilidad, ya que permite que el servicio de evaluación de campañas se ejecute de manera independiente y se pueda utilizar por diferentes aplicaciones o sistemas sin tener que integrarse a nivel de interfaz de usuario. Sin embargo, también puede tener el inconveniente de que puede ser mas lento que la lectura de datos de una copia local como se haria en la replicacion de datos, y pueden requerir una mayor cantidad de ancho de banda y recursos de red para realizar las solicitudes.


- ¿Cuál de estas opciones de integración suele ofrecer SOA?

> Los tres son integraciones que ofrece SOA , sin embargo la replicación de datos y la integración a nivel de interfaz de usuario son técnicas que  se pueden utilizar en cualquier tipo de arquitectura, no solo en una SOA. Esto no ocurre con las llamadas de servicio que sí son una forma de integración típica en una arquitectura orientada a servicios (SOA)


- ¿Debe el servicio integrarse al portal existente o tener su propia interfaz de usuario?

>Para el servicio de evaluaciones de resultados de campañas electronicas , se deberia tener una propia interfaz de usuario ya que es beneficioso en términos de flexibilidad, y permitiria diseñar la interfaz de usuario de acuerdo a las necesidades específicas para el servicio , su uso y su proposito.

- ¿Cuáles son los argumentos a favor de cada opción?

> Integración al portal existente: Resultara beneficioso en términos de usabilidad, ya que permitiria a los usuarios acceder al servicio de manera intuitiva y sin tener que aprender una interfaz de usuario nueva. Tambien facilitaria la gestión del servicio, ya que el portal existente proporciona un marco de trabajo para el despliegue y la administración del servicio.

> Propia interfaz de usuario: Resultara beneficioso en términos de flexibilidad, ya que permitiria diseñar la interfaz de usuario de acuerdo a las necesidades específicas del servicio y la experiencia de usuario deseada. Tambien facilitaria la implementación y la creación de una interfaz de usuario propia según sea los requerimientos, ya que no dependeria de la integración con un portal existente.

- ¿Deberías implementar la nueva funcionalidad, el equipo de CRM?

> Sí , ya que el equipo de CRM suele tener conocimientos y experiencia en el manejo de datos y funcionalidades relacionadas con la gestión de relaciones con los clientes, por lo que es muy probable que posean la habilidad y la capacidad necesarias para implementar la nueva funcionalidad de manera eficiente y efectiva. De igual manera , si el equipo de CRM está involucrado en la implementación desde el principio, también podría aportar ideas y sugerencias valiosas para mejorar la funcionalidad y asegurar que se adapte a las necesidades y requisitos del negocio.




