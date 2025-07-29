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
                        int dano = osa.atqScream();
                        enemigo.takeDamage(dano);
                        System.out.println(osa.getName() + "Ha usado Scream. El daño fue de: " + dano + "hp");
                        continuar = true;
                        break;

                    case 2:
                        dano = osa.atqSpikes();
                        enemigo.takeDamage(dano);
                        System.out.println(osa.getName() + "Ha usado Spikes. El daño fue de: " + dano + "hp");
                        continuar = true;
                        break;

                    case 3:
                        dano = osa.atqTheeth();
                        enemigo.takeDamage(dano);
                        System.out.println(osa.getName() + "Ha usado Spikes. El daño fue de: " + dano + "hp");
                        continuar = true;
                        break;

                    case 4:
                        dano = osa.atqBear();
                        enemigo.takeDamage(dano);
                        System.out.println(osa.getName() + "Ha usado Bear. El daño fue de: " + dano + "hp");
                        continuar = true;
                        break;

                    case 5:
                        dano = osa.atqWhip();
                        enemigo.takeDamage(dano);
                        System.out.println(osa.getName() + "Ha usado Whip. El daño fue de: " + dano + "hp");
                        continuar = true;
                        break;

                    case 6:

                    case 0:
                        System.out.println("GOODBYE!");
                        continuar = false;
                        break;

                    default:
                        System.out.println("Opcion incorrecta");

                }
            } while (!continuar);
                System.out.println("Adios!");
        }
    }

}
