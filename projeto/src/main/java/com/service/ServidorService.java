package com.service;
import com.ifms.projeto.models.Servidor;
import com.ifms.projeto.repositories.ServidorRepository;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

@Service
public class ServidorService {

    @Autowired
    private ServidorRepository servidorRepository;

    public void lerExcel(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                if (row.getRowNum() == 0) {
                    continue; // skip header
                }
                Servidor servidor = new Servidor();
                servidor.setNome_servidor(row.getCell(0).getStringCellValue());
                // Continue setando outros campos do Servidor conforme o layout do arquivo
                servidorRepository.save(servidor);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
