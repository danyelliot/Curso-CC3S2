# Pregunta 2

## En un sistema basado en microservicios puede haber diferentes tipos de comunicación; sin embargo,
debe haber un tipo de comunicación predominante.
### ¿Cuál escogerías?

> La comunicación a través de mensajes asíncronos, utilizando una cola de mensajes o una plataforma de mensajería. Ya que tiene la ventaja del mejoramiento de la escalabilidad y ofrece una buena respuesta frente a fallos del sistema.

### ¿Qué otros están permitidos además?

> La comunicación a travez de RESTfull API's , la comunicación a través de RPC(Remote Procedure Call) , Comunicación a través de eventos y la comunicación a través de una base de datos compartida
### ¿En qué situaciones?

> Comunicación a través de mensajes asíncronos: Es útil cuando se necesita una comunicación altamente escalable y que pueda responder frente a fallos. También puede ser útil en entornos donde los tiempos de respuesta no son críticos o cuando es necesario procesar grandes volúmenes de datos.

> Comunicación a través de RESTful APIs: Es útil cuando se busca una implementación simple , y adicional a esto es muy compatible con muchos lenguajes y plataformas. También puede ser útil en entornos donde se necesitan tiempos de respuesta rápidos y se requiere una integración sencilla con otras aplicaciones o sistemas.

> Comunicación a través de RPC: Es útil cuando se necesita una comunicación rápida y eficiente entre microservicios, y cuando se desea exponer un conjunto de funciones específicas a otros microservicios.

> Comunicación a través de eventos: Es útil cuando se desea que los microservicios sean notificados de manera asíncrona de ciertos eventos o cambios en el sistema. También puede ser útil en entornos donde se necesita una comunicación altamente escalable y tolerante a fallos.

> Comunicación a través de una base de datos compartida: Es útil cuando se desea que los microservicios tengan acceso directo a la misma base de datos y se que exista una integración sencilla con otras aplicaciones o sistemas. También puede ser útil en entornos donde se necesitan tiempos de respuesta rápidos.


### ¿Utilizarías la replicación de datos en un sistema basado en microservicios?

> Sí , ya que es útil en entornos donde los microservicios se ejecutan en múltiples máquinas o en la nube, ya que permite que los datos estén disponibles en todos los lugares donde se ejecutan los microservicios.

### ¿En qué áreas?

Se podria implementar en las siguientes áreas :

> Sistemas de bases de datos

> Aplicaciones distribuidas






