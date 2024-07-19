package com.mockito.mockito;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;
    private com.mockito.mockito.DadosLocalizacao DadosLocalizacao;

    @Test
    void validarDadosDeCadastro (){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("RJ", "Valença", "Rua B", "Garibaldi", "Osorio");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenReturn(dadosLocalizacao );
        Pessoa pessoa = cadastrarPessoa.cadastrarPEssoa("Nicolas", "54565664464", LocalDate.now(),"27600000");

       assertEquals("Nicolas", pessoa.getNome());
       assertEquals("54565664464", pessoa.getDocument());
       assertEquals("RJ", pessoa.getEndereco().getOf());
       assertEquals("Garibaldi", pessoa.getEndereco().getComplemento());

    }

    @Test
    void lancarExceptionQuandoChamarApiDosCorreios (){

        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenThrow(IllegalAccessException.class);

        Pessoa jose = cadastrarPessoa.cadastrarPEssoa("jose", "1515126262", LocalDate.of(1947, 1,1),"27600000");


        Throwable throwable = Assertions.assertThrows(IllegalAccessException.class.; () -> cadastrarPessoa.cadastrarPEssoa("jose","1515126262",1974, "27600000" );
    }
}
