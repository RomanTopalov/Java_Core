package pack;

public class Main {
	public static void main(String[] args) {

		// Transport transport = Transport.CAR;

		// System.out.println(transport.name());
		//
		// System.out.println(transport.ordinal());
		//
		// System.out.println(transport.compareTo(Transport.BUS));

		// Transport [] transports = transport.values();
		//
		// for (int i = 0; i < transports.length; i++) {
		// System.out.println(transports[i]);
		// }
		//
		// for (int i = 0; i < transport.values().length; i++) {
		// System.out.println(transport.values()[i]);
		// }

		// String maxLenght = "";
		//
		// for (int i = 0; i < Transport.values().length; i++) {
		// if(Transport.values()[i].name().length() >= maxLenght.length()){
		// maxLenght = Transport.values()[i].name();
		// }
		//
		// }
		// System.out.println(maxLenght);

		// int max = 0;
		//
		// for (int i = 0; i < Transport.values().length; i++) {
		// if (Transport.values()[i].name().length() > max) {
		// max = Transport.values()[i].name().length();
		// }
		//
		// }
		//
		// for (int i = 0; i < Transport.values().length; i++) {
		// if (Transport.values()[i].name().length() == max) {
		// System.out.println(Transport.values()[i]);
		//
		// }
		//
		// }

		// Transport tr = Transport.CAR;
		//
		// switch(tr){
		// case BIKE :{
		// break;
		// }case BUS :{
		// break;
		// }case CAR:{
		// break;
		// }case PLANE:{
		// break;
		// }case HORSE:{
		// break;
		// }default : {
		//
		// }
		// }
		// Person person = new Person();
		//
		// person.toGo(Transport.TRUCK);

		Transport[] transports = Transport.values();

		int maxSpeed = 0;

		for (int i = 0; i < transports.length; i++) {
			if (maxSpeed < transports[i].getMaxSpeed()) {
				maxSpeed = transports[i].getMaxSpeed();
			}
		}

		for (int i = 0; i < transports.length; i++) {
			if (maxSpeed == transports[i].getMaxSpeed()) {
				System.out.println(transports[i].getMaxSpeed() + " " + transports[i].name());
				// break;
			}
		}

	}
}
