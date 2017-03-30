package some;

public class Instrumentalist {

//	public void perfomance(Guitar guitar){
//		guitar.play();
//	}
//	
//	public void perfomance(Drums drums){
//		drums.play();
//	}
//	
//	public void perfomance(Piano piano){
//		piano.play();
//	}

	public void perfomance(Instrument instrument){
		instrument.play();
	}
	
	public void perfomanceAllInstrument(Instrument [] instruments){
		
		for(int i =0; i <instruments.length; i++){
			instruments[i].play();
		}
		
//		for (Instrument in : instruments) {
//			in.play();
//		}
		
	}
	
	
}

