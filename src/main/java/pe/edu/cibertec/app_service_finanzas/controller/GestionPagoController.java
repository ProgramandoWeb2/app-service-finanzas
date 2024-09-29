package pe.edu.cibertec.app_service_finanzas.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_service_finanzas.remoteservice.ServiceDocenteClient;

@RequiredArgsConstructor
@RestController
public class GestionPagoController {

    private final ServiceDocenteClient serviceDocenteClient;

    @GetMapping("/pago")
    public String obtenerPagos(){
        return "Respuesta del servicio de Finanzas-Pagos";
    }

    @GetMapping("/pago-docente")
    public String obtenerPagosDocentes(){
        return serviceDocenteClient.obtenerDocentes();
    }
}
