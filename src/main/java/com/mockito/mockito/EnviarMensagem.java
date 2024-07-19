package com.mockito.mockito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnviarMensagem {

    private List<Mensagem> menssagens = new ArrayList<>();

    public void adicionarMensagem(Mensagem mensagem) {
        this.menssagens.add(mensagem);
    }

    public List<Mensagem> getMenssagens(){
        return Collections.unmodifiableList(this.menssagens);
    }
}
