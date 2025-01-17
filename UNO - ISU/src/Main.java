import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> teams = new ArrayList<String>();
        ArrayList<String> group1 = new ArrayList<String>();
        ArrayList<String> group2 = new ArrayList<String>();
        String roundMembers = " ";
        ArrayList<String> team1 = new ArrayList<String>();
        int roundB =0;
        int roundA = 0;
        String round1 = " ";
        System.out.println("Enter the names of your teams:");
        for (int i = 0; i < 8; i++) {
            String name = sc.nextLine();
            if (!teams.contains(name)) {
                teams.add(name);
            }
            else {
                System.out.println("Team already exists, please try again.");
                sc.nextLine();
            }
        }
        System.out.println("All team names are unique, you may proceed.");
        System.out.println("Here are the teams:" + teams);
        for (int i = 0; i < 4; i++) {
            int index= (int) (Math.random() * (teams.size()) + 0);
            System.out.println(teams.get(index));
            String member = teams.get(index);
            if (!group1.contains(member)) {
                teams.remove(index);
                group1.add(member);
            }
        }
        group2 = teams;
        System.out.println(group1);
        System.out.println(group2);
        System.out.println("Here is the arrangement for group 1");
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                roundA++;
                System.out.println("Round " + roundA + ":" + group1.get(i) + " will play against " + group1.get(j));
            }
        }
        System.out.println(" ");
        System.out.println("Here is the arrangement for group 2");
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                roundB++;
                roundMembers = group2.get(i) + group2.get(j);
                System.out.println("Round " + roundB + ":" + group2.get(i) + " will play against " + group2.get(j));

            }
        }
    }
}