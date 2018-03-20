
package ejemplocomposicion;

import domain.Deportivo;
import domain.Organo;
import domain.Sistema;
import domain.Trabajo;
import domain.Zapato;
import java.util.ArrayList;

public class EjemploComposicion {
//espacio en memoria es un objeto
    
    public static void main(String[] args) {
//       
//        Sistema digestivo = new Sistema();
//        Organo estomago = new Organo("estomago", "Digerir alimentos");
//        Organo boca = new Organo("boca", "Cortar y masticar");
//        
//        
//        ArrayList<Organo> organos = new ArrayList<Organo>();
//        digestivo.setOrganos(organos);
//        organos.add(boca);
//        organos.add(estomago);
//        
//        
//    digestivo.setOrganos(organos);
//    digestivo.setNombre("Digestivo");
//    digestivo.imprimir();
//    
    Zapato nike = new Deportivo("Futbol",38);
    
    System.out.println(nike.toString());
    
    }
    
}
