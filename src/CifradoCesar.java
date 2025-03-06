public class CifradoCesar {

    public static String cifrar(String texto, int desplazamiento) {
        String alfabeto = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789";
        String cifrado = "";

        for (int i = 0; i < texto.length(); i++) {
            int posicion = alfabeto.indexOf(texto.charAt(i)); // Obtiene la posición de la letra en el alfabeto
            if (posicion != -1) {
                int nuevaPosicion = (posicion + desplazamiento) % alfabeto.length(); // Calcula la nueva posición
                cifrado += alfabeto.charAt(nuevaPosicion); // Obtiene la letra cifrada
            } else {
                cifrado += texto.charAt(i); // Si no es una letra, se añade tal cual
            }
        }
        return cifrado;
    }
}
