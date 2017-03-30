package forLesson;

import javax.swing.table.TableCellRenderer;

public class Main {

	public static void main(String[] args) {

		 
		// ���� �� ����� �������� �� ��������� ��������� NEW ����� ����� �����
		// ���� ����������� ����� TR ����������� Tansport ����������� ����������� ��� ����� ������� ���������
		Transport tr = Transport.TRAIN;
		// ���� ����� ������� ����� �����
		System.out.println("Typical speed for an airoplane is " + tr.getSpeed() + " kilometrs per hour. \n");

		// ����������� ����� �������� �������� �� ���� �����, ���� ��������� �
		// �� ������
		System.out.println(
				"Typical speed for an airoplane is " + Transport.TRAIN.getSpeed() + " kilometrs per hour. \n");

		// ������� ���� ����� ��������� ���� for
		// ������� �������� ����� � ���� ������� �� ���������
		Transport all[] = Transport.values();
		// ��������� �� � ����
		for (int i = 0; i < Transport.values().length; i++) {
			// ������� �������� ������ � ��������� �-�� �����
			System.out.print(all[i] + " ");
			System.out.print(all[i].getSpeed() + " ");
		}
		System.out.println();
		System.out.println("all transport speed: ");
		// ����� ���� for-each �������� �� ��������� �������� � ���� ��������
		for (Transport t : Transport.values()) {
			System.out.println(t + " typical speed is " + t.getSpeed() + " kilometrs per hour.");
		}
		System.out.println();
		
		// ���� ������������� �������� SWITCH  � CASE ������� ��������� ��� ������� ���� Transport.AIROPLANE 
		// �� ������� ���� �� �������� SWITCH �� ���� ������� �� ��������������� �������� � �� ���� 
		// ������� �� ��� 
		// ����� ���� ���� �� ������ ������  Transport.AIROPLANE ��������� ������� ��� �������
		
		// �������������� � ����� SWITCH ����� tr ��� �� ������� defoult CASE
		switch (tr) {
		case AIROPLANE:
			System.out.println("Airoplane");
			System.out.println(Transport.AIROPLANE.getSpeed());
			break;
		case BOAT: 
			System.out.println("Boat");
			System.out.println(Transport.BOAT.getSpeed());
			break;
		case CAR: 
			System.out.println("Car");
			System.out.println(Transport.CAR.getSpeed());
			break;
		case TRAIN:
			System.out.println("Train");
			System.out.println(Transport.TRAIN.getSpeed());
			break;
		case TRUCK:
			System.out.println("Track");
			System.out.println(Transport.TRUCK.getSpeed());
			break;
		}

		System.out.println();
		// ����� ordinal ������� �������� ��������� ��-������� ������
		switch (tr.ordinal()) {
		case 1:
			System.out.println("Airoplane");
			System.out.println(Transport.AIROPLANE.getSpeed());
			break;
		case 2: 
			System.out.println("Boat");
			System.out.println(Transport.BOAT.getSpeed());
			break;
		case 3: 
			System.out.println("Car");
			System.out.println(Transport.CAR.getSpeed());
			break;
		case 4:
			System.out.println("Train");
			System.out.println(Transport.TRAIN.getSpeed());
			break;
		case 5:
			System.out.println("Track");
			System.out.println(Transport.TRUCK.getSpeed());
			break;
		}
		// ����� compereTo ��� ��������� �������� ���� �������� � ������ ������������
		Transport car = Transport.CAR;
		Transport airoplane = Transport.TRAIN;
		System.out.println(car.compareTo(airoplane));
	}

}
