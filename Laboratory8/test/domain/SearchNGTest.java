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
