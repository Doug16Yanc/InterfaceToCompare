package entities;

import repositories.Compare;

public class Ordena {
    public void ordenaObjetos(Compare[] objetos) {
        for (int i = 0; i < objetos.length; i++) {
            for (int j = i + 1; j < objetos.length; j++) {
                if (objetos[i].comparar(objetos[j]) > 0) {
                    Compare auxiliar = objetos[i];
                    objetos[i] = objetos[j];
                    objetos[j] = auxiliar;

                }
            }
        }
    }
}