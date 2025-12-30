
public class TV {
	int kanal = 1;
	int sesSeviyesi = 1;
	boolean acik = false;
	
	public TV() {
	}
	
	public void ac(){
		acik = true;
	}
	
	public void kapat() {
		acik = false;
	}
	
	public void setKanal(int yeniKanal) {
		if (acik && yeniKanal >= 1 && yeniKanal <= 120)
		kanal = yeniKanal;
	}
	
	public void setSes(int yeniSesSeviyesi) {
		if (acik && yeniSesSeviyesi >= 1 && yeniSesSeviyesi <= 7)
		sesSeviyesi = yeniSesSeviyesi;
	}
	
	public void kanalYukari() {
		if(acik && kanal<120)
		kanal++;
		
		else if(acik && kanal==120)
			kanal = 1;
	}
	
	public void kanalAsagi() {
		if(acik && kanal>1)
			kanal--;
		else if(acik && kanal==1)
			kanal = 120;
	}
	
	public void sesArtir() {
		if(acik && sesSeviyesi<7)
			sesSeviyesi++;
	}
	
	public void sesAzalt() {
		if(acik && sesSeviyesi>0)
			sesSeviyesi--;
	}
	
}