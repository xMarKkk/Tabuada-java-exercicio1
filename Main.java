import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int multi, multipl, rstd;
    
    System.out.println("Escolha o número que deseja multiplicar");
    multi = scan.nextInt();

    for(multipl=1; multipl<=10; multipl++){
      rstd= multi*multipl;
      System.out.println(multi+"×"+multipl+"="+rstd);
    }
  }
}