Random Shop

¡Bienvenido a Random Shop! En esta tienda, nos especializamos en ofrecer una experiencia de compra caótica y única. Ofrecemos una variedad de productos que incluyen mascotas, productos gourmet, cartas Magic: The Gathering y calzado outlet. Cada producto tiene un precio que puede variar según sus características específicas y condiciones especiales.

 Objetivos de la Kata

1. Desarrollar lógica de programación y refactorización**: Implementar y mejorar la lógica de cálculo de precios para diferentes tipos de productos, asegurando un código limpio y mantenible.
   
2. Comprensión y aplicación de Tests**: Desarrollar pruebas unitarias exhaustivas para validar el comportamiento correcto del sistema bajo diferentes escenarios y condiciones.

 Requisitos del Proyecto

- Conocimientos básicos de programación en Java y Test.
- Acceso a recursos en línea y soporte proporcionado por el equipo formativo.
- Uso de repositorio en GitHub** para gestionar el código y realizar entregas.

 Estructura del Proyecto

El proyecto está estructurado en las siguientes partes principales:

- `Product`: Clase que representa un producto con atributos como número de patas, edad, olor, color, precio base, nombre y precio de venta.

- `ShoppingCart`: Clase que gestiona la lista de productos añadidos al carrito, calculando el precio total de la compra según las reglas específicas para cada tipo de producto.

 Cambios Realizados y Análisis del Código

 Cambios en el Código

1.  Clase `Product`:
   - Se ha creado una clase `Product` para encapsular los atributos relevantes de cada producto, como el número de patas, la edad, si es apestoso, color, precio base, nombre y precio de venta.

2.  Clase `ShoppingCart`:
   - Se ha implementado la clase `ShoppingCart` para gestionar los productos añadidos al carrito y calcular el precio total de la compra.
   - Se han añadido métodos para agregar productos (`addProduct`) y calcular el precio total (`getTotalPrice`).

3.  Métodos de Cálculo de Precios:
   - Se han creado métodos privados en `ShoppingCart` para calcular el precio de productos específicos como cartas Magic y arañas mascota, teniendo en cuenta diferentes criterios como color, edad y características especiales.

4.  Pruebas Unitarias:
   - Se han desarrollado pruebas unitarias exhaustivas en `ShoppingCartTest` para validar el cálculo de precios para diferentes tipos de productos y escenarios.
   - Cada método de cálculo de precio tiene pruebas específicas que cubren casos normales y límites, asegurando que el sistema funcione correctamente bajo diferentes condiciones.


![Captura de pantalla 2024-06-23 212909](https://github.com/abmmm19888/ramdomShop-kata/assets/169648291/a3481c83-b077-4e22-b14a-c166f60e6eea)

