public class Main {

    public static void main(String[] args) {

        int numeroif=0;
        if (numeroif>0){
            System.out.println("El numero es positivo");
        }else if(numeroif<0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es cero");
        }

        int numeroWhile=0;
        while (numeroWhile<3){
            System.out.println("El numero del While es: "+numeroWhile);
            numeroWhile+=1;
        }
        do {
            System.out.println("El numero del Do While es: "+numeroWhile);
            numeroWhile+=1;
        }while (numeroWhile<3);

        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println("El numero del For es: "+numeroFor);

        }
        var estacion="verano";
        switch (estacion){
            case "verano":
                System.out.println("La estacion es Verano");
                break;
            case "invierno":
                System.out.println("La estacion es Verano");
                break;
            case "Primavera":
                System.out.println("La estacion es Verano");
                break;
            case "otoño":
                System.out.println("La estacion es Verano");
                break;
            default:
                System.out.println("La estacion no es correcta");
        }

    }
}