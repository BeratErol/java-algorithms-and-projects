package bom_bom_oyunu;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BomBom
{
   
	public static void main(String[] args) 
	{
		//Scanner oluşturma (klavyeden/konsoldan giriş için)
    	Scanner input = new Scanner(System.in);
    	
        // 10x10'luk bir tamsayı matrisi oluştur
        int[][] harita = new int[10][10];
        
        try 
        {
        	// Dosyanın şu anki klasöründeki tam yolunu oluşturur
            String dosyaYolu = System.getProperty("user.dir") + "/projeler/bom_bom_oyunu/harita.txt";
         // 'harita.txt' dosyasını okumak için BufferedReader oluştur
            BufferedReader br = new BufferedReader(new FileReader(dosyaYolu));
            String satir;
            int satirNo = 0;

            // Dosyadan satır okuma işlemi
            while ((satir = br.readLine()) != null && satirNo < 10) 
            {
                // Her satırdaki karakterleri tek tek oku ve tamsayıya çevir
                for (int i = 0; i < satir.length() && i < 10; i++) 
                {
                    harita[satirNo][i] = Character.getNumericValue(satir.charAt(i));
                }
                // Sonraki satıra geç
                satirNo++;
            }

            // BufferedReader'ı kapat
            br.close();
        } 
        
        catch (IOException e) 
        {
            // Hata durumunda hata mesajını yazdır
            e.printStackTrace();
        }
        
        // Oyun döngüsü
        while (!xMi(harita)) 
        {
        	 // Haritayı ekrana bas
            haritayiGoster(harita);
            
            // Döngü sayacı
            donguSayaci = 0;
        	
            // Kullanıcıdan koordinat al
            System.out.print("Lütfen koordinat giriniz (örnek: 4 5) veya oyunu sonlandırmak için 0 0 giriniz: ");
            int satir = input.nextInt();
            int sutun = input.nextInt();

            // Oyunu sonlandır
            if (satir == 0 && sutun == 0) 
            {
                System.out.println("GÜLE GÜLE!");
                break;
            }
            
            // Girilen aralıkları 1 azaltarak tablodaki değeri bul
        	int yenisatir = satir - 1;
        	int yenisutun = sutun - 1;
        	
        	int tablodakideger = harita[yenisatir][yenisutun];
            
        	// Koordinatı kontrol et ve haritayı güncelle
            kontroletme (harita,yenisatir,yenisutun,tablodakideger);
        }							
    } 
   
	// Haritayı konsolda gösterme işlemi
	private static void haritayiGoster(int[][] harita) 
	{
        System.out.println("Harita:");
        for (int i = 0; i < 10; i++) 
        {
           for (int j = 0; j < 10; j++) 
           {
        	   // -1'leri X'e çevir
        	   if (harita[i][j]==-1)
        		   System.out.print("X ");
            	
        	   else 
        		   System.out.print(harita[i][j] + " ");
           }
            System.out.println();  
        }        
	}
    
	// X'lerin sayısını kontrol eden metot
    public static boolean xMi(int[][] harita) 
    {
    	int kacTane = 0;
    	
    	 // Dizideki her elemanı kontrol et
    	 for (int i = 0; i < 10; i++) 
    	 {
             for (int j = 0; j < 10; j++) 
             {
            	// Eğer eleman -1 ise kacTane değerini artır
             	if (harita[i][j]== -1) 
             	{
             		kacTane++;
             	}
             }      
         } 		
    	 return kacTane == 101;
    }
    
    static int donguSayaci = 0;
    
    // Tablodaki değere göre etrafını kontrol etme işlemi
    private static void kontroletme(int[][] harita, int yenisatir, int yenisutun, int tablodakideger) 
    {
    	// Sınır değere dikkat ederek girilerin değerin üst hanelerini kontrol etme
        if (yenisatir - 1 >= 0 && harita[yenisatir - 1][yenisutun] == tablodakideger) 
        {
            harita[yenisatir - 1][yenisutun] = -1;
            harita[yenisatir][yenisutun] = -1;
            kontroletme(harita, yenisatir - 1, yenisutun, tablodakideger);
        }
        
        // Sınır değere dikkat ederek girilerin değerin alt hanelerini kontrol etme
        if (yenisatir + 1 <= 9 && harita[yenisatir + 1][yenisutun] == tablodakideger) 
        {
            harita[yenisatir + 1][yenisutun] = -1;
            harita[yenisatir][yenisutun] = -1;
            kontroletme(harita, yenisatir + 1, yenisutun, tablodakideger);
        }
        
        // Sınır değere dikkat ederek girilerin değerin sağındaki haneleri kontrol etme
        if (yenisutun + 1 <= 9 && harita[yenisatir][yenisutun + 1] == tablodakideger) 
        {
            harita[yenisatir][yenisutun + 1] = -1;
            harita[yenisatir][yenisutun] = -1;
            kontroletme(harita, yenisatir, yenisutun + 1, tablodakideger);
        }
        	
        // Sınır değere dikkat ederek girilerin değerin solunkdaki hanelerini kontrol etme
        if (yenisutun - 1 >= 0 && harita[yenisatir][yenisutun - 1] == tablodakideger) 
        {
            harita[yenisatir][yenisutun - 1] = -1;
            harita[yenisatir][yenisutun] = -1;
            kontroletme(harita, yenisatir, yenisutun - 1, tablodakideger);
        }
        
    } 
 }

	
    
	
