
package proyectoa;
import java.io.*; 

public class solicitante {
    String nom; /*variable nombre*/
    String ape; /*variable apellido*/
    int telef; /*variable telefono fijo*/
    int cel; /*variable para telefono celular*/
    String ced; /*variable para cedula*/
    
    void registrar() throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Nombre: ");
        this.nom = br.readLine();
        System.out.print("Apellido: ");
        this.ape = br.readLine();
        System.out.print("Cedula: ");
        this.ced = br.readLine();
        System.out.print("Telefono fijo: ");
        this.telef = Integer.parseInt(br.readLine());
        System.out.print("Telefono celular: ");
        this.cel = Integer.parseInt(br.readLine());
        
    }
    @Override
    public String toString() {
        return "Nombre: "+nom+" Apellido: "+ape
                + "Cedula: "+ced
                + "Telefono fijo: "+telef
                + "Celular: "+ cel;
    }
}
