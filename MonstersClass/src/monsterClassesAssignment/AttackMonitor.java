package monsterClassesAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class AttackMonitor {
    private ArrayList<MonsterAttack> listOfMonsterAttacks;
    

    public AttackMonitor() {
        listOfMonsterAttacks = new ArrayList<>();
    }

    public void reportAttacks() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter in the details of this monster attack:");

            System.out.println("Monster Name: ");
            String monsterName = scanner.nextLine();

            System.out.println("Attack Location: ");
            String attackLocation = scanner.nextLine();

            System.out.println("Damage In Million USD: ");
            double damageInMillionUSD = scanner.nextDouble();
            
            scanner.nextLine(); // Consume the newline character

            System.out.println("Date of the attack (Ex: December 1, 1990): ");
            String date = scanner.nextLine();

            MonsterAttack monster = new MonsterAttack(monsterName, attackLocation, damageInMillionUSD, date);

            this.listOfMonsterAttacks.add(monster);
        }
        scanner.close();
    }

    
    public void showAttacks() {
    	
    	for(int i = 0; i < listOfMonsterAttacks.size(); i++) {
    		System.out.println(listOfMonsterAttacks.get(i).toString());
    		
    		}	
    }

    public void showDamages() {
    	
    double meanDamage = 0;
    
	for(int i = 0; i < listOfMonsterAttacks.size(); i++) {
		System.out.println(listOfMonsterAttacks.get(i).getMonsterName() + " has done " + 
				
				listOfMonsterAttacks.get(i).getDamagesInMillionUSD()
				
				+ " worth of Damage in Million USD");
		
		meanDamage +=listOfMonsterAttacks.get(i).getDamagesInMillionUSD();
	    }
    
	
    meanDamage = meanDamage /listOfMonsterAttacks.size();
    
    
    
    System.out.println("Monsters have a total mean damage of " + meanDamage);
    	
    }
    
    public void showMonsters() {
        ArrayList<String> monsterNames = new ArrayList<>();
        ArrayList<Integer> monsterCounts = new ArrayList<>();

        for (MonsterAttack attack : listOfMonsterAttacks) {
            String monsterName = attack.getMonsterName();
            int index = monsterNames.indexOf(monsterName);

            if (index == -1) {
                monsterNames.add(monsterName);
                monsterCounts.add(1);
            } else {
                int count = monsterCounts.get(index);
                monsterCounts.set(index, count + 1);
            }
        }

        for (int i = 0; i < monsterNames.size(); i++) {
            System.out.println(monsterNames.get(i) + ": " + monsterCounts.get(i) + " attack(s)");
        }
    }
    
    
    
    
    
    public void monitorMenu() {
        boolean running = true;
        System.out.println("Welcome to the Monster Monitor menu");
        Scanner in = new Scanner(System.in);

        while (running) {
            System.out.println("Enter 1 to report monster attacks");
            System.out.println("Enter 2 to see monster attacks");
            System.out.println("Enter 3 to see each monster's damage and total mean damage");
            System.out.println("Enter 4 to see monsters involved in attacks");
            System.out.println("Enter 5 to exit");

            int choice;
            while (true) {
                System.out.print("Please enter a valid choice: ");
                if (in.hasNextInt()) {
                    choice = in.nextInt();
                    in.nextLine(); // Consume the newline character
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid option.");
                    in.nextLine(); // Consume the invalid input
                }
            }

            switch (choice) {
                case 1:
                    reportAttacks();
                    break;
                case 2:
                    showAttacks();
                    break;
                case 3:
                    showDamages();
                    break;
                case 4:
                    showMonsters();
                    break;
                case 5:
                    System.out.println("Thank you for using Monster Monitor menu");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

} 
