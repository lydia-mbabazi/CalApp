import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int firstnum= scn.nextInt();
        System.out.println("Enter the second Number:");
        int secondnum= scn.nextInt();
        Model model=new Model();
      model.setFirstnum(firstnum);
      model.setSecondnum(secondnum);
      Calculator cal=new Calculator();
      System.out.println("Addition result: " + cal.add(model.getFirstnum(), model.getSecondnum()));
    }
}
