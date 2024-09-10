import java.util.Scanner;

public class CadastraEmpregado {
    Scanner scanner = new Scanner(System.in);
    public class Empresa{
        private String razaoSocial;
        private String cnpj;
        private String telefone;

        public Empresa(){

        }

        public void setRazaoSocial(){
            System.out.println("Qual a razão social?");
            String l = scanner.nextLine();
            this.razaoSocial=l;
        }

        public void setcnpj(){
            System.out.println("Qual o CNPJ?");
            String l = scanner.nextLine();
            this.cnpj=l;
        }
        public void setelefone(){
            System.out.println("Qual o telefone?");
            String l = scanner.nextLine();
            this.telefone=l;
        }
        public String getrazaoSocial(){
            return razaoSocial;
        }
        public String getcnpj(){
            return cnpj;
        }
        public String getTelefone(){
            return telefone;
        }
    }

    public class Empregado{
        private String nome;
        private double salario;
        private String empresa;
        public Empregado (){

        }
        public void setNome(){
            System.out.println("Qual o nome?");
            String l = scanner.nextLine();
            this.nome=l;
        }
        public void setSalario(){
            System.out.println("Qual o salário?");
            Double d = scanner.nextDouble();
            this.salario=d;
        }
        public void setEmpresa (Empresa empresa){

        }
        public String getNome(){
           
            return nome;
        }
        public double getSalario(){
            return salario;
        }
        public String getEmpresa(){
            return empresa;
        } 
    } 

    public static void main(String[] args){
        CadastraEmpregado ce = new CadastraEmpregado();
        Empregado empregado = ce.new Empregado();
        Empresa empresa = ce.new Empresa();

        empregado.setNome();
        empregado.setSalario();
        empregado.setEmpresa(empresa);

        empregado.getNome();
        empregado.getSalario();
        empregado.getEmpresa();

        empresa.setRazaoSocial();
        empresa.setelefone();
        empresa.setcnpj();

        empresa.getcnpj();
        empresa.getTelefone();
        empresa.getrazaoSocial();

        System.out.println(empregado.getNome());    
        System.out.println(empregado.getSalario());   
    }
}