/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package domain;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author wandagranados
 */
public class SearchNGTest {

    public SearchNGTest() {
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

        //Probamos busquedas binarias en los arreglos ordenados
        System.out.println("\n--------------------------BUSQUEDA EN LOS ARRAYS------------------------------");
        //Uso de IterativeSearch en Array1 Numeros Enteros
        System.out.println(" ");
        System.out.println("IterativeSearch Array1");
        for (int i = 0; i < 20; i++) {
            searchIterative(array1, util.Utility.random());
        }
        //Uso de BinarySearch en Array1
        System.out.println("BinarySearch Array1");
        for (int i = 0; i < 20; i++) {
            searchBinary(array1, util.Utility.random());
        }

        //Uso de IterativeSearch en Array2 //Caracteres
        System.out.println(" ");
        System.out.println("IterativeSearch Array2");
        for (int i = 0; i < 20; i++) {
            searchIterative(array2, util.Utility.randomCharacter());
        }
        //Uso de BinarySearch en Array2
        System.out.println("BinarySearch Array2");
        for (int i = 0; i < 20; i++) {
            searchBinary(array2, util.Utility.randomCharacter());
        }

        //Uso de IterativeSearch en Array3 Numeros Negativos
        System.out.println(" ");
        System.out.println("IterativeSearch Array3");
        for (int i = 0; i < 20; i++) {
            searchIterative(array3, 1 + (int) Math.floor(Math.random() * 99) - 100);
        }
        //Uso de BinarySearch en Array3
        System.out.println("BinarySearch Array3");
        for (int i = 0; i < 20; i++) {
            searchBinary(array3, 1 + (int) Math.floor(Math.random() * 99) - 100);
        }

        //Uso de IterativeSearch en Array4 Numeros Pares
        System.out.println(" ");
        System.out.println("IterativeSearch Array4");
        for (int i = 0; i < 20; i++) {
            searchIterative(array4, util.Utility.random());
        }
        //Uso de BinarySearch en Array4
        System.out.println("BinarySearch Array4");
        for (int i = 0; i < 20; i++) {
            searchBinary(array4, util.Utility.random());
        }

        //Uso de IterativeSearch en Array5 Numeros Impares
        System.out.println(" ");
        System.out.println("IterativeSearch Array5");
        for (int i = 0; i < 20; i++) {
            searchIterative(array4, util.Utility.random());
        }
        System.out.println(" ");
        //Uso de BinarySearch en Array5
        System.out.println("BinarySearch Array5");
        for (int i = 0; i < 20; i++) {
            searchBinary(array4, util.Utility.random());
        }

        //Uso de IterativeSearch en Array6 Letras
        System.out.println(" ");
        System.out.println("IterativeSearch Array6");
        String[] words = wordArray();
        for (int i = 0; i < 20; i++) {
            searchIterative(array6, words[util.Utility.random(words.length)]);
        }
        System.out.println(" ");
        //Uso de BinarySearch en Array6
        System.out.println("BinarySearch Array6");
        for (int i = 0; i < 20; i++) {
            searchBinary(array6, words[util.Utility.random(words.length)]);
        }

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
