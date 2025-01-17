import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> teams = new ArrayList<String>();
        ArrayList<String> group1 = new ArrayList<String>();
        ArrayList<String> group2 = new ArrayList<String>();
        String round1 = " ";
        System.out.println("Enter the names of your teams:");
        for (int i = 0; i < 8; i++) {
            String name = sc.nextLine();
            if (!teams.contains(name)) {
                teams.add(name);
                System.out.println("All team names are unique, you may proceed.");
                System.out.println("Here are the teams:" + teams);
            } else {
                System.out.println("Team already exists, please try again.");
                sc.nextLine();
            }
        }
        for (int i = 0; i < 4; i++) {
            i = (int) (Math.random() * (7 + 1) + 0);
            String member = teams.get(i);
            teams.remove(i);
            group1.add(member);
        }
        group2 = teams;
        System.out.println(group1);
        System.out.println(group2);
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                System.out.println(group1.get(i) + " will play against " + group1.get(j));
            }
        }
    }
}