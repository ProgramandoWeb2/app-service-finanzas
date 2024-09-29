package pe.edu.cibertec.app_service_finanzas.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app-service-academico")
public interface ServiceDocenteClient {

    @GetMapping("/docente")
    String obtenerDocentes();
}
