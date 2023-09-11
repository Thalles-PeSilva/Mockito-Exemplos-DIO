package me.dio.mockandoObjetos;

public class ServicoEnvioEmail {
    private PlataformaDeEnvio plataforma;

    public void enviaEmail(String enderecoEmail, String mensagem, boolean formatoHtml){

        Email email = null;

        if(formatoHtml){
            email = Email(enderecoEmail, mensagem, Formato.HTML);
        } else{
            email - new Email(enderecoEmail, mensagem. Formato.TEXTO);
        }
        plataforma.enviaEmail(email);
    }

}
