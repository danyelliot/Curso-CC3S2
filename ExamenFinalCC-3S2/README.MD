# Examen Final CC3S2

## 1. (1 punto)¿Cómo pueden los clientes encontrar microservicios y sus instancias?
A las instancias de microservicios normalmente se les asignan direcciones IP dinámicas cuando
se inician, por ejemplo, cuando se ejecutan en contenedores. Esto dificulta que un cliente realice
una solicitud a un microservicio que, por ejemplo, expone una API REST a través de HTTP.
Considera el siguiente diagrama:
 
<img src="./img/c1.png" height=300>

> Los microservicios se pueden registrar en servicios de registro , con nombres de registros. Los cuales para que un cliente pueda encontrar dicho microservicio , lo hace mediante el servicio de registro. Parte de esto omite la asignación de IP dinamica que se le puede asignar al iniciar.

> A travez de DNS dinámicos , a los cuales los clientes acceden a ellos mediante el DNS dinámico que se actualiza y se asocia de manera automática con su la IP dinámica. 

> Otra manera de acceder es por los balanceadores de carga , en los cuales los clientes se conectan a un balanceador el cual distribuye las solicitudes entre las instancias de los microservicios , independientemente de las direcciones IP dinamicas que se les puede asignar. 

## 2. (2 puntos) En un entorno de sistema de microservicios, en muchos casos es deseable exponer algunos de los microservicios al exterior del entorno del sistema y ocultar los microservicios restantes del acceso externo. Los microservicios expuestos deben estar protegidos contra solicitudes de clientes malintencionados.

> La protección de los microservicios expuestos al exterior , se pueden proteger mediantes tecnicas de seguridad informatica como :
- Control de acceso : Se utiliza mecanismos de control de acceso basado en roles los cuales garantizan que solos los clientes con permisos asignados para el acceso a recursos especificos puedan hacer uso de estos.
- Autenticación de doble factor : Se puede utlizar mecanismos de doble autenticación con el objetivo de garantizar que los clientes autorizados puedan accede a los microservicios expuestos.
- Protección contra ataques DDOS : Frente a los attaques de denegación de servicios distribuidos (DDOS)  tiene que existir medidads de protección para que los servicios sigan en funcionamiento.
- Injección SQL : Se tienen que tener medidas de protección contra la inyección SQL , para garantizar que los microservicios expuestos no puedan verse comprometidos.
- Monitoreo continuo de la red: Monitorear continuamente el tráfico de red y los registros de acceso para detectar y responder  raudamente frente a sospechaz de actividad maliciosa.


## 3. (2 puntos) Tradicionalmente, como desarrolladores de Java, estamos acostumbrados a implementar la comunicación sincrónica mediante el bloqueo de E/S, por ejemplo, una API RESTful JSON sobre HTTP. El uso de una E/S de bloqueo significa que se asigna un subproceso desde el sistema operativo durante la duración de la solicitud. Si aumentas la cantidad de solicitudes simultáneas, un servidor podría quedarse sin subprocesos disponibles en el sistema operativo, lo que provocaría problemas que van desde tiempos de respuesta más prolongados hasta fallas en los servidores. El uso de una arquitectura de microservicios suele empeorar aún más este problema, donde normalmente se utiliza una cadena de microservicios cooperativos para atender una solicitud. Cuantos más microservicios participen en la atención de una solicitud, más rápido se agotarán los subprocesos disponibles.


## 4. (2 puntos) Tradicionalmente, una aplicación se implementa junto con su configuración, por ejemplo, un conjunto de variables de entorno y/o archivos que contienen información de configuración. Ante un panorama de sistemas basado en una arquitectura de microservicios, es decir, con una gran cantidad de instancias de microservicios desplegadas, surgen algunas dudas:

- ¿Cómo obtengo una imagen completa de la configuración que existe para todas las instancias de microservicio en ejecución?
- ¿Cómo actualizar la configuración y me aseguro de que todas las instancias de microservicio afectadas se actualicen correctamente?

salas2022