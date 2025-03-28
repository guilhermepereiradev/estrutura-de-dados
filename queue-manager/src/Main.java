import com.oxd.patient.Patient;
import com.oxd.patient.PatientsQueueManager;
import com.oxd.queue.Queue;
import com.oxd.utils.TicketGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        boolean keep = true;
        PatientsQueueManager patientsQueueManager = new PatientsQueueManager();

        while (keep) {
            patientsQueueManager.printMenu();
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1 -> {
                    System.out.println("Digite o nome do paciente: ");
                    String name = sc.nextLine();
                    patientsQueueManager.generatePatient(name);
                    System.out.println("Senha gerada...");
                    Thread.sleep(2000);
                }
                case 2 -> patientsQueueManager.callNextPatient();
                case 3 -> {
                    patientsQueueManager.printCalledPatients();
                    System.out.println("Tecle ENTER para continuar...");
                    sc.nextLine();
                }
                case 4 -> keep = false;
            }
        }
        sc.close();
    }
}