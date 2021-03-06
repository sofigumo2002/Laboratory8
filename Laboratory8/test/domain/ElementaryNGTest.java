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
        String[] words = {"menos", "mundo", "a??o", "antes", "estado", "contra", "sino", "forma", "caso", "nada", "hacer", "general", "estaba", "poco", "estos", "presidente", "mayor", "ante", "unos", "les", "algo", "hacia", "casa", "ellos", "ayer", "hecho", "primera", "mucho", "mientras", "adem??s", "quien", "momento", "millones", "esto", "espa??a", "hombre", "est??n", "pues", "hoy", "lugar", "madrid", "nacional", "trabajo", "otras", "mejor", "nuevo", "decir", "algunos", "entonces", "todas", "d??as", "debe", "pol??tica", "c??mo", "casi", "toda", "tal", "luego", "pasado", "primer", "medio", "va", "estas", "sea", "ten??a", "nunca", "poder", "aqu??", "ver", "veces", "embargo", "partido", "personas", "grupo", "cuenta", "pueden", "tienen", "misma", "nueva", "cual", "fueron", "mujer", "frente", "jos??", "tras", "cosas", "fin", "ciudad", "he", "social", "manera", "tener", "sistema", "ser??", "historia", "muchos", "juan", "tipo", "cuatro", "dentro", "nuestro", "punto", "dice", "ello", "cualquier", "noche", "a??n", "agua", "parece", "haber", "situaci??n", "fuera", "bajo", "grandes", "nuestra", "ejemplo", "acuerdo", "hab??an", "usted", "estados", "hizo", "nadie", "pa??ses", "horas", "posible", "tarde", "ley", "importante", "guerra", "desarrollo", "proceso", "realidad", "sentido", "lado", "mi", "tu", "cambio", "all??", "mano", "eran", "estar", "san", "n??mero", "sociedad", "unas", "centro", "padre", "gente", "final", "relaci??n", "cuerpo", "obra", "incluso", "trav??s", "??ltimo", "madre", "mis", "modo", "problemas", "cinco", "carlos", "hombres", "informaci??n", "ojos", "muerte", "nombre", "algunas", "p??blico", "mujeres", "siglo", "todav??a", "meses", "ma??ana", "esos", "nosotros", "hora", "muchas", "pueblo", "alguna", "dar", "problema", "don", "da", "t??", "derecho", "verdad", "mar??a", "unidos", "podr??a", "ser??a", "junto", "cabeza", "aquel", "luis", "cuanto", "tierra", "equipo", "segundo", "director", "dicho", "cierto", "casos", "manos", "nivel", "pod??a", "familia", "largo", "partir", "falta", "llegar", "propio", "ministro", "cosa", "primero", "seguridad", "hemos", "mal", "trata", "alg??n", "tuvo", "respecto", "semana", "varios", "real", "s??", "voz", "paso", "se??or", "mil", "quienes", "proyecto", "mercado", "mayor??a", "luz", "claro", "iba", "??ste", "pesetas", "orden", "espa??ol", "buena", "quiere", "aquella", "programa", "palabras", "internacional", "van", "esas", "segunda", "empresa", "puesto", "ah??", "propia", "misa", "libro", "igual", "pol??tico", "persona", "??ltimos", "ellas", "total", "creo", "tengo", "dios", "carro", "espa??ola", "condiciones", "m??xico", "fuerza", "solo", "??nico", "acci??n", "amor", "polic??a", "puerta", "pesar", "zona", "sabe", "calle", "interior", "tampoco", "m??sica", "ning??n", "vista", "campo", "buen", "hubiera", "saber", "obras", "raz??n", "ex", "ni??os", "presencia", "tema", "dinero", "comisi??n", "antonio", "servicio", "hijo", "??ltima", "ciento", "estoy", "hablar", "dio", "minutos", "producci??n", "camino", "seis", "qui??n", "fondo", "direcci??n", "papel", "dem??s", "barcelona", "idea", "especial", "diferentes", "dado", "base", "capital", "ambos", "europa", "libertad", "relaciones", "espacio", "medios", "ir", "actual", "poblaci??n", "empresas", "estudio", "salud", "servicios", "haya", "principio", "siendo", "cultura", "anterior", "alto", "media", "mediante", "primeros", "arte", "paz", "sector", "imagen", "medida", "deben", "datos", "consejo", "personal", "inter??s", "julio", "grupos", "miembros", "ninguna", "existe", "cara", "edad", "etc", "movimiento", "visto", "lleg??", "puntos", "actividad", "bueno", "uso", "ni??o", "dif??cil", "joven", "futuro", "aquellos", "mes", "pronto", "soy", "hac??a", "nuevos", "nuestros", "estaban", "posibilidad", "sigue", "cerca", "resultados", "educaci??n", "atenci??n", "gonz??lez", "capacidad", "efecto", "necesario", "valor", "aire", "investigaci??n", "siguiente", "figura", "central", "comunidad", "necesidad", "serie", "organizaci??n", "nuevas", "calidad"};
        return words;
    }

    @Test
    public void test() {

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
        System.out.println("Numeros enteros Array 1: " + show(array1, 200));
        System.out.println("Characteres Array 2: " + show(array2, 200));
        System.out.println("Numeros Negativos Array 3: " + show(array3, 200));
        System.out.println("Numeros Pares Array 4: " + show(array4, 200));
        System.out.println("Numeros ImPares Array 5: " + show(array5, 200));
        System.out.println("Palabras Array 6: " + show(array6, 200));

        //Instancia de Elementary, si los arreglos no estan ordenados, los debe ordenar
        Elementary sort = new Elementary();

        System.out.println("\n--------------------------SORTED ARRAYS------------------------------");
        if (!isSorted(array1)) {
            sort.bubbleSort(array1);
            System.out.println("N??meros enteros Array 1 Sorted: " + show(array1, 200));
        }
        if (!isSorted(array2)) {
            sort.improvedBubbleSort(array2);
            System.out.println("Caracteres Array 2 Sorted: " + show(array2, 200));
        }
        if (!isSorted(array3)) {
            sort.selectionSort(array3);
            System.out.println("N??meros Negativos Array 3 Sorted: " + show(array3, 200));
        }
        if (!isSorted(array4)) {
            sort.bubbleSort(array4);
            System.out.println("N??meros Pares Array 4 Sorted: " + show(array4, 200));
        }
        //Si los arrays 5 y 6 no est??n ordenados, proceda a ordenarlos utilizando cualquier algoritmo elemental de ordenamiento. 
        if (!isSorted(array5)) {
            sort.bubbleSort(array5);
            System.out.println("N??meros Impares Array 5 Sorted: " + show(array5, 200));
        }
        if (!isSorted(array6)) {
            sort.improvedBubbleSort(array6);
            System.out.println("Palabras Array 6 Sorted: " + show(array6, 200));
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

//    private boolean isSorted(Object[] a){
//        for (int i = 0; i < a.length; i++) {
//            if(util.Utility.greaterT(a[i], a[i + 1])){
//                return false;
//            }
//        }
//        return true;
//    }
    
    private boolean isSorted(Object[] a) {
        boolean sorted;
        for (int i = 0; i < a.length-1; i++) {
          if(util.Utility.greaterT(a[i],a[i+1])) 
              return false;
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
}
