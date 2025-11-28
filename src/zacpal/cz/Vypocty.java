package zacpal.cz;

public class Vypocty {
    public static String lanNetwork (String ipAdressa, String maska){
        String network = "";
        String [] ip = ipAdressa.split(".");
        System.out.println(ipAdressa);
        System.out.println(ip.length);
        for (int i = 0; i < ip.length ; i ++){
            System.out.println(ip[i]);
        }
        return network;
    }
}
