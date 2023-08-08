import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vetores3 {
    public static void main(String[] args) throws Exception {
        //criar vetor com os nomes dos meses
        //solicitar ao uusuário um número do mês
        //mostrar o nome do mes correspondente na tela
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int num = -1;
        while(true){
            System.out.println("Informe o numero do mes(ou 0 para sair)");
            num = Integer.parseInt(reader.readLine());

            if(num == 0){
                break;
            }else{     
               Meses meses = new Meses();
               String mes = meses.pegarNomeMes(num);
               if (mes.equals("")) {
                    System.out.println("Valor Inválido"); 
                } else {
                    System.out.println("O mês é: " + mes);
                } 
            }
        }       
    }
}
