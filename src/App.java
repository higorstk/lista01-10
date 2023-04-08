import java.util.Scanner;
class Main{
public static void main(String[] args){
//Passo1:Mostrar variaveis
  double fahrenheit;
  double celcius;
  //Passo2:Entrada de dados
  Scanner teclado = new Scanner(System.in);
  System.out.println("Digite a temperatura em celcius:");
  celcius = teclado.nextDouble();
  //Passo3:Transformar celcius em fahrenheit
  fahrenheit = (celcius * 1.8) + 32;
  //Passo4:Mostrar resultado
  System.out.println ("A temperatura em fahrenheit é :" + fahrenheit);
}
}