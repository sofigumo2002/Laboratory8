/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author wandagranados
 */
public class ElementaryNGTest {

    public ElementaryNGTest() {
    }

    //Numeros enteros
    public void fillArray1(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = util.Utility.random();
        }
    }

    //Letras
    public void fillArray2(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = util.Utility.randomCharacter();
        }
    }

    //Numeros negativos
    public void fillArray3(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (1 + (int) Math.floor(Math.random() * 99)) - 100;
        }
    }

    //Numeros pares
    public void fillArray4(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            int random = util.Utility.random();
            if (random % 2 == 0) {
                array[i] = random;
            } else {
                int random2 = util.Utility.random();
                do {
                    random2 = util.Utility.random();
                } while (random2 % 2 != 0);
                array[i] = random2;
            }
        }
    }

    //Numeros impares
    public void fillArray5(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            int random = util.Utility.random();
            if (random % 2 != 0) {
                array[i] = random;
            } else {
                int random2 = util.Utility.random();
                do {
                    random2 = util.Utility.random();
                } while (random2 % 2 == 0);
                array[i] = random2;
            }
        }
    }

    //Palabras
    public void fillArray6(Object[] array) {
        String[] words = wordArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = words[util.Utility.random(words.length - 1)];
        }
    }

    //Mil palabras random
    private String[] wordArray() {
        String[] words = {"menos", "mundo", "año", "antes", "estado", "contra", "sino", "forma", "caso", "nada", "hacer", "general", "estaba", "poco", "estos", "presidente", "mayor", "ante", "unos", "les", "algo", "hacia", "casa", "ellos", "ayer", "hecho", "primera", "mucho", "mientras", "además", "quien", "momento", "millones", "esto", "españa", "hombre", "están", "pues", "hoy", "lugar", "madrid", "nacional", "trabajo", "otras", "mejor", "nuevo", "decir", "algunos", "entonces", "todas", "días", "debe", "política", "cómo", "casi", "toda", "tal", "luego", "pasado", "primer", "medio", "va", "estas", "sea", "tenía", "nunca", "poder", "aquí", "ver", "veces", "embargo", "partido", "personas", "grupo", "cuenta", "pueden", "tienen", "misma", "nueva", "cual", "fueron", "mujer", "frente", "josé", "tras", "cosas", "fin", "ciudad", "he", "social", "manera", "tener", "sistema", "será", "historia", "muchos", "juan", "tipo", "cuatro", "dentro", "nuestro", "punto", "dice", "ello", "cualquier", "noche", "aún", "agua", "parece", "haber", "situación", "fuera", "bajo", "grandes", "nuestra", "ejemplo", "acuerdo", "habían", "usted", "estados", "hizo", "nadie", "países", "horas", "posible", "tarde", "ley", "importante", "guerra", "desarrollo", "proceso", "realidad", "sentido", "lado", "mi", "tu", "cambio", "allí", "mano", "eran", "estar", "san", "número", "sociedad", "unas", "centro", "padre", "gente", "final", "relación", "cuerpo", "obra", "incluso", "través", "último", "madre", "mis", "modo", "problemas", "cinco", "carlos", "hombres", "información", "ojos", "muerte", "nombre", "algunas", "público", "mujeres", "siglo", "todavía", "meses", "mañana", "esos", "nosotros", "hora", "muchas", "pueblo", "alguna", "dar", "problema", "don", "da", "tú", "derecho", "verdad", "maría", "unidos", "podría", "sería", "junto", "cabeza", "aquel", "luis", "cuanto", "tierra", "equipo", "segundo", "director", "dicho", "cierto", "casos", "manos", "nivel", "podía", "familia", "largo", "partir", "falta", "llegar", "propio", "ministro", "cosa", "primero", "seguridad", "hemos", "mal", "trata", "algún", "tuvo", "respecto", "semana", "varios", "real", "sé", "voz", "paso", "señor", "mil", "quienes", "proyecto", "mercado", "mayoría", "luz", "claro", "iba", "éste", "pesetas", "orden", "español", "buena", "quiere", "aquella", "programa", "palabras", "internacional", "van", "esas", "segunda", "empresa", "puesto", "ahí", "propia", "misa", "libro", "igual", "político", "persona", "últimos", "ellas", "total", "creo", "tengo", "dios", "carro", "española", "condiciones", "méxico", "fuerza", "solo", "único", "acción", "amor", "policía", "puerta", "pesar", "zona", "sabe", "calle", "interior", "tampoco", "música", "ningún", "vista", "campo", "buen", "hubiera", "saber", "obras", "razón", "ex", "niños", "presencia", "tema", "dinero", "comisión", "antonio", "servicio", "hijo", "última", "ciento", "estoy", "hablar", "dio", "minutos", "producción", "camino", "seis", "quién", "fondo", "dirección", "papel", "demás", "barcelona", "idea", "especial", "diferentes", "dado", "base", "capital", "ambos", "europa", "libertad", "relaciones", "espacio", "medios", "ir", "actual", "población", "empresas", "estudio", "salud", "servicios", "haya", "principio", "siendo", "cultura", "anterior", "alto", "media", "mediante", "primeros", "arte", "paz", "sector", "imagen", "medida", "deben", "datos", "consejo", "personal", "interés", "julio", "grupos", "miembros", "ninguna", "existe", "cara", "edad", "etc", "movimiento", "visto", "llegó", "puntos", "actividad", "bueno", "uso", "niño", "difícil", "joven", "futuro", "aquellos", "mes", "pronto", "soy", "hacía", "nuevos", "nuestros", "estaban", "posibilidad", "sigue", "cerca", "resultados", "educación", "atención", "gonzález", "capacidad", "efecto", "necesario", "valor", "aire", "investigación", "siguiente", "figura", "central", "comunidad", "necesidad", "serie", "organización", "nuevas", "calidad"};
        return words;
    }

    @Test
    public void testSomeMethod() {

        Object array1[] = new Object[1000];//Numeros enteros
        fillArray1(array1);

        Object array2[] = new Object[1000];//Letras
        fillArray2(array2);

        Object array3[] = new Object[1000];//Numeros negativos
        fillArray3(array3);

        Object array4[] = new Object[1000];//Numeros pares
        fillArray4(array4);

        Object array5[] = new Object[1000];//Numeros impares
        fillArray5(array5);

        Object array6[] = new Object[1000];//Palabras
        fillArray6(array6);

        //Mostramos por consola de los primeros 200 elementos
        System.out.println("\n--------------------------UNSORTED ARRAYS------------------------------");
        System.out.println("Numeros enteros Array1: " + show(array1, 200));
        System.out.println("Characteres Array2: " + show(array2, 200));
        System.out.println("Numeros Negativos Array3: " + show(array3, 200));
        System.out.println("Numeros Pares Array4: " + show(array4, 200));
        System.out.println("Numeros ImPares Array5: " + show(array5, 200));
        System.out.println("Palabras Array6: " + show(array6, 200));

        //Instancia de Elementary, si los arreglos no estan ordenados, los debe ordenar
        Elementary sort = new Elementary();

        System.out.println("\n--------------------------SORTED ARRAYS------------------------------");
        if (!isSorted(array1)) {
            sort.bubbleSort(array1);
            System.out.println("Numeros enteros Array1 Sorted: " + show(array1, 200));
        }
        if (!isSorted(array2)) {
            sort.improvedBubbleSort(array2);
            System.out.println("Characteres Array2 Sorted: " + show(array2, 200));
        }
        if (!isSorted(array3)) {
            sort.selectionSort(array3);
            System.out.println("Numeros Negativos Array3 Sorted: " + show(array3, 200));
        }
        if (!isSorted(array4)) {
            sort.bubbleSort(array4);
            System.out.println("Numeros Pares Array4 Sorted: " + show(array4, 200));
        }
        //Si los arrays 5 y 6 no están ordenados, proceda a ordenarlos utilizando cualquier algoritmo elemental de ordenamiento. 
        if (!isSorted(array5)) {
            sort.bubbleSort(array5);
            System.out.println("Numeros ImPares Array5 Sorted: " + show(array5, 200));
        }
        if (!isSorted(array6)) {
            sort.improvedBubbleSort(array6);
            System.out.println("Palabaras Array 6 Sorted: " + show(array6, 200));
        }

    }//end test

    private String show(Object[] array, int size) {
        String result = "";
        for (int i = 0; i <= size; i++) {
            if (i < size) {
                result += array[i] + ",";
            } else {
                result += array[i];
            }

        }
        return result;
    }

    private boolean isSorted(Object[] a){
        for (int i = 0; i < a.length; i++) {
            if(util.Utility.greaterT(a[i], a[i + 1])){
                return false;
            }
        }
        return true;
    }

    private void searchIterative(Object[] array, Object value) {
        Search search = new Search();
        if (search.binarySearch(array, value) != -1) {//Si lo encontro
            System.out.println("El elemento[" + value + "] existe en la posicion: " + search.binarySearch(array, value));
        } else {
            System.out.println("El elemento[" + value + "] no existe en el arreglo");
        }
    }

    private void searchBinary(Object[] array, Object value) {
        Search search = new Search();
        if (search.binarySearch(array, value, 0, array.length - 1) != -1) {//Si lo encontro
            System.out.println("El elemento[" + value + "] existe en la posicion: " + search.binarySearch(array, value, 0, array.length - 1));
        } else {
            System.out.println("El elemento[" + value + "] no existe en el arreglo");
        }
    }
}//end class
