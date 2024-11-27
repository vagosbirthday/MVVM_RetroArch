# Motivational App  

## Descripción  

Motivational App es una aplicación Android desarrollada utilizando **MVVM (Model-View-ViewModel)** como patrón de arquitectura y **Retrofit** para consumir datos desde una API externa. La aplicación muestra frases motivacionales obtenidas de la API de [ZenQuotes](https://zenquotes.io).  

### **Características principales**  
- Arquitectura MVVM para organizar el código y separar responsabilidades.  
- Uso de **ViewBinding** para simplificar la manipulación de vistas en la interfaz.  
- Integración con la API de ZenQuotes para generar frases motivacionales aleatorias.  
- Botón interactivo que permite refrescar y cargar nuevas frases.  

---

## **Cómo funciona la aplicación**  

### **Vista (View)**  
La interfaz consta de:  
- Un `TextView` donde se muestra la frase motivacional generada.  
- Un `Button` que permite al usuario obtener una nueva frase de la API al presionarlo.  

### **Modelo (Model)**  
El modelo define la estructura de los datos que se consumen de la API. Por ejemplo:  

```kotlin  
data class Quote(  
    val q: String,  // Contenido de la frase  
    val a: String   // Autor de la frase  
)
'''
