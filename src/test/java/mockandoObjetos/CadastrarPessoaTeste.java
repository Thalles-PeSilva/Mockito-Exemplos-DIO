package mockandoObjetos;

import me.dio.mockandoObjetos.ApiDosCorreios;
import me.dio.mockandoObjetos.CadastrarPessoa;
import me.dio.mockandoObjetos.DadosLocalizacao;
import me.dio.mockandoObjetos.Pessoa;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("DF", "Brasilia", "Rua 400 Lote 402", "Apto", "Santa Maria");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("09390775")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa("Thalles", "7272727", LocalDate.now(), "09390775");

        assertEquals("Thalles", pessoa.getNome());
        assertEquals("7272727", pessoa.getDocumento());
        assertEquals("DF", pessoa.getEndereco().getClass());
        assertEquals("Apto", pessoa.getEndereco());
    }

    private Pessoa cadastrarPessoa(String thalles, String number, LocalDate now, String number1) {
        return null;
    }


}
