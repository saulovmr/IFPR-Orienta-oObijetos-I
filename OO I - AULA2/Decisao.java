public class Decisao {
    public static void main (String[] args) {
        if(args.length < 2){
            System.out.println("O programa precisa de 2 parametros");
            System.exit(0);
        }

        Integer valor1 =  Integer.parseInt(args[0]);
        Integer valor2 =  Integer.parseInt(args[1]);
        OperacoesMatematicas opMat = new OperacoesMatematicas();

        if (valor1 < 5) {
            System.out.println("Multiplicando....");
            System.out.println(opMat.multiplicar(valor1, valor2));
        } else {
            System.out.println("Dividino...");
            System.out.println(opMat.dividir(valor1, valor2));

        }

        // Operadores lógicos: && ->AND, || -> OR, ! -> NOT
        // Relacionais

        // Valores numericos se comparam com " == "
        // String compara com o método "equals"
    }
}
