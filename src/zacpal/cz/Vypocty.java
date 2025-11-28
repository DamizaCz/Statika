package zacpal.cz;

public class Vypocty {
    public static String lanNetwork(String ipAdressa, String maska) {
        String network = "";
        int[] networkCislo = new int[4];
        String[] ip = ipAdressa.split("[.]");
        String[] m = maska.split("[.]");

        // Pro každou část IP a masky
        for (int i = 0; i < ip.length; i++) {
            networkCislo[i] = Integer.parseInt(ip[i]) & Integer.parseInt(m[i]);
            network += networkCislo[i];
            // Tečku přidáme pouze mezi oktety
            if (i < networkCislo.length - 1) {
                network += ".";
            }
        }
        return network;
    }

    public String maska(int pocetBitu) {
        String maska = "";

        // Přidej 255 pro každou celou oktetu
        for (int i = 0; i < pocetBitu / 8; i++) {
            maska += "255.";
        }

        // Vypočítej hodnotu pro zbytek
        int[] pom = {128, 64, 32, 16, 8, 4, 2, 1};
        int sum = 0;
        for (int i = 0; i < pocetBitu % 8; i++) {
            sum += pom[i];
        }
        maska += sum;

        // Přidej .0 pro zbývající oktety
        for (int i = 0; i < 3 - pocetBitu / 8; i++) {
            maska += ".0";
        }

        return maska;
    }
}
