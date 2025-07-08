import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Bicicleta elem1=new Bicicleta("Bosco","RT-500",60,true);
        Bicicleta elem2=new Bicicleta("Biky","TY-9000",65,false);
        Bicicleta elem3=new Bicicleta("leVelo","BC520",70,true);

        ArrayList<Bicicleta> bicicletas =new ArrayList<>();
        bicicletas.add(elem1);
        bicicletas.add(elem2);
        bicicletas.add(elem3);


        for (int i = 0; i < bicicletas.size(); i++) {
            System.out.println(bicicletas.toString());

        }


       elem1.honk();
       elem2.toTurn();
       elem3.honk();
       elem3.pedalear(scanner);

scanner.close();
    }
}
