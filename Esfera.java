
import java.util.Scanner;

public class Esfera{
    public class ObjEsfera {
    
        private float raio;
        
        public ObjEsfera(float raio) {
            this.raio = raio;
        }

        public void setRaio(float raio){
    
            this.raio = raio;
        }
        
        public float CalcularVolume(){
            double Volume;
            Volume = ((4.0/3.0)*Math.PI*Math.pow(this.raio, 3.0));
            return (float) Volume;
        }
    
        public float CalcularArea(){
            double Area;
            Area = 4.0*Math.PI*Math.pow(this.raio,2);
            return (float) Area;
        }
        
        
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o raio");
        float r = scanner.nextFloat();
        Esfera esfera = new Esfera();
        ObjEsfera objEsfera = esfera.new ObjEsfera(r);
        
        System.out.println("Volume: " + objEsfera.CalcularVolume());
        System.out.println("Área: " + objEsfera.CalcularArea());   
        scanner.close();
    }
}