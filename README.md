E-Commerce OOP – Venta de Equipos de Telecomunicaciones

Descripción del Proyecto

Este proyecto consiste en el desarrollo de un sistema básico de e-Commerce enfocado en la venta de equipos de telecomunicaciones, implementado utilizando los principios de la Programación Orientada a Objetos (OOP) en Java.
El sistema modela las entidades principales de una plataforma de comercio electrónico, tales como Producto, Usuario y Carrito de Compras. El objetivo es demostrar la correcta implementación de clases, atributos, constructores y métodos aplicando los principios fundamentales de OOP.

Objetivo del Proyecto
Aplicar los principios de Programación Orientada a Objetos.
Modelar las entidades principales de una plataforma e-Commerce.
Implementar clases como Producto, Usuario y Carrito.
Gestionar productos dentro de un carrito de compras.
Calcular dinámicamente el total de una compra.

Tecnologías Utilizadas
Java JDK 17 (Zulu OpenJDK)
Visual Studio Code
Git
GitHub

Implementación del Sistema

Clase Producto
La clase Producto representa los equipos de telecomunicaciones disponibles en la tienda.

Atributos implementados:
id
nombre
descripcion
precio
stock

Se desarrolló:
Constructor para inicializar los atributos.
Métodos getter y setter para la gestión de datos.
Encapsulamiento mediante atributos privados.


Clase Usuario
La clase Usuario representa los usuarios registrados en la plataforma.

Atributos implementados:
id
nombre
correoElectronico
contrasena

Se implementó:
Constructor para inicialización.
Métodos para acceder y modificar atributos.
Aplicación del principio de encapsulamiento.


Clase Carrito
La clase Carrito gestiona los productos seleccionados por el usuario antes de generar una compra.

Atributos implementados:
Lista de productos
total acumulado
Métodos implementados:
agregarProducto()
removerProducto()
calcularTotal()
getTotal()
