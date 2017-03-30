package some;

public class Main {

	public static void main(String[] args) {
		
		Drums drums = new Drums(100);
		Piano piano = new Piano(500);
		Guitar guitar = new Guitar(3);
		
		Instrument instrument = new Piano(200);
		
		Instrumentalist instrumentalist = new Instrumentalist();
		
		instrumentalist.perfomance(drums);
		instrumentalist.perfomance(piano);
		instrumentalist.perfomance(guitar);
		
		Instrument [] instruments = {drums,piano, guitar, instrument};
		System.out.println();
		instrumentalist.perfomanceAllInstrument(instruments);
		
		
	}
	
}
