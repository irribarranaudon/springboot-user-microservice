# springboot-user-microservice

Este repositorio consta de 3 proyectos:
- eureka-microservice, para el autodescubrimiento de microservicios
- apigateway-zuul-microservice, para el enrutamiento desde un único punto de entrada.
- user-microservice, como único microservicio en este caso un CRUD de usuarios, mediante api rest, sin autenticación y con base de datos en memoria (h2).

## Requisitos

- Java 8

## Instrucciones para construir el proyecto.

Para probar este proyecto, es importante seguir el orden indicado a continucación, primero tenemos que levantar el servidor de nombres, en este caso eureka, para esto nos situamos en la raíz del proyecto eureka-microservice y ejecutamos el siguiente comando:
```
./gradlew bootRun
```

Luego, levantamos nuestro microservicio de CRUD de usuarios user-microservice, para esto hacemos los mismo que con el proyecto anterior, nos situamos en la raíz del proyecto **user-microservice** y ejecutamos el siguiente comando:

```
./gradlew bootRun
```

Finalmente solo queda levantar apigateway, para eso nos situamos en la raíz del proyecto **apigateway-zuul-microservice** y ejecutamos el mismo comando que en los casos anteriores:

```
./gradlew bootRun
```
Con esto ya es posible consumir con algún cliente como Postman por ejemplo, los servicio.

## Servicios rest expuestos por api gateway

Por defecto la apigateway escucha en el puerto:8090 por lo que los request quedarían de la siguiente forma:

### Crear usuario

```
POST - http://localhost:8090/api/user
```

### Listar usuarios

```
GET - http://localhost:8090/api/user
```

### Buscar usuario por id

```
GET - http://localhost:8090/api/user/{user-id}
```

### Actualizar usuario

```
POST - http://localhost:8090/api/user/{user-id}
```

### Eliminar usuario

```
DELETE - http://localhost:8090/api/user/{user-id}
```

## Base de datos 

Se utilizó una base de datos en memoria (H2), para ver los registros tenemos que ir al siguiente link, como la base de datos está en el microservicio usuario, sabemos que dicho microservicio por defecto escucha en el puerto 8080 por lo que la url quedaría como se muestra a continuación:

```
http://localhost:8080/h2-console/
```

## Swagger

Todos los servicios rest del microservicio de creación de usuarios quedaron documentados con swagger, para ver el detalle de cada endpoint, tendremos que ir a la siguiente url.

Aquí no solo podremos ver los datos de entrada, sino que también podremos probar directamente los servicios del microservicio de creación de usuarios, sin utilizar la api gateway como enrutador.

```
http://localhost:8080/swagger-ui.html#/u
```

