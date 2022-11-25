package tech.bison.trainee2021.tasksBlockSix;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    TruncatedCone f1 = new TruncatedCone(12, 5.3, 7.5);
    System.out.println(String.format("Oberflaeche = %s", f1.getSurface()));
    System.out.println(String.format("Mantelflaeche = %s", f1.getSeathing()));
    System.out.println(String.format("Mantellinie = %s", f1.getSeathLine()));
    System.out.println(String.format("Volumen = %s", f1.getVolume()));
    System.out.println();
    TruncatedCone f2 = new TruncatedCone(new Circle(12), new Circle(5.3), 7.5);
    System.out.println(String.format("Oberflaeche = %s", f2.getSurface()));
    System.out.println(String.format("Mantelflaeche = %s", f2.getSeathing()));
    System.out.println(String.format("Mantellinie = %s", f2.getSeathLine()));
    System.out.println(String.format("Volumen = %s", f2.getVolume()));
    try (Scanner scanner = new Scanner(System.in)) {
      scanner.nextLine();
    }
  }
}
