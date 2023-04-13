



    public class Main {
        public static void main(String[] args) {
            Tienda t1= new Tienda("calle encino");
            ComEscritorio c1= new ComEscritorio("d",1,12,"intel","modelo basico","1994",10000,4,"gtx200","fuente cousary","bt850","pantalla 21 pulgadas");
            Compra v1= new Compra("13-14-2023");
            t1.agregarDispositivo(c1);
            t1.agregarVenta(v1);
            System.out.println(c1);

        }
    }

