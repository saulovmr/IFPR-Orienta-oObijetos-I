public class ExemploString{
	public static void main(String[] args){
		String str1, str2;
		
		str1 = "Um texto qualquer...  ";
		System.out.println("[" + str1 + "]");
		
		str1 = str1.trim(); //remove espaços do final 
		System.out.println("[" + str1 + "]");
		
		System.out.println("Tamanho do str1: " + str1.length());
		
		//substituir um substring dentro de um string
		str2 = str1.replace("texto", "teste");
		System.out.println("[" + str2 + "]");
		
		//copiar uma substring
		str2= str1.substring(6,10);
		System.out.println("[" + str2 + "]");
		
		//procurar substring
		str1 = "humberto.beneduzzi@ifpr.edu.br";
		int posicao = str1.indexOf("@");
		System.out.println("O @ está na posição " + posicao);
		System.out.println("Usuário: " + str1.substring(0, posicao));
		System.out.println("Servidor: " + str1.substring(posicao + 1, str1.length()));
		
		//converter de outros tipos para String
		int valor = 5;
		String str3 = String.valueOf(valor);
		System.out.println(str3);
		
		String conteudo = "5/6/7/8/9/4/6/55/44";
		String[] arrayConteudo = conteudo.split("/");
		System.out.println(arrayConteudo);
		System.out.println(arrayConteudo[7]);
						
	}
}
