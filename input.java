import java.util.Scanner;


public class input {
    public static void main(String[] args){
        Scanner entry = new Scanner (System.in);
        String nome="";
        int n1=0;
        int n2=0;
        int res=0;
        System.out.print("Digite seu nome: ");
        nome=entry.nextLine();
        System.out.println("Digite um numeral: ");
        n1=entry.nextInt();
        System.out.println("Digite outro numeral: ");
        n2=entry.nextInt();
        res=n1 + n2;
        System.out.printf("%s a soma de %d com %d e igual a %d", nome,n1,n2,res );
        entry.close(); 
    }
     
    
}
