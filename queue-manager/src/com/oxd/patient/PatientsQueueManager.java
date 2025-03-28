package com.oxd.patient;

import com.oxd.queue.Queue;
import com.oxd.utils.TicketGenerator;

import java.util.Scanner;

public class PatientsQueueManager {
    private Queue<Patient> waitingPatients = new Queue<>();
    private Queue<Patient> calledPatients = new Queue<>();
    private Patient lastCalledPatient = null;

    public PatientsQueueManager() {}

    public void generatePatient(String name) {
        Patient newPatient = new Patient(TicketGenerator.generate(), name);
        getWaitingPatients().enqueue(newPatient);
    }

    public void callNextPatient() {
        setLastCalledPatient(getWaitingPatients().dequeue());
        getCalledPatients().enqueue(getLastCalledPatient());
    }

    public void printCalledPatients() {
        System.out.println(getCalledPatients());
    }

    public void printMenu() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        StringBuilder menu = new StringBuilder();
        if (getLastCalledPatient() != null) {
            menu.append("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
            menu.append("+      Último paciente chamado:                                  +\n")
                    .append("+            Senha: ").append(getLastCalledPatient().getTicket()).append("\n")
                    .append("+            Nome: ").append(getLastCalledPatient().getName()).append("\n");
        }
        menu.append("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        menu.append("+      Escolha uma opção:                                        +\n");

        menu.append("+            1 - Gerar senha:                                    +\n");

        if (!getWaitingPatients().isEmpty()) {
            menu.append("+            2 - Chamar próximo                                  +\n");
        }

        if(!getCalledPatients().isEmpty()) {
            menu.append("+            3 - Exibir pacientes já chamados                    +\n");
        }

        menu.append("+            4 - Sair                                            +\n")
                .append("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(menu);
    }

    public Queue<Patient> getWaitingPatients() {
        return waitingPatients;
    }

    public void setWaitingPatients(Queue<Patient> waitingPatients) {
        this.waitingPatients = waitingPatients;
    }

    public Queue<Patient> getCalledPatients() {
        return calledPatients;
    }

    public void setCalledPatients(Queue<Patient> calledPatients) {
        this.calledPatients = calledPatients;
    }

    public Patient getLastCalledPatient() {
        return lastCalledPatient;
    }

    public void setLastCalledPatient(Patient lastCalledPatient) {
        this.lastCalledPatient = lastCalledPatient;
    }

}
