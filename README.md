# Proyecto Tienda de Tenis

## Descripción
Aplicación de consola en Java para gestionar una tienda de tenis: productos,
proveedores, inventario, carritos y pedidos. Se desarrolla para aplicar la
metodología Scrum y el uso de GitHub.

## Objetivo
Desarrollar una aplicación que permita gestionar los productos de una tienda
de tenis y aplicar los conceptos aprendidos sobre metodologías ágiles.

## Metodología
El proyecto se desarrolla con la metodología ágil Scrum.

## Equipo
- Daniel Alfonso Cartagena Gil
- Daniel Jimenez Martinez
- Wilmer Meneses Gaviria

## Tecnologías
- Java (JDK 17 o superior)
- Maven
- MySQL + phpMyAdmin (XAMPP)
- IntelliJ IDEA

## Requisitos
1. Tener XAMPP instalado, con **Apache** y **MySQL** iniciados.
2. Crear en phpMyAdmin una base de datos llamada `tienda_tenis`.
3. Ejecutar el script `database/schema.sql` para crear las tablas y cargar
   los datos de ejemplo.

## Cómo ejecutar
1. Clonar el repositorio.
2. Abrir el proyecto en IntelliJ y dejar que Maven descargue las dependencias.
3. Revisar en `ConexionBD.java` que el usuario y la contraseña de MySQL
   coincidan con los de tu equipo (por defecto: `root` sin contraseña).
4. Ejecutar la clase `Main`.

## Funcionalidades
- Productos: listar, buscar y agregar
- Proveedores: listar, buscar y agregar
- Inventario: consultar disponibilidad por talla
- Carritos: listar, buscar y agregar productos
