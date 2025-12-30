public class TelevizyonNesneTesti {

    public static void main(String[] args) {
        TelevizyonNesneModeli tv1 = new TelevizyonNesneModeli();
        tv1.ac();
        tv1.setKanal(2);
        tv1.kanalAsagi();
        tv1.setSes(3);
        
        TelevizyonNesneModeli tv2 = new TelevizyonNesneModeli();
        tv2.ac();
        tv2.setKanal(119);
        tv2.kanalYukari();
        tv2.sesArtir();
        
        System.out.println("tv1 kanal: " + tv1.kanal + ", Ses: " + tv1.sesSeviyesi);
        System.out.println("tv2 kanal: " + tv2.kanal + ", Ses: " + tv2.sesSeviyesi);
    }
} 