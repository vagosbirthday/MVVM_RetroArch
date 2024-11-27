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
```

## ViewModel
El ViewModel actúa como puente entre la vista y el modelo. Solicita datos de la API y los expone para ser observados por la vista.

```kotlin  
class MainViewModel : ViewModel() {  
    private val _quote = MutableLiveData<Quote>()  
    val quote: LiveData<Quote> get() = _quote  

    fun fetchQuote() {  
        // Lógica para obtener frase de la API  
    }  
}  
```

## **Cómo usar la app**
- **Inicio:** Al abrir la aplicación, se mostrará una frase motivacional inicial obtenida de la API.
- **Generar nueva frase:** Pulsa el botón "Nueva frase" para refrescar el contenido con una nueva frase aleatoria.
- **Visualización:** La frase y el autor se mostrarán automáticamente en la pantalla.

## **Tecnologías utilizadas**
- **Kotlin:** Lenguaje principal para el desarrollo de la app.
- **MVVM:** Arquitectura para organizar el código de manera modular y eficiente.
- **Retrofit:** Librería para consumir APIs REST de manera sencilla y eficiente.
- **LiveData:** Permite la observación de datos entre el ViewModel y la vista.
- **ViewBinding:** Simplifica el acceso y manipulación de vistas en el diseño XML.

  ## **Ejemplo de respuesta de la API**

```json
[  
  {  
    "q": "The greatest mistake you can make in life is to be continually fearing you will make one.",  
    "a": "Elbert Hubbard",  
    "h": "<blockquote>&ldquo;The greatest mistake you can make in life is to be continually fearing you will make one.&rdquo; &mdash; <footer>Elbert Hubbard</footer></blockquote>"  
  }  
]  
```

## **Créditos y agradecimientos**
- Frases motivacionales obtenidas de la API de ZenQuotes. https://zenquotes.io
- Documentación y estructura basada en las guías oficiales de Google para arquitectura en Android.
