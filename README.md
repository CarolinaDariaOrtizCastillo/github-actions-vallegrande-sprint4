# 🚀 Microservicio Spring Boot con GitHub Actions y Docker Hub (Sprint 4)

Este repositorio contiene el microservicio Java para la demostración en vivo de integración y entrega continua hacia **Docker Hub** utilizando **GitHub Actions**.

---

## 📌 ¿Qué incluye este Microservicio?

Cuenta con tres rutas de consulta (**GET**) listas para probarse en el navegador o en herramientas de pruebas:

1. **Estado del Servicio (`/api/status`)**: Devuelve el nombre del microservicio, su estado activo y la versión actual en ejecución.
2. **Mensaje de Bienvenida (`/api/saludo`)**: Devuelve un mensaje informativo de confirmación del despliegue de Valle Grande.
3. **Listado de Temas (`/api/temas`)**: Devuelve de forma reactiva los cuatro pilares de esta sesión (Flujo de Ramas, Versionamiento Semántico, Automatización con GitHub Actions y Kubernetes).

---

## ⚙️ ¿Cómo Funciona la Automatización hacia Docker Hub?

Cada vez que se suben cambios a la rama principal o se publica una etiqueta de versión, **GitHub Actions** realiza automáticamente cinco pasos en la nube:

1. **Descarga el Código Fuente**: Toma la versión exacta que acabas de subir a GitHub.
2. **Prepara el Entorno Java**: Instala la versión veintuno de Java necesaria para compilar el proyecto.
3. **Empaqueta la Aplicación**: Convierte el código fuente en un archivo ejecutable listo para producción.
4. **Conecta con Docker Hub**: Inicia sesión de forma segura en la cuenta `jeansimon16` utilizando el token guardado en los secretos del repositorio.
5. **Construye y Publica la Imagen**:
   - Si subiste un cambio directo a la rama principal, publica la imagen con la etiqueta general de última versión.
   - Si subiste una etiqueta de versión semántica (por ejemplo, versión uno-punto-cero-punto-cero), publica la imagen en Docker Hub llevando exactamente ese número de versión.
