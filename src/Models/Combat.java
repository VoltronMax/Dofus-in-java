package Models;
import java.util.Scanner;

public class Combat {

    private void startBattle(Osamoda osa, Enemy enemigo){
        var input = new Scanner(System.in);

        while(osa.getHealth()>0 && enemigo.getHealth()>0){
            osa.getInfo();
            enemigo.getInfo();


        }

    }


}
