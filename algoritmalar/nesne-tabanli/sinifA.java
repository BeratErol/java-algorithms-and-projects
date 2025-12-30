
public class sinifA {

	public String metot1() {
		return "Merhaba SinifA";
	}
}

class sinifB extends sinifA implements ArayuzA{
	public String metot1() {
		return "Merhaba SinifB";
	}
	public String metot2() {
		return "Yapılabilir SinifB";
	}
	
}

interface ArayuzA{
	public abstract String metot2();
}

abstract class SinifD implements ArayuzA{
	public String metot2() {
		return "Yapılabilir SinifD";
	}
}

class SinifE extends SinifD{
	public String metot2() {
		return "Yapılabilir SinifE";
	}
}
