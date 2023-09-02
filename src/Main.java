import entities.Compositor;
import entities.Ordena;

public class Main {
    public static void main(String[] args) {

        Compositor[] compositor = new Compositor[6];

        compositor[0] = new Compositor("Mozart", "Eine Kleine Natchmusik");
        compositor[1] = new Compositor("Beethoven", "Für Elise");
        compositor[2] = new Compositor("Bach", "Tocatta and Fügue");
        compositor[3] = new Compositor("Paganini", "La campanella");
        compositor[4] = new Compositor("Vivaldi", "Winter");
        compositor[5] = new Compositor("Vitório Monti", "Csardas");

        Ordena obj = new Ordena();
        obj.ordenaObjetos(compositor);

        for (int i = 0; i < compositor.length; i++){
            System.out.println("\nNome do compositor: " + compositor[i].getNome());
            System.out.println("\nTítulo da canção: " + compositor[i].getMusica());
            System.out.println("____________________________\n");
        }
    }
}