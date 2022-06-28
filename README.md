# Torneo
Proyecto para aprender sobre objetos y colecciones

## Temas

En este proyecto vamos a practicar varios de los conceptos aprendidos en las clases anteriores, incluyendo:

* GIT
    * Comandos
    * Ramas
    * Pull Requests
* Conceptos básicos de Java
    * Inputs
    * Objetos
    * Herencia
    
Y aprenderemos algunos conceptos nuevos como las colecciones, específicamente Listas y Mapas.


## Metodología

Vamos a dividir este proyecto en 3 etapas, cada una de las cuales puede ser resuelta en un dia de trabajo (un par de horas).

Cada etapa se va a completar con la creación de un Pull Request con los cambios pedidos.

El maestro revisará los Pull Request con los comentarios que correspondan para que sean arreglados por el alumno. También podrá recibir comentarios de sus compañeros.

Si bien la entrega será individual, se recomienda interactuar con sus pares para mejorar la experiencia y acelerar el proceso.

Pueden contactar al maestro por consultas en cualquier momento y por cualquier medio, pero tengan en cuenta que puede demorar en contestar.

##Etapas

Antes de comenzar a trabajar, cada alumno deberá crear su puropia "copia" del repositorio. Esto es diferente de una rama, porque no se unirá nuevamente al main, sino uqe sera un repositorio completamente independiente.

Este tipo de "copia" se llama FORK (tenedor). Para ello iremos a https://github.com/Proyecto-Vegeta/torneo

Se debe presiona rel boton "Fork" que se encuentra arriba a la derecha, entre "Watch" y "Star".

Cada participante creará el repositorio con el mismo nombre: "torneo" pero en su propio espacio de trabajo. (No toquen nada, solo aprieten "Create fork")

Ahora clonarán su repositorio en su GIT local. 

Para eos tocan el boton verde "Code", se copian la dirección que aparece, y en Intellij eligen la opción "Create from VCS".

Recuerden crear una rama antes de hacer los primeros cambios

### Primera Etapa: Luchadores

Primero creamos la rama "luchadores"

```
Boton derecho -> GIT -> New Branch
```

Al comenzar el programa, deberá mostrarse el siguiente menu:

```bash
Torneo
1.- Agregar luchador
2.- Borrar luchador
3.- Listar luchadores
4.- Salir

Opcion:
```

El usuario debera ingresar una opción válida (1,2, 3 o 4)

Si eligió la opción 1, el programa ira preguntando en secuencia:

```bash
Nombre:
```

```bash
Tipo:
1.- Boxeador
2.- Yudoka
3.- Tirador

Opcion:
```

```bash
Fuerza (1..10):
```
```bash
Resistencia (1..10):
```
```bash
Destreza (1..10):
```


Si eligió la opción 2, el programa preguntará por nombre, y eliminará el peleador indicado.


Si eligió la opción 3, el programa imprimirá una lista como la siguiente:

```bash
Nombre         Tipo            Fuerza     Resistencia     Destreza
Goku           Tirador          10            9              8
Krilin         Boxeador         5             7              10
Vegeta         Yudoka           9             10             8
```

Para crear esta lista puede ser muy util el uso de tabuladores, de esta manera:

```java
System.out.println("Nombre\t\tTipo\t\tFuerza\t\tResistencia\t\tDestreza");
for(Peleador peleador: peleadores){
  System.out.println(peleador.getNombre() + "\t\t" +peleador.getTipo() +"\t\t" + peleador.getFuerza() 
  + "\t\t" + peleador.getResistencia() + "\t\t" peleador.getDestreza());
}
```

Finalmente, con la opción 4 finalizará el programa.


### Segunda etapa: Peleas

No se debe iniciar la segunda etapa, a menos que se hubiera completado la primera con éxito, esto es decir, el Pull Request fue aprobado por el maestro y mergeado.

Crearemos una nueva rama llamada "peleas".

Crearemos una nueva opción:

```bash
5.- Pelear
```

Cuando el usuario seleccione esta opción, el sistema preguntará por el nombre de los dos peleadores que participarán de esta pelea.

Para ello, cada peleador implementará un método:

```java
public int pelear() {}
```

que cada tipo de peleador implementará de manera diferente:

Boxeador: (2*fuerza)+resistencia

Yudoka: (2*resistencia)+destreza

Tirador: (2*destreza)+fuerza


El programa decidirá como ganador al que tenga mayor puntaje. Si tienen el mismo puntaje declarará un empate.



### Tercera etapa: Torneo

No se debe iniciar la tercera etapa, a menos que se hubiera completado la segunda con éxito, esto es decir, el Pull Request fue aprobado por el maestro y mergeado.

Crearemos una nueva rama llamada "torneo".

Crearemos una nueva opción:

```bash
6.- Torneo
```

Esta etapa solo se aceptará si hay al menos 4 peleadores creados. De haber más se ignorarán.
El torneo consisten en:

1. Realizar una pelea ente el primer y segundo peleador.
1. Realizar una pelea ente el tercer y cuarto peleador.
1. Realizar una pelea entre los ganadores de las peleas anteriores

De haber un empate, se cancela el torneo.

El sistema debe imprimir los resultados de cada pelea, y declarar al campeón.

