/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import static util.Utility.show;

/**
 *
 * @author sofia
 */
public class ComplexNGTest {

    public ComplexNGTest() {
    }

     //Numeros enteros
    public void fillArray1(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = util.Utility.random();
        }
    }

     //Palabras
    public void fillArray2(Object[] array) {
        String[] words = wordArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = words[util.Utility.random(words.length - 1)];
        }
    }

    //Numeros enteros
    public void fillArray3(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = util.Utility.random();
        }
    }

     //Palabras
    public void fillArray4(Object[] array) {
        String[] words = wordArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = words[util.Utility.random(words.length - 1)];
        }
    }

    //Numeros enteros
    public void fillArray5(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = util.Utility.random();
        }
    }

    //Palabras
    public void fillArray6(Object[] array) {
        String[] words = wordArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = words[util.Utility.random(words.length - 1)];
        }
    }

    private String[] wordArray() {
        String[] words = {"menos", "mundo", "año", "antes", "estado", "contra", "sino", "forma", "caso", "nada", "hacer", "general", "estaba", "poco", "estos", "presidente", "mayor", "ante", "unos", "les", "algo", "hacia", "casa", "ellos", "ayer", "hecho", "primera", "mucho", "mientras", "además", "quien", "momento", "millones", "esto", "españa", "hombre", "están", "pues", "hoy", "lugar", "madrid", "nacional", "trabajo", "otras", "mejor", "nuevo", "decir", "algunos", "entonces", "todas", "días", "debe", "política", "cómo", "casi", "toda", "tal", "luego", "pasado", "primer", "medio", "va", "estas", "sea", "tenía", "nunca", "poder", "aquí", "ver", "veces", "embargo", "partido", "personas", "grupo", "cuenta", "pueden", "tienen", "misma", "nueva", "cual", "fueron", "mujer", "frente", "josé", "tras", "cosas", "fin", "ciudad", "he", "social", "manera", "tener", "sistema", "será", "historia", "muchos", "juan", "tipo", "cuatro", "dentro", "nuestro", "punto", "dice", "ello", "cualquier", "noche", "aún", "agua", "parece", "haber", "situación", "fuera", "bajo", "grandes", "nuestra", "ejemplo", "acuerdo", "habían", "usted", "estados", "hizo", "nadie", "países", "horas", "posible", "tarde", "ley", "importante", "guerra", "desarrollo", "proceso", "realidad", "sentido", "lado", "mi", "tu", "cambio", "allí", "mano", "eran", "estar", "san", "número", "sociedad", "unas", "centro", "padre", "gente", "final", "relación", "cuerpo", "obra", "incluso", "través", "último", "madre", "mis", "modo", "problemas", "cinco", "carlos", "hombres", "información", "ojos", "muerte", "nombre", "algunas", "público", "mujeres", "siglo", "todavía", "meses", "mañana", "esos", "nosotros", "hora", "muchas", "pueblo", "alguna", "dar", "problema", "don", "da", "tú", "derecho", "verdad", "maría", "unidos", "podría", "sería", "junto", "cabeza", "aquel", "luis", "cuanto", "tierra", "equipo", "segundo", "director", "dicho", "cierto", "casos", "manos", "nivel", "podía", "familia", "largo", "partir", "falta", "llegar", "propio", "ministro", "cosa", "primero", "seguridad", "hemos", "mal", "trata", "algún", "tuvo", "respecto", "semana", "varios", "real", "sé", "voz", "paso", "señor", "mil", "quienes", "proyecto", "mercado", "mayoría", "luz", "claro", "iba", "éste", "pesetas", "orden", "español", "buena", "quiere", "aquella", "programa", "palabras", "internacional", "van", "esas", "segunda", "empresa", "puesto", "ahí", "propia", "misa", "libro", "igual", "político", "persona", "últimos", "ellas", "total", "creo", "tengo", "dios", "carro", "española", "condiciones", "méxico", "fuerza", "solo", "único", "acción", "amor", "policía", "puerta", "pesar", "zona", "sabe", "calle", "interior", "tampoco", "música", "ningún", "vista", "campo", "buen", "hubiera", "saber", "obras", "razón", "ex", "niños", "presencia", "tema", "dinero", "comisión", "antonio", "servicio", "hijo", "última", "ciento", "estoy", "hablar", "dio", "minutos", "producción", "camino", "seis", "quién", "fondo", "dirección", "papel", "demás", "barcelona", "idea", "especial", "diferentes", "dado", "base", "capital", "ambos", "europa", "libertad", "relaciones", "espacio", "medios", "ir", "actual", "población", "empresas", "estudio", "salud", "servicios", "haya", "principio", "siendo", "cultura", "anterior", "alto", "media", "mediante", "primeros", "arte", "paz", "sector", "imagen", "medida", "deben", "datos", "consejo", "personal", "interés", "julio", "grupos", "miembros", "ninguna", "existe", "cara", "edad", "etc", "movimiento", "visto", "llegó", "puntos", "actividad", "bueno", "uso", "niño", "difícil", "joven", "futuro", "aquellos", "mes", "pronto", "soy", "hacía", "nuevos", "nuestros", "estaban", "posibilidad", "sigue", "cerca", "resultados", "educación", "atención", "gonzález", "capacidad", "efecto", "necesario", "valor", "aire", "investigación", "siguiente", "figura", "central", "comunidad", "necesidad", "serie", "organización", "nuevas", "calidad"};
        return words;
    }
    
    @Test
    public void testSomeMethod() {
        
         Object array1[] = new Object[1000];//Numeros enteros
        fillArray1(array1);

        Object array2[] = new Object[1000];//Palabras
        fillArray2(array2);

        Object array3[] = new Object[1000];//Numeros enteros
        fillArray3(array3);

        Object array4[] = new Object[1000];//Palabras
        fillArray4(array4);

        Object array5[] = new Object[1000];//Numeros enteros
        fillArray5(array5);

        Object array6[] = new Object[1000];//Palabras
        fillArray6(array6);
        
        //Mostramos por consola de los primeros 200 elementos
        System.out.println("\n--------------------------UNSORTED ARRAYS------------------------------");
        System.out.println("\nNumeros enteros Array1: " + show(array1, 200));
        System.out.println("\nPalabras Array2: " + show(array2, 200));
        System.out.println("\nNumeros enteros Array3: " + show(array3, 200));
        System.out.println("\nPalabras Array4: " + show(array4, 200));
        System.out.println("\nNumeros enteros Array5: " + show(array5, 200));
        System.out.println("\nPalabras Array6: " + show(array6, 200));
        
        Complex sort = new Complex();
        
        System.out.println("\n--------------------------SORTED ARRAYS------------------------------");
        if (!isSorted(array1)) {
            sort.quickSort(array1, 0, array1.length - 1);
            System.out.println("Numeros enteros Array1 Sorted: " + show(array1, 100));
        }
        if (!isSorted(array2)) {
            sort.shellSort(array2);
            System.out.println("Characteres Array2 Sorted: " + show(array2, 100));
        }
        if (!isSorted(array3)) {
             String tmp[] = new String[200];
            sort.mergeSort(array3, tmp, 0, array3.length - 1);
            System.out.println("Numeros Negativos Array3 Sorted: " + show(array3, 100));
        }
        if (!isSorted(array4)) {
            sort.shellSort(array4);
            System.out.println("Numeros Pares Array4 Sorted: " + show(array4, 100));
        }
        if (!isSorted(array5)) {
            sort.quickSort(array5, 0, array5.length - 1);
            System.out.println("Numeros ImPares Array5 Sorted: " + show(array5, 100));
        }
        if (!isSorted(array6)) {
            String tmp[] = new String[200];
            sort.mergeSort(array6, array6, 0, array6.length - 1);
            System.out.println("Palabaras Array 6 Sorted: " + show(array6, 100));
        }
        
    }

//    private void fill(String[] array2) {
//        array2[0] = "Rojo";
//        array2[1] = "Mar";
//        array2[2] = "Tierra";
//        array2[3] = "Luna";
//        array2[4] = "Perro";
//        array2[5] = "Gato";
//        array2[6] = "Futboll";
//        array2[7] = "Bascketboll";
//        array2[8] = "Hola";
//        array2[9] = "Mundo";
//    }

     private boolean isSorted(Object[] a){
        for (int i = 0; i < a.length; i++) {
            if(util.Utility.greaterT(a[i], a[i + 1])){
                return false;
            }
        }
        return true;
    }
}//end class