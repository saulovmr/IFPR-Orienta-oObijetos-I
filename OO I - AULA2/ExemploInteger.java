public class ExemploInteger{
	public static void main(String[] args){
		
		String s1 = "10";
		System.out.println("s1 vale " +s1);
		
		//converter string para inteiro		
		int i1 = Integer.parseInt(s1);
		System.out.println("s1 vale " + i1);
		
		//Converter int para string
		Integer i2 = 2;
		s1 = i2.toString();
		
		//converter para float
		float f1 = i2.floatValue() / 3;
		System.out.println("f1 vale " + f1);
		System.out.println("f1 formatado: " + String.format("%.2f", f1));
				
	}
}
