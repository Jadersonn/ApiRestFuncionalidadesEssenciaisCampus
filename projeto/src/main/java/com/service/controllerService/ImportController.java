package com.service.controllerService;

import com.service.EstudanteService;
import com.service.ServidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ImportController {

    @Autowired
    private EstudanteService estudanteService;
    @Autowired
    private ServidorService servidorService;

    @GetMapping("/import/estudantes")
    public String importarEstudantes(@RequestParam String filePath) {
        estudanteService.lerCSV(filePath);
        return "Importação de estudantes concluída!";
    }

    @GetMapping("/import/servidores")
    public String importarServidores(@RequestParam String filePath) {
        servidorService.lerExcel(filePath);
        return "Importação de servidores concluída!";
    }
}
