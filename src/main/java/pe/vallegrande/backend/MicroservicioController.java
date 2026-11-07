package pe.vallegrande.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class MicroservicioController {

    // 1. GET de estado y versión del microservicio
    @GetMapping("/status")
    public Mono<Map<String, String>> obtenerEstado() {
        return Mono.just(Map.of(
            "microservicio", "vallegrande-sprint4-backend",
            "estado", "ACTIVO",
            "version", "v1.0.0"
        ));
    }

    // 2. GET de bienvenida para probar rápidamente en el navegador
    @GetMapping("/saludo")
    public Mono<Map<String, String>> obtenerSaludo() {
        return Mono.just(Map.of(
            "mensaje", "Hola desde el Microservicio en Spring Boot desplegado con GitHub Actions y Docker Hub!",
            "institucion", "Valle Grande"
        ));
    }

    // 3. GET reactivo que devuelve una lista de módulos/temas del Sprint 4
    @GetMapping("/temas")
    public Flux<Map<String, String>> listarTemas() {
        return Flux.just(
            Map.of("id", "1", "tema", "GitFlow y Feature Branching"),
            Map.of("id", "2", "tema", "Versionamiento Semantico (SemVer)"),
            Map.of("id", "3", "tema", "CI/CD con GitHub Actions y Docker Hub"),
            Map.of("id", "4", "tema", "Despliegue en Kubernetes y GitOps")
        );
    }
}

