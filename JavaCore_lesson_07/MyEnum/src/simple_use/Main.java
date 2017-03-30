package one;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter month:");
	        String month;

	        if (scanner.hasNextLine()) {
	            month = scanner.nextLine().toUpperCase();
	            {
	                int command;
	                System.out.println("Use commands below to get result:\n" +
	                        "1 - Show all monthes with of current season\n" +
	                        "2 - Show all monthes with same quantity of days\n" +
	                        "3 - Show all monthes with less days\n" +
	                        "4 - Show all monthes with more days\n" +
	                        "5 - Show next season\n" +
	                        "6 - Show previous season\n" +
	                        "7 - Show all monthes with matched days\n" +
	                        "8 - Show all monthes with unmatched days\n" +
	                        "9 - Show information about mutching of current month");
	                while (scanner.hasNextInt()) {
	                    command = scanner.nextInt();
	                    switch (command) {
	                        case 1:
	                            System.out.println("The season is " + Month.valueOf(month).getSeasons().name() + ". This season contains:");
	                            for (Month item : Month.values())
	                                if (Month.valueOf(month).getSeasons() == item.getSeasons()) System.out.println(item);
	                            break;
	                        case 2:
	                            System.out.println("These months has same quantity of days:");
	                            for (Month item : Month.values())
	                                if (Month.valueOf(month).getDays() == item.getDays()) System.out.println(item);
	                            break;
	                        case 3:
	                            System.out.println("These monthes has less days:");
	                            for (Month item : Month.values())
	                                if (item.getDays() < Month.valueOf(month).getDays()) System.out.println(item);
	                            break;

	                        case 4:
	                            System.out.println("These monthes has more days:");
	                            for (Month item : Month.values())
	                                if (item.getDays() > Month.valueOf(month).getDays()) System.out.println(item);
	                            break;
	                        case 5:
	                            System.out.println("Next season is:" + Seasons.values()[(Month.valueOf(month).getSeasons().ordinal() + 1) % Seasons.values().length]);
	                            break;
	                        case 6:
	                            System.out.println("Previous season is:" + Seasons.values()[(Month.valueOf(month).getSeasons().ordinal() + Seasons.values().length - 1) % Seasons.values().length]);
	                            break;
	                        case 7:
	                            System.out.println("Monthes with mached days:");
	                            for (Month item :Month.values())if (item.getDays()%2==0) System.out.println(item);
	                            break;
	                        case 8:
	                            System.out.println("Monthe with unmached days:");
	                            for (Month item :Month.values())if (item.getDays()%2==1) System.out.println(item);
	                            break;
	                        case 9:
	                            if (Month.valueOf(month).getDays()%2==0) System.out.println("Current month has matched days ("+Month.valueOf(month).getDays()+")");
	                            else System.out.println("Currant month has unmached days ("+Month.valueOf(month).getDays()+")");
	                            break;
	                        default:
	                            System.out.println("Use commands in the list");
	                    }
	                }
	            }
	        }
	}
}
