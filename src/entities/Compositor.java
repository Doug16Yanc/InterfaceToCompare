package entities;

import repositories.Compare;

public class Compositor implements Compare {
    private String nome;
    private String musica;

    public Compositor(){

    }
    public Compositor(String nome, String musica){
        this.nome = nome;
        this.musica = musica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }


    public int comparar(Object obj) {
        int comparation = 0;

        if (obj instanceof Compositor){
            Compositor compositor = (Compositor) obj;
            comparation = this.getNome().compareTo(compositor.getNome());

            if (comparation == 0){
                comparation = this.getMusica().compareTo(compositor.getMusica());
            }
        }
        return comparation;
    }
}
