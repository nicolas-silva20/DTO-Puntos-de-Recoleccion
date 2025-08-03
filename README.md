# 📦 API REST – Gestión de Puntos de Recolección de Residuos ♻️

API REST desarrollada en Spring Boot para gestionar puntos de recolección de residuos reciclables en una ciudad, cooperativa o institución. Permite crear, consultar, actualizar y eliminar puntos registrados.

---

## 📚 Tecnologías Utilizadas

| Tecnología       | Descripción                            |
|------------------|----------------------------------------|
| Java 17          | Lenguaje principal                     |
| Spring Boot      | Framework para la API                  |
| Spring Web       | Gestión de rutas HTTP (REST)           |
| Spring Data JPA  | Persistencia y acceso a datos          |
| H2 Database      | Base de datos en memoria (desarrollo)  |
| Lombok           | Reducción de boilerplate (getters, etc)|
| Gradle           | Sistema de construcción                |

---

## 🧱 Arquitectura en Capas

- `controller`: define los endpoints de la API.
- `service`: lógica de negocio.
- `repository`: acceso a datos.
- `entity`: mapeo JPA de los modelos.
- `dto`: estructuras optimizadas para entrada/salida.
- `mapper`: conversión entre entidades y DTOs.

---

## 📌 Funcionalidades

- ✅ Crear punto de recolección (`POST /puntos`)
- ✅ Consultar todos los puntos (`GET /puntos`)
- ✅ Consultar un punto por ID (`GET /puntos/{id}`)
- ✅ Actualizar un punto existente (`PUT /puntos/{id}`)
- ✅ Eliminar un punto existente (`DELETE /puntos/{id}`)

---

## 📁 Estructura de Datos

### 📥 PuntoRecoleccionCreateDTO (entrada)
```json
{
  "nombre": "Punto Verde Central",
  "direccion": "Calle Falsa 123",
  "tipoResiduo": "Plástico",
  "horarioDisponible": "Lun a Vie de 8 a 18 hs",
  "activo": true
}
```

### 📤 PuntoRecoleccionResponseDTO (respuesta)
```json
{
  "id": 1,
  "nombre": "Punto Verde Central",
  "tipoResiduo": "Plástico",
  "activo": true
}
```

---

## ▶️ Puesta en Marcha

1. Descargar el proyecto.
2. Importar como proyecto Gradle en IntelliJ o tu IDE favorito.
3. Ejecutar la clase `ResiduosApplication.java`.
4. Acceder a:
   - API: `http://localhost:8080/puntos`
   - H2 Console: `http://localhost:8080/h2-console`  
     - JDBC URL: `jdbc:h2:mem:residuosdb`
     - Usuario: `sa`, sin contraseña.

---

## 🧪 Pruebas con Postman

Puede usar la colección incluida:

📂 `coleccion_postman_residuos_crud.json`

1. Abrir Postman.
2. Hacer clic en “Import”.
3. Cargar el archivo `.json` para importar todos los endpoints listos para probar.

Incluye:
- Crear punto (POST)
- Obtener todos (GET)
- Obtener por ID (GET)
- Actualizar (PUT)
- Eliminar (DELETE)

---
