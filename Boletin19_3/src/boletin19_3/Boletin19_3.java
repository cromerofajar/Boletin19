package boletin19_3;

/**
 *
 * @author cromerofajar
 */
public class Boletin19_3 {

    public static void main(String[] args) {
        Metodos obx=new Metodos();
        int[] notas=new int[6];
        String[] nomes=new String[6];

        notas=obx.crearArray(notas);
        nomes=obx.crearArray(nomes);
        obx.visualizarGrupos(notas);
        obx.visualizarAprobados(notas,nomes);
//        obx.calMedia(notas);
//        obx.notaAlta(notas,nomes);
//        obx.ordenarNotas(notas, nomes);
        obx.mostrarNota(notas, nomes);
    }
    
}
