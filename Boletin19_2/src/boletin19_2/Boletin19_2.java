package boletin19_2;

/**
 *
 * @author cromerofajar
 */
public class Boletin19_2 {

    public static void main(String[] args) {
        Metodos obx=new Metodos();
        int[] notas=new int[30];

        notas=obx.crearArray(notas);
        obx.visualizarGrupos(notas);
        obx.calMedia(notas);
        obx.notaAlta(notas);
    }
}
