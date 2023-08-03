package Atividade01;

public class instalacao {

    public static void main(String[] args) {

        int kmh = 200;
        String tipoInstalacao = "r";
        if (kmh < 500) {
            double valor = 0.40 * (kmh - 500);
            System.out.println("o valor da instalacao abaixo e = " + valor);
        } else {
            int kmh2 = 700;
            String tipoInstalacao2 = "r";
            if (kmh2 > 500) {
                double valor2 = 0.65 * (kmh2 - 500);
                System.out.println("o valor da instalacao acima e = " + valor2);

            }

            int kmh3 = 500;
            String tipoComercial = "c";
            if (kmh3 < 1000) {
                double valor3 = 0.55 * (kmh3 - 1000);
                System.out.println("o valor do comercial abaixo e = " + valor3);
            }

        }else {
                        int kmh4 = 1200;
                    String tipoComercial2 = "c";
                    if (kmh4 > 1000) {
                        double valor4 = 0.60 * (kmh4 - 1000);
                        System.out.println("o valor do comercial acima e = " + valor4);}
                }
                    

                        int kmh5 = 1500;
                        String tipoindustrial = "i";
                        if (kmh5 < 5000) {
                            double valor5 = 0.55 * (kmh5 - 5000);
                            System.out.println("o valor do industrial abaixo e = " + valor5);

                            int kmh6 = 6000;
                            String tipoindustrial2 = "c";
                            if (kmh6 < 5000) {
                                double valor6 = 0.60 * (kmh6 - 5000);
                                System.out.println("o valor do comercial acima e = " + valor6);
                            }
                        }
                    }

    }
}
}
}
}
