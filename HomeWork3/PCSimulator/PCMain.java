package HomeWork3.PCSimulator;


import java.util.Random;

public class PCMain {
    public static void main(String[] args) {
        Bios bios = new Bios();
        ControllerCOM controllerCOM = new ControllerCOM();
        ControllerGPU controllerGPU = new ControllerGPU();
        ControllerHDD controllerHDD = new ControllerHDD();
        ControlSum controlSum = new ControlSum();
        CPU cpu = new CPU();
        First64BitesRam first64BitesRam = new First64BitesRam();
        Ram ram = new Ram();

        IPC[] arrTest = {cpu, controlSum, first64BitesRam, controllerGPU, ram, bios, controllerCOM, controllerHDD};
        for (int i = 0; i < arrTest.length; i++) {
            if (arrTest[i].test())
            arrTest[i].run();
            else {
                System.out.println("Error in test " + arrTest[i].toString());
                System.exit(666);
            }
        }
        Random random = new Random();
        int bs = random.nextInt(10);

        if (bs > 5) {
            System.out.println("Blue SCREEEEEN");
            System.exit(200);
        }

        System.out.println("Welcome to your PC");
    }
}
