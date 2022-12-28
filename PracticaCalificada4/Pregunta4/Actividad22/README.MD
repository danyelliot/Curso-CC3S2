# Actividad 22

Toda la actividad se encuentra en el repositorio [calculador](https://github.com/danyelliot/calculador)


## Agregar JaCoCo a Gradle

<img src="./img/d1.png" height="500">

### Ejecución

```
$ ./gradlew test jacocoTestCoverageVerification
```

<img src="./img/d2.png" >

```
$ ./gradlew test jacocoTestReport
```

<img src="./img/d3.png" >

## Agregando una etapa de cobertura de código

<img src="./img/d4.png" >

<img src="./img/d5.png" >

## Publicación del informe de cobertura de código

<img src="./img/d6.png" >

## Análisis de código estático

1. Agregamos la configuración de Checkstyle
2. Agregamos la etapa Checkstyle
3. Opcionalmente, publicamos el informe Checkstyle en Jenkins

## Agregamos la configuración de Checkstyle

```
<?xml version="1.0"?>
<!DOCTYPE module PUBLIC
    "-//Puppy Crawl//DTD Check Configuration 1.2//EN"
    "http://www.puppycrawl.com/dtds/configuration_1_2.dtd">
<module name="Checker">
   <module name="TreeWalker">
     <module name="ConstantName"/>
    </module>
</module>
```

## Información

```
plugins {
...
id 'checkstyle'
}
```

```
$ ./gradlew checkstyleMain
```

<img src="./img/d7.png" >

Agregando 

```
@SpringBootApplication
public class CalculatorApplication {
private static final String constant = "constant";
public static void main(String[] args) {
SpringApplication.run(CalculatorApplication.class,
args);
}
}
```


<img src="./img/d8.png" >

## Agregando una etapa de análisis de código estático

```
stage("Static code analysis") {

steps {
sh "./gradlew checkstyleMain"
}
}
```
