package mockandoObjetos;

import me.dio.mockandoObjetos.Email;
import me.dio.mockandoObjetos.PlataformaDeEnvio;
import me.dio.mockandoObjetos.ServicoEnvioEmail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTeste {

    @Mock
    private PlataformaDeEnvio plataforma;

    @InjectMocks
    private ServicoEnvioEmail servico;

    @Captor
    ArgumentCaptor<Email> captor;


    @Test
    void validarDadosEnviadosParaAPlataforma(){

        String enderecoDeEmail = "usuario@test.com.br";
        String mensagem = "Olá Mundo teste mensagem";
        boolean ehFormatoHtml = true;

        servico.enviaEmail(enderecoDeEmail, mensagem, ehFormatoHtml);

        Mockito.verify(plataforma).enviaEmail(captor.capture());

        Email emailCapturado = captor.getValue();

        Assertions.assertEquals(enderecoDeEmail, emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(mensagem, emailCapturado.getMensagem());


        Assertions.assertEquals(Formato.TEXTO, emailCapturado.getFormato());

    }



}
