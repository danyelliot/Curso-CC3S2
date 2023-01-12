# Examen Final CC3S2

## 1. (1 punto)¿Cómo pueden los clientes encontrar microservicios y sus instancias?
A las instancias de microservicios normalmente se les asignan direcciones IP dinámicas cuando
se inician, por ejemplo, cuando se ejecutan en contenedores. Esto dificulta que un cliente realice
una solicitud a un microservicio que, por ejemplo, expone una API REST a través de HTTP.
Considera el siguiente diagrama:
 
<img src="./img/c1.png" height=300>

Los clientes pueden encontrar los microservicios y las instancias de las siguientes maneras :

- Mediante servicios de registro , con nombres de registros. Los cuales para que un cliente pueda encontrar dicho microservicio , lo hace mediante el servicio de registro. Parte de esto omite la asignación de IP dinamica que se le puede asignar al iniciar.

- A travez de DNS dinámicos , a los cuales los clientes acceden a ellos mediante el DNS dinámico que se actualiza y se asocia de manera automática con su la IP dinámica. 

- Otra manera de acceder es por los balanceadores de carga , en los cuales los clientes se conectan a un balanceador el cual distribuye las solicitudes entre las instancias de los microservicios , independientemente de las direcciones IP dinamicas que se les puede asignar. 

## 2. (2 puntos) En un entorno de sistema de microservicios, en muchos casos es deseable exponer algunos de los microservicios al exterior del entorno del sistema y ocultar los microservicios restantes del acceso externo. Los microservicios expuestos deben estar protegidos contra solicitudes de clientes malintencionados.

La protección de los microservicios expuestos al exterior , se pueden proteger mediantes tecnicas de seguridad informatica como :

- Control de acceso : Se utiliza mecanismos de control de acceso basado en roles los cuales garantizan que solos los clientes con permisos asignados para el acceso a recursos especificos puedan hacer uso de estos.
- Autenticación de doble factor : Se puede utlizar mecanismos de doble autenticación con el objetivo de garantizar que los clientes autorizados puedan accede a los microservicios expuestos.
- Protección contra ataques DDOS : Frente a los attaques de denegación de servicios distribuidos (DDOS)  tiene que existir medidads de protección para que los servicios sigan en funcionamiento.
- Injección SQL : Se tienen que tener medidas de protección contra la inyección SQL , para garantizar que los microservicios expuestos no puedan verse comprometidos.
- Monitoreo continuo de la red: Monitorear continuamente el tráfico de red y los registros de acceso para detectar y responder  raudamente frente a sospechaz de actividad maliciosa.


## 3. (2 puntos) Tradicionalmente, como desarrolladores de Java, estamos acostumbrados a implementar la comunicación sincrónica mediante el bloqueo de E/S, por ejemplo, una API RESTful JSON sobre HTTP. El uso de una E/S de bloqueo significa que se asigna un subproceso desde el sistema operativo durante la duración de la solicitud. Si aumentas la cantidad de solicitudes simultáneas, un servidor podría quedarse sin subprocesos disponibles en el sistema operativo, lo que provocaría problemas que van desde tiempos de respuesta más prolongados hasta fallas en los servidores. El uso de una arquitectura de microservicios suele empeorar aún más este problema, donde normalmente se utiliza una cadena de microservicios cooperativos para atender una solicitud. Cuantos más microservicios participen en la atención de una solicitud, más rápido se agotarán los subprocesos disponibles.


Existen dos manera de solucionar esto , una de ellas es continuar con la comunicación sincrónica 
con el bloqueo de E/S , pero en lugar de asignar un subproceso por solicitud, se asigna un subproceso por cliente. Esto permite que el cliente envíe varias solicitudes sin esperar a que se procesen las solicitudes anteriores.

Otra solución es utilizar la comunicación asincrónica , en la cual se envían mensajes sin esperar a que el receptor los procese. Esto permite que el cliente envíe una solicitud y continúe con otras tareas mientras espera la respuesta. El receptor del mensaje puede procesar la solicitud en un subproceso separado, lo que permite que el cliente envíe más solicitudes sin esperar a que se procesen las solicitudes anteriores.

## 4. (2 puntos) Tradicionalmente, una aplicación se implementa junto con su configuración, por ejemplo, un conjunto de variables de entorno y/o archivos que contienen información de configuración. Ante un panorama de sistemas basado en una arquitectura de microservicios, es decir, con una gran cantidad de instancias de microservicios desplegadas, surgen algunas dudas:

- ¿Cómo obtengo una imagen completa de la configuración que existe para todas las instancias de microservicio en ejecución?



- ¿Cómo actualizar la configuración y me aseguro de que todas las instancias de microservicio afectadas se actualicen correctamente?



## 5. (3 puntos) Tradicionalmente, una aplicación escribe eventos logs en archivos logs que se almacenan en el sistema de archivos local del servidor en el que se ejecuta la aplicación. Dado un panorama de sistema basado en una arquitectura de microservicios, es decir, con una gran cantidad de instancias de microservicios implementadas en una gran cantidad de servidores más pequeños, podemos hacernos las siguientes preguntas:
- ¿Cómo se obtiene una descripción general de lo que sucede en el entorno del sistema cuando cada instancia de microservicio escribe en su propio archivo log local?
- ¿Cómo averiguo si alguna de las instancias de microservicio tiene problemas y comienza a escribir mensajes de error en sus archivos logs?
- Si los usuarios finales comienzan a informar problemas,¿cómo puedo encontrar mensajes logs relacionados? es decir,¿cómo puedo identificar qué instancia de microservicio es la causa raíz del problema? El siguiente diagrama ilustra el problema:

<img src="./img/c2.png" height = 250>
