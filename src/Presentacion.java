public class Presentacion {
    public static void main(String[]args) {
        //ESTADO 1 = NEW DE CREAR LOS HILOS
        Proceso h1 = new Proceso();
        Proceso h2 = new Proceso();
        Proceso h3 = new Proceso();
        System.out.println(h1.getName() + h1.getState());
        System.out.println(h2.getName() + h2.getState());
        System.out.println(h3.getName() + h3.getState());
        //ESTADO 2 DE COMENZAR LOS HILOS
        h1.start();
        try {
            //ESTADO 3 DE DORMIR LOS HILOS
            h1.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("ERROR EN EL HILO 1!!"+ e);
        }
        h2.start();
        //ESTADO 4 DE TERMINAR EL HILO
        h2.stop();
        //System.out.println(h2.getName() + h2.getState());
        try {
            h2.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("ERROR EN EL HILO 2!!"+ e);
        }
        h3.start();

        try {
            h3.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("ERROR EN EL HILO 3!!");
        }

    }


}

