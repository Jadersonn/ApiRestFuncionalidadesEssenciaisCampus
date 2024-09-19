package com.service;
import com.ifms.projeto.models.Aluno;
import com.ifms.projeto.repositories.*;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@Service
public class EstudanteService {

    @Autowired
    private AlunoRepository alunoRepository;
    @Autowired
    private CidadeRepository cidadeRepository;
    @Autowired
    private SexoRepository sexoRepository;
    @Autowired
    private SituacaoRepository situacaoRepository;
    @Autowired
    private CampusRepository campusRepository;

    public void lerCSV(String filePath) {
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> rows = reader.readAll();
            for (String[] row : rows) {
                Aluno aluno = new Aluno();
                aluno.setNome(row[0]);
                aluno.setDtIngresso(Date.valueOf(row[1]));
                aluno.setDtConclusao(Date.valueOf(row[2]));
                aluno.setCidade(cidadeRepository.findById(Integer.parseInt(row[3])).orElse(null));
                aluno.setSexo(sexoRepository.findById(Integer.parseInt(row[4])).orElse(null));
                aluno.setSituacao(situacaoRepository.findById(Integer.parseInt(row[5])).orElse(null));
                aluno.setCampus(campusRepository.findById(Integer.parseInt(row[6])).orElse(null));
                alunoRepository.save(aluno);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
