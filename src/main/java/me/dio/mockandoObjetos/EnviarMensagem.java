package me.dio.mockandoObjetos;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnviarMensagem {

    private List<Mensagem> mensagem = new ArrayList<>();

    public void adicionarMensagem(Mensagem mensagem) {
        this.mensagem.add(mensagem); }

    public List<Mensagem> getMensagem(){
        return Collections.unmodifiableList(this.mensagem); }


}
