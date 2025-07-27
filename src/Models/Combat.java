package Models;
import java.util.Scanner;

public class Combat {

    private void startBattle(Osamoda osa, Enemy enemigo){
        var input = new Scanner(System.in);

        while(osa.getHealth()>0 && enemigo.getHealth()>0){
            System.out.println(osa.getInfo());
            System.out.println("");
            System.out.println(enemigo.getInfo());

            System.out.println("Turno del osamodas!: " + osa.getName());
            System.out.println(".:Hechizos:.");
            var continuar = false;
            do {
                System.out.println("""
                        1. atqScream
                        2. atqSpikes
                        3. atqTeeth
                        4. atqBear
                        5. atqWhip
                        6. invTofu
                        7. invJalato
                        8. invSaponito
                        9. invDragun
                        10. sptComunion
                        0 Saltar turno
                        """);
                System.out.println("\nIngrese el numero del ataque a usar");
                int opcion = input.nextInt();
                input.nextLine();

                switch (opcion){
                    case 1:
                        int daño = osa.atqScream();
                        enemigo.takeDamage(daño);
                        System.out.println(osa.getName() + "Ha usado Scream. El daño fue de: " + daño + "hp");
                        continuar = true;
                        break;

                    case 2:
                        daño = osa.atqSpikes();
                        enemigo.takeDamage(daño);
                        System.out.println(osa.getName() + "Ha usado Spikes. El daño fue de: " + daño + "hp");
                        continuar = true;
                        break;

                    case 3:
                        daño = osa.atqTheeth();
                        enemigo.takeDamage(daño);
                        System.out.println(osa.getName() + "Ha usado Spikes. El daño fue de: " + daño + "hp");

                }
            } while (!continuar);
                System.out.println("Adios!");
        }
    }

}
