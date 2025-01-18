import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Initialisations
        ArrayList<String> teams = new ArrayList<String>();
        ArrayList<String> group1 = new ArrayList<String>();
        ArrayList<String> group2 = new ArrayList<String>();
        ArrayList<String> firstMatchMemberGroup1 = new ArrayList<String>();
        ArrayList<String> secondMatchMemberGroup1 = new ArrayList<String>();
        ArrayList<String> firstMatchMemberGroup2 = new ArrayList<String>();
        ArrayList<String> secondMatchMemberGroup2 = new ArrayList<String>();
        ArrayList<Integer> firstMatchMemberScoreGroup1 = new ArrayList<Integer>();
        ArrayList<Integer> secondMatchMemberScoreGroup1 = new ArrayList<Integer>();
        ArrayList<Integer> firstMatchMemberScoreGroup2 = new ArrayList<Integer>();
        ArrayList<Integer> secondMatchMemberScoreGroup2 = new ArrayList<Integer>();
        ArrayList<Integer> group1WinnerScores = new ArrayList<Integer>();
        ArrayList<String> group1Winners = new ArrayList<String>();
        ArrayList<Integer> group2WinnerScores = new ArrayList<Integer>();
        ArrayList<String> group2Winners = new ArrayList<String>();
        ArrayList<String> group1PlayoffQualifiers = new ArrayList<String>();
        ArrayList<String> group2PlayoffQualifiers = new ArrayList<String>();
        ArrayList<Integer> firstPlacePlayoff = new ArrayList<Integer>();
        ArrayList<Integer> secondPlacePlayoff = new ArrayList<Integer>();
        ArrayList<String> finalsQualifier = new ArrayList<String>();
        int maxScore = 0;
        int secondMaxIndex = 0;
        int secondMaxIndex2 = 0;
        int maxScore2 = 0;
        int highestScoreSemiFinals1 = 0;
        int highestScoreSemiFinals2 = 0;
        int highestScoreFinals = 0;
        String semiFinalsWinner1 = " ";
        String semiFinalsWinner2 = " ";
        String finalsWinner = " ";
        // Group 1 Points
        int Member1Team1Group1Status = 0;
        int Member1Team2Group1Status = 0;
        int Member1Team3Group1Status = 0;
        int Member1Team4Group1Status = 0;
        int Member1Team5Group1Status = 0;
        int Member1Team6Group1Status = 0;
        int Member2Team1Group1Status = 0;
        int Member2Team2Group1Status = 0;
        int Member2Team3Group1Status = 0;
        int Member2Team4Group1Status = 0;
        int Member2Team5Group1Status = 0;
        int Member2Team6Group1Status = 0;
        // Group 2 Points
        int Member1Team1Group2Status = 0;
        int Member1Team2Group2Status = 0;
        int Member1Team3Group2Status = 0;
        int Member1Team4Group2Status = 0;
        int Member1Team5Group2Status = 0;
        int Member1Team6Group2Status = 0;
        int Member2Team1Group2Status = 0;
        int Member2Team2Group2Status = 0;
        int Member2Team3Group2Status = 0;
        int Member2Team4Group2Status = 0;
        int Member2Team5Group2Status = 0;
        int Member2Team6Group2Status = 0;
        //Generating user-inputted team names
        String roundMembers = " ";
        ArrayList<String> team1 = new ArrayList<String>();
        int roundB = 0;
        int roundA = 0;
        String round1 = " ";
        System.out.println("Enter the names of your teams:");
        for (int i = 0; i < 8; i++) {
            String name = sc.nextLine();
            if (!teams.contains(name)) {
                teams.add(name);
            } else {
                System.out.println("Team already exists, please try again.");
                sc.nextLine();
            }
        }
        System.out.println("All team names are unique, you may proceed.");
        System.out.println("Here are the teams:" + teams);
        //Creating the groups
        for (int i = 0; i < 4; i++) {
            int index = (int) (Math.random() * (teams.size()) + 0);
            System.out.println(teams.get(index));
            String member = teams.get(index);
            if (!group1.contains(member)) {
                teams.remove(index);
                group1.add(member);
            }
        }
        group2 = teams;
        System.out.println("Here are your groups:");
        System.out.println("Group 1: " + group1);
        System.out.println("Group 2: " + group2);
        //Generating Group 1 Rounds
        System.out.println("Here is the arrangement for group 1");
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                roundA++;
                roundMembers = group1.get(i) + group1.get(j);
                System.out.println("Round " + roundA + ":" + group1.get(i) + " will play against " + group1.get(j));
            }
        }
        // Creating two lists: one for first team members of round one for second team members
        firstMatchMemberGroup1.add(group1.get(0));
        firstMatchMemberGroup1.add(group1.get(0));
        firstMatchMemberGroup1.add(group1.get(0));
        firstMatchMemberGroup1.add(group1.get(1));
        firstMatchMemberGroup1.add(group1.get(1));
        firstMatchMemberGroup1.add(group1.get(2));
        secondMatchMemberGroup1.add(group1.get(1));
        secondMatchMemberGroup1.add(group1.get(2));
        secondMatchMemberGroup1.add(group1.get(3));
        secondMatchMemberGroup1.add(group1.get(2));
        secondMatchMemberGroup1.add(group1.get(3));
        secondMatchMemberGroup1.add(group1.get(3));
        //Generating group 2 rounds
        System.out.println(" ");
        System.out.println("Here is the arrangement for group 2");
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                roundB++;
                roundMembers = group2.get(i) + group2.get(j);
                System.out.println("Round " + roundB + ":" + group2.get(i) + " will play against " + group2.get(j));
            }
        }
        // Creating two lists: one for first team members of round one for second team members
        firstMatchMemberGroup2.add(group2.get(0));
        firstMatchMemberGroup2.add(group2.get(0));
        firstMatchMemberGroup2.add(group2.get(0));
        firstMatchMemberGroup2.add(group2.get(1));
        firstMatchMemberGroup2.add(group2.get(1));
        firstMatchMemberGroup2.add(group2.get(2));
        secondMatchMemberGroup2.add(group2.get(1));
        secondMatchMemberGroup2.add(group2.get(2));
        secondMatchMemberGroup2.add(group2.get(3));
        secondMatchMemberGroup2.add(group2.get(2));
        secondMatchMemberGroup2.add(group2.get(3));
        secondMatchMemberGroup2.add(group2.get(3));
        //Printing round arrangements (first team members and second team members) for both groups
        System.out.println("First teams in group 1: " + firstMatchMemberGroup1);
        System.out.println("Second teams in group 1: " + secondMatchMemberGroup1);
        System.out.println("First teams in group 2: " + firstMatchMemberGroup2);
        System.out.println("Second teams in group 2: " + secondMatchMemberGroup2);
        //Generating scores for each team
        //Group 1:
        int firstMatchGroup1Team1 = (int) (Math.random() * (10 + 1) + 0);
        firstMatchMemberScoreGroup1.add(firstMatchGroup1Team1);
        int firstMatchGroup1Team2 = (int) (Math.random() * (10 + 1) + 0);
        firstMatchMemberScoreGroup1.add(firstMatchGroup1Team2);
        int firstMatchGroup1Team3 = (int) (Math.random() * (10 + 1) + 0);
        firstMatchMemberScoreGroup1.add(firstMatchGroup1Team3);
        int firstMatchGroup1Team4 = (int) (Math.random() * (10 + 1) + 0);
        firstMatchMemberScoreGroup1.add(firstMatchGroup1Team4);
        int firstMatchGroup1Team5 = (int) (Math.random() * (10 + 1) + 0);
        firstMatchMemberScoreGroup1.add(firstMatchGroup1Team5);
        int firstMatchGroup1Team6 = (int) (Math.random() * (10 + 1) + 0);
        firstMatchMemberScoreGroup1.add(firstMatchGroup1Team6);
        // Group 2:
        int secondMatchGroup1Team1 = (int) (Math.random() * (10 + 1) + 0);
        secondMatchMemberScoreGroup1.add(secondMatchGroup1Team1);
        int secondMatchGroup1Team2 = (int) (Math.random() * (10 + 1) + 0);
        secondMatchMemberScoreGroup1.add(secondMatchGroup1Team2);
        int secondMatchGroup1Team3 = (int) (Math.random() * (10 + 1) + 0);
        secondMatchMemberScoreGroup1.add(secondMatchGroup1Team3);
        int secondMatchGroup1Team4 = (int) (Math.random() * (10 + 1) + 0);
        secondMatchMemberScoreGroup1.add(secondMatchGroup1Team4);
        int secondMatchGroup1Team5 = (int) (Math.random() * (10 + 1) + 0);
        secondMatchMemberScoreGroup1.add(secondMatchGroup1Team5);
        int secondMatchGroup1Team6 = (int) (Math.random() * (10 + 1) + 0);
        secondMatchMemberScoreGroup1.add(secondMatchGroup1Team6);
        //Finding winners for each round (Group 1)
        if (firstMatchMemberScoreGroup1.get(0) > secondMatchMemberScoreGroup1.get(0)) {
            Member1Team1Group1Status += 3;
        } else if (firstMatchMemberScoreGroup1.get(0) < secondMatchMemberScoreGroup1.get(0)) {
            Member2Team1Group1Status += 3;
        } else {
            Member1Team1Group1Status += 1;
            Member2Team1Group1Status += 1;
        }
        if (firstMatchMemberScoreGroup1.get(1) > secondMatchMemberScoreGroup1.get(1)) {
            Member1Team2Group1Status += 3;
        } else if (firstMatchMemberScoreGroup1.get(1) < secondMatchMemberScoreGroup1.get(1)) {
            Member2Team2Group1Status += 3;
        } else {
            Member1Team2Group1Status += 1;
            Member2Team2Group1Status += 1;
        }
        if (firstMatchMemberScoreGroup1.get(2) > secondMatchMemberScoreGroup1.get(2)) {
            Member1Team3Group1Status += 3;
        } else if (firstMatchMemberScoreGroup1.get(2) < secondMatchMemberScoreGroup1.get(2)) {
            Member2Team3Group1Status += 3;
        } else {
            Member1Team3Group1Status += 1;
            Member2Team3Group1Status += 1;
        }
        if (firstMatchMemberScoreGroup1.get(3) > secondMatchMemberScoreGroup1.get(3)) {
            Member1Team4Group1Status += 3;
        } else if (firstMatchMemberScoreGroup1.get(3) < secondMatchMemberScoreGroup1.get(3)) {
            Member2Team4Group1Status += 3;
        } else {
            Member1Team4Group1Status += 1;
            Member2Team4Group1Status += 1;
        }
        if (firstMatchMemberScoreGroup1.get(4) > secondMatchMemberScoreGroup1.get(4)) {
            Member1Team5Group1Status += 3;
        } else if (firstMatchMemberScoreGroup1.get(4) < secondMatchMemberScoreGroup1.get(4)) {
            Member2Team5Group1Status += 3;
        } else {
            Member1Team5Group1Status += 1;
            Member2Team5Group1Status += 1;
        }
        if (firstMatchMemberScoreGroup1.get(5) > secondMatchMemberScoreGroup1.get(5)) {
            Member1Team6Group1Status += 3;
        } else if (firstMatchMemberScoreGroup1.get(5) < secondMatchMemberScoreGroup1.get(5)) {
            Member2Team6Group1Status += 3;
        } else {
            Member1Team6Group1Status += 1;
            Member2Team6Group1Status += 1;
        }
        //Group 1 standings for each round
        System.out.println("Here are the standings for group 1:");
        System.out.println(" ");
        System.out.println("Round 1: " + firstMatchMemberGroup1.get(0) + " scored " + firstMatchMemberScoreGroup1.get(0) + " goals" + " | " + secondMatchMemberGroup1.get(0) + " scored " + secondMatchMemberScoreGroup1.get(0) + " goals");
        System.out.println(firstMatchMemberGroup1.get(0) + " now has a point total of " + Member1Team1Group1Status + " | " + secondMatchMemberGroup1.get(0) + " now has a point total of " + Member2Team1Group1Status);
        if (Member1Team1Group1Status > Member2Team1Group1Status) {
            System.out.println("The winner is " + firstMatchMemberGroup1.get(0));
            group1Winners.add(firstMatchMemberGroup1.get(0));
            group1WinnerScores.add(firstMatchMemberScoreGroup1.get(0));
        } else if (Member2Team1Group1Status > Member1Team1Group1Status) {
            System.out.println("The winner is " + secondMatchMemberGroup1.get(0));
            group1Winners.add(secondMatchMemberGroup1.get(0));
            group1WinnerScores.add(secondMatchMemberScoreGroup1.get(0));
        } else {
            if (firstMatchGroup1Team1 > secondMatchGroup1Team1) {
                System.out.println("The winner is " + firstMatchMemberGroup1.get(0));
                group1Winners.add(firstMatchMemberGroup1.get(0));
                group1WinnerScores.add(firstMatchMemberScoreGroup1.get(0));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup1.get(0));
                group1Winners.add(secondMatchMemberGroup1.get(0));
                group1WinnerScores.add(secondMatchMemberScoreGroup1.get(0));
            }
        }
        System.out.println("Round 2: " + firstMatchMemberGroup1.get(1) + " scored " + firstMatchMemberScoreGroup1.get(1) + " goals" + " | " + secondMatchMemberGroup1.get(1) + " scored " + secondMatchMemberScoreGroup1.get(1) + " goals");
        System.out.println(firstMatchMemberGroup1.get(1) + " now has a point total of " + Member1Team2Group1Status + " | " + secondMatchMemberGroup1.get(1) + " now has a point total of " + Member2Team2Group1Status);
        if (Member1Team2Group1Status > Member2Team2Group1Status) {
            System.out.println("The winner is " + firstMatchMemberGroup1.get(1));
            group1Winners.add(firstMatchMemberGroup1.get(1));
            group1WinnerScores.add(firstMatchMemberScoreGroup1.get(1));
        } else if (Member2Team2Group1Status > Member1Team2Group1Status) {
            System.out.println("The winner is " + secondMatchMemberGroup1.get(1));
            group1Winners.add(secondMatchMemberGroup1.get(1));
            group1WinnerScores.add(secondMatchMemberScoreGroup1.get(1));
        } else {
            if (firstMatchGroup1Team2 > secondMatchGroup1Team2) {
                System.out.println("The winner is " + firstMatchMemberGroup1.get(1));
                group1Winners.add(firstMatchMemberGroup1.get(1));
                group1WinnerScores.add(firstMatchMemberScoreGroup1.get(1));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup1.get(1));
                group1Winners.add(secondMatchMemberGroup1.get(1));
                group1WinnerScores.add(secondMatchMemberScoreGroup1.get(1));
            }
        }
        System.out.println("Round 3: " + firstMatchMemberGroup1.get(2) + " scored " + firstMatchMemberScoreGroup1.get(2) + " goals" + " | " + secondMatchMemberGroup1.get(2) + " scored " + secondMatchMemberScoreGroup1.get(2) + " goals");
        System.out.println(firstMatchMemberGroup1.get(2) + " now has a point total of " + Member1Team3Group1Status + " | " + secondMatchMemberGroup1.get(2) + " now has a point total of " + Member2Team3Group1Status);
        if (Member1Team3Group1Status > Member2Team3Group1Status) {
            System.out.println("The winner is " + firstMatchMemberGroup1.get(2));
            group1Winners.add(firstMatchMemberGroup1.get(2));
            group1WinnerScores.add(firstMatchMemberScoreGroup1.get(2));
        } else if (Member2Team3Group1Status > Member1Team3Group1Status) {
            System.out.println("The winner is " + secondMatchMemberGroup1.get(2));
            group1Winners.add(secondMatchMemberGroup1.get(2));
            group1WinnerScores.add(secondMatchMemberScoreGroup1.get(2));
        } else {
            if (firstMatchGroup1Team3 > secondMatchGroup1Team3) {
                System.out.println("The winner is " + firstMatchMemberGroup1.get(2));
                group1Winners.add(firstMatchMemberGroup1.get(2));
                group1WinnerScores.add(firstMatchMemberScoreGroup1.get(2));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup1.get(2));
                group1Winners.add(secondMatchMemberGroup1.get(2));
                group1WinnerScores.add(secondMatchMemberScoreGroup1.get(2));
            }
        }
        System.out.println("Round 4: " + firstMatchMemberGroup1.get(3) + " scored " + firstMatchMemberScoreGroup1.get(3) + " goals" + " | " + secondMatchMemberGroup1.get(3) + " scored " + secondMatchMemberScoreGroup1.get(3) + " goals");
        System.out.println(firstMatchMemberGroup1.get(3) + " now has a point total of " + Member1Team4Group1Status + " | " + secondMatchMemberGroup1.get(3) + " now has a point total of " + Member2Team4Group1Status);
        if (Member1Team4Group1Status > Member2Team4Group1Status) {
            System.out.println("The winner is " + firstMatchMemberGroup1.get(3));
            group1Winners.add(firstMatchMemberGroup1.get(3));
            group1WinnerScores.add(firstMatchMemberScoreGroup1.get(3));
        } else if (Member2Team4Group1Status > Member1Team4Group1Status) {
            System.out.println("The winner is " + secondMatchMemberGroup1.get(3));
            group1Winners.add(secondMatchMemberGroup1.get(3));
            group1WinnerScores.add(secondMatchMemberScoreGroup1.get(3));
        } else {
            if (firstMatchGroup1Team4 > secondMatchGroup1Team4) {
                System.out.println("The winner is " + firstMatchMemberGroup1.get(3));
                group1Winners.add(firstMatchMemberGroup1.get(3));
                group1WinnerScores.add(firstMatchMemberScoreGroup1.get(3));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup1.get(3));
                group1Winners.add(secondMatchMemberGroup1.get(3));
                group1WinnerScores.add(secondMatchMemberScoreGroup1.get(3));
            }
        }
        System.out.println("Round 5: " + firstMatchMemberGroup1.get(4) + " scored " + firstMatchMemberScoreGroup1.get(4) + " goals" + " | " + secondMatchMemberGroup1.get(4) + " scored " + secondMatchMemberScoreGroup1.get(4) + " goals");
        System.out.println(firstMatchMemberGroup1.get(4) + " now has a point total of " + Member1Team5Group1Status + " | " + secondMatchMemberGroup1.get(4) + " now has a point total of " + Member2Team5Group1Status);
        if (Member1Team5Group1Status > Member2Team5Group1Status) {
            System.out.println("The winner is " + firstMatchMemberGroup1.get(4));
            group1Winners.add(firstMatchMemberGroup1.get(4));
            group1WinnerScores.add(firstMatchMemberScoreGroup1.get(4));
        } else if (Member2Team5Group1Status > Member1Team5Group1Status) {
            System.out.println("The winner is " + secondMatchMemberGroup1.get(4));
            group1Winners.add(secondMatchMemberGroup1.get(4));
            group1WinnerScores.add(secondMatchMemberScoreGroup1.get(4));
        } else {
            if (firstMatchGroup1Team5 > secondMatchGroup1Team5) {
                System.out.println("The winner is " + firstMatchMemberGroup1.get(4));
                group1Winners.add(firstMatchMemberGroup1.get(4));
                group1WinnerScores.add(firstMatchMemberScoreGroup1.get(4));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup1.get(4));
                group1Winners.add(secondMatchMemberGroup1.get(4));
                group1WinnerScores.add(secondMatchMemberScoreGroup1.get(4));
            }
        }
        System.out.println("Round 6: " + firstMatchMemberGroup1.get(5) + " scored " + firstMatchMemberScoreGroup1.get(5) + " goals" + " | " + secondMatchMemberGroup1.get(5) + " scored " + secondMatchMemberScoreGroup1.get(5) + " goals");
        System.out.println(firstMatchMemberGroup1.get(5) + " now has a point total of " + Member1Team6Group1Status + " | " + secondMatchMemberGroup1.get(5) + " now has a point total of " + Member2Team6Group1Status);
        if (Member1Team6Group1Status > Member2Team6Group1Status) {
            System.out.println("The winner is " + firstMatchMemberGroup1.get(5));
            group1Winners.add(firstMatchMemberGroup1.get(5));
            group1WinnerScores.add(firstMatchMemberScoreGroup1.get(5));
        } else if (Member2Team6Group1Status > Member1Team6Group1Status) {
            System.out.println("The winner is " + secondMatchMemberGroup1.get(5));
            group1Winners.add(secondMatchMemberGroup1.get(5));
            group1WinnerScores.add(secondMatchMemberScoreGroup1.get(5));
        } else {
            if (firstMatchGroup1Team6 > secondMatchGroup1Team6) {
                System.out.println("The winner is " + firstMatchMemberGroup1.get(5));
                group1Winners.add(firstMatchMemberGroup1.get(5));
                group1WinnerScores.add(firstMatchMemberScoreGroup1.get(5));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup1.get(5));
                group1Winners.add(secondMatchMemberGroup1.get(5));
                group1WinnerScores.add(secondMatchMemberScoreGroup1.get(5));
            }
        }
        //Generating scores for group 2 teams
        int firstMatchGroup2Team1 = (int) (Math.random() * (10 + 1) + 0);
        firstMatchMemberScoreGroup2.add(firstMatchGroup2Team1);
        int firstMatchGroup2Team2 = (int) (Math.random() * (10 + 1) + 0);
        firstMatchMemberScoreGroup2.add(firstMatchGroup2Team2);
        int firstMatchGroup2Team3 = (int) (Math.random() * (10 + 1) + 0);
        firstMatchMemberScoreGroup2.add(firstMatchGroup2Team3);
        int firstMatchGroup2Team4 = (int) (Math.random() * (10 + 1) + 0);
        firstMatchMemberScoreGroup2.add(firstMatchGroup2Team4);
        int firstMatchGroup2Team5 = (int) (Math.random() * (10 + 1) + 0);
        firstMatchMemberScoreGroup2.add(firstMatchGroup2Team5);
        int firstMatchGroup2Team6 = (int) (Math.random() * (10 + 1) + 0);
        firstMatchMemberScoreGroup2.add(firstMatchGroup2Team6);

        int secondMatchGroup2Team1 = (int) (Math.random() * (10 + 1) + 0);
        secondMatchMemberScoreGroup2.add(secondMatchGroup2Team1);
        int secondMatchGroup2Team2 = (int) (Math.random() * (10 + 1) + 0);
        secondMatchMemberScoreGroup2.add(secondMatchGroup2Team2);
        int secondMatchGroup2Team3 = (int) (Math.random() * (10 + 1) + 0);
        secondMatchMemberScoreGroup2.add(secondMatchGroup2Team3);
        int secondMatchGroup2Team4 = (int) (Math.random() * (10 + 1) + 0);
        secondMatchMemberScoreGroup2.add(secondMatchGroup2Team4);
        int secondMatchGroup2Team5 = (int) (Math.random() * (10 + 1) + 0);
        secondMatchMemberScoreGroup2.add(secondMatchGroup2Team5);
        int secondMatchGroup2Team6 = (int) (Math.random() * (10 + 1) + 0);
        secondMatchMemberScoreGroup2.add(secondMatchGroup2Team6);
        //Finding winners for each round (Group 2)
        if (firstMatchMemberScoreGroup2.get(0) > secondMatchMemberScoreGroup2.get(0)) {
            Member1Team1Group1Status += 3;
        } else if (firstMatchMemberScoreGroup2.get(0) < secondMatchMemberScoreGroup2.get(0)) {
            Member2Team1Group2Status += 3;
        } else {
            Member1Team1Group2Status += 1;
            Member2Team1Group2Status += 1;
        }
        if (firstMatchMemberScoreGroup2.get(1) > secondMatchMemberScoreGroup2.get(1)) {
            Member1Team2Group2Status += 3;
        } else if (firstMatchMemberScoreGroup2.get(1) < secondMatchMemberScoreGroup2.get(1)) {
            Member2Team2Group2Status += 3;
        } else {
            Member1Team2Group2Status += 1;
            Member2Team2Group2Status += 1;
        }
        if (firstMatchMemberScoreGroup2.get(2) > secondMatchMemberScoreGroup2.get(2)) {
            Member1Team3Group2Status += 3;
        } else if (firstMatchMemberScoreGroup2.get(2) < secondMatchMemberScoreGroup2.get(2)) {
            Member2Team3Group2Status += 3;
        } else {
            Member1Team3Group2Status += 1;
            Member2Team3Group2Status += 1;
        }
        if (firstMatchMemberScoreGroup2.get(3) > secondMatchMemberScoreGroup2.get(3)) {
            Member1Team4Group2Status += 3;
        } else if (firstMatchMemberScoreGroup2.get(3) < secondMatchMemberScoreGroup2.get(3)) {
            Member2Team4Group2Status += 3;
        } else {
            Member1Team4Group2Status += 1;
            Member2Team4Group2Status += 1;
        }
        if (firstMatchMemberScoreGroup2.get(4) > secondMatchMemberScoreGroup2.get(4)) {
            Member1Team5Group2Status += 3;
        } else if (firstMatchMemberScoreGroup2.get(4) < secondMatchMemberScoreGroup2.get(4)) {
            Member2Team5Group2Status += 3;
        } else {
            Member1Team5Group2Status += 1;
            Member2Team5Group2Status += 1;
        }
        //Group 2 standings for each round
        System.out.println(" ");
        System.out.println("Here are the standings for group 2:");
        System.out.println(" ");
        System.out.println("Round 1: " + firstMatchMemberGroup2.get(0) + " scored " + firstMatchMemberScoreGroup2.get(0) + " goals" + " | " + secondMatchMemberGroup2.get(0) + " scored " + secondMatchMemberScoreGroup2.get(0) + " goals");
        System.out.println(firstMatchMemberGroup2.get(0) + " now has a point total of " + Member1Team1Group2Status + " | " + secondMatchMemberGroup2.get(0) + " now has a point total of " + Member2Team1Group2Status);
        if (Member1Team1Group2Status > Member2Team1Group2Status) {
            System.out.println("The winner is " + firstMatchMemberGroup2.get(0));
            group2Winners.add(firstMatchMemberGroup2.get(0));
            group2WinnerScores.add(firstMatchMemberScoreGroup2.get(0));
        } else if (Member2Team1Group2Status > Member1Team1Group2Status) {
            System.out.println("The winner is " + secondMatchMemberGroup2.get(0));
            group2Winners.add(secondMatchMemberGroup2.get(0));
            group2WinnerScores.add(secondMatchMemberScoreGroup2.get(0));
        } else {
            if (firstMatchGroup2Team1 > secondMatchGroup2Team1) {
                System.out.println("The winner is " + firstMatchMemberGroup2.get(0));
                group2Winners.add(firstMatchMemberGroup2.get(0));
                group2WinnerScores.add(firstMatchMemberScoreGroup2.get(0));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup2.get(0));
                group2Winners.add(secondMatchMemberGroup2.get(0));
                group2WinnerScores.add(secondMatchMemberScoreGroup2.get(0));
            }
        }
        System.out.println("Round 2: " + firstMatchMemberGroup2.get(1) + " scored " + firstMatchMemberScoreGroup2.get(1) + " goals" + " | " + secondMatchMemberGroup2.get(1) + " scored " + secondMatchMemberScoreGroup2.get(1) + " goals");
        System.out.println(firstMatchMemberGroup2.get(1) + " now has a point total of " + Member1Team2Group2Status + " | " + secondMatchMemberGroup2.get(1) + " now has a point total of " + Member2Team2Group2Status);
        if (Member1Team2Group2Status > Member2Team2Group2Status) {
            System.out.println("The winner is " + firstMatchMemberGroup2.get(1));
            group2Winners.add(firstMatchMemberGroup2.get(1));
            group2WinnerScores.add(firstMatchMemberScoreGroup1.get(1));
        } else if (Member2Team2Group2Status > Member1Team2Group2Status) {
            System.out.println("The winner is " + secondMatchMemberGroup2.get(1));
            group2Winners.add(secondMatchMemberGroup2.get(1));
            group2WinnerScores.add(secondMatchMemberScoreGroup1.get(1));
        } else {
            if (firstMatchGroup2Team2 > secondMatchGroup2Team2) {
                System.out.println("The winner is " + firstMatchMemberGroup2.get(1));
                group2Winners.add(firstMatchMemberGroup2.get(1));
                group2WinnerScores.add(firstMatchMemberScoreGroup2.get(1));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup2.get(1));
                group2Winners.add(secondMatchMemberGroup2.get(1));
                group2WinnerScores.add(secondMatchMemberScoreGroup2.get(1));
            }
        }
        System.out.println("Round 3: " + firstMatchMemberGroup2.get(2) + " scored " + firstMatchMemberScoreGroup2.get(2) + " goals" + " | " + secondMatchMemberGroup2.get(2) + " scored " + secondMatchMemberScoreGroup2.get(2) + " goals");
        System.out.println(firstMatchMemberGroup2.get(2) + " now has a point total of " + Member1Team3Group2Status + " | " + secondMatchMemberGroup2.get(2) + " now has a point total of " + Member2Team3Group2Status);
        if (Member1Team3Group2Status > Member2Team3Group2Status) {
            System.out.println("The winner is " + firstMatchMemberGroup2.get(2));
            group2Winners.add(firstMatchMemberGroup2.get(2));
            group2WinnerScores.add(firstMatchMemberScoreGroup2.get(2));
        } else if (Member2Team3Group2Status > Member1Team3Group2Status) {
            System.out.println("The winner is " + secondMatchMemberGroup2.get(2));
            group2Winners.add(secondMatchMemberGroup2.get(2));
            group2WinnerScores.add(secondMatchMemberScoreGroup2.get(2));
        } else {
            if (firstMatchGroup1Team3 > secondMatchGroup2Team3) {
                System.out.println("The winner is " + firstMatchMemberGroup2.get(2));
                group2Winners.add(firstMatchMemberGroup2.get(2));
                group2WinnerScores.add(firstMatchMemberScoreGroup2.get(2));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup2.get(2));
                group2Winners.add(secondMatchMemberGroup2.get(2));
                group2WinnerScores.add(secondMatchMemberScoreGroup2.get(2));
            }
        }
        System.out.println("Round 4: " + firstMatchMemberGroup2.get(3) + " scored " + firstMatchMemberScoreGroup2.get(3) + " goals" + " | " + secondMatchMemberGroup2.get(3) + " scored " + secondMatchMemberScoreGroup2.get(3) + " goals");
        System.out.println(firstMatchMemberGroup2.get(3) + " now has a point total of " + Member1Team4Group2Status + " | " + secondMatchMemberGroup2.get(3) + " now has a point total of " + Member2Team4Group2Status);
        if (Member1Team4Group2Status > Member2Team4Group2Status) {
            System.out.println("The winner is " + firstMatchMemberGroup2.get(3));
            group2Winners.add(firstMatchMemberGroup2.get(3));
            group2WinnerScores.add(firstMatchMemberScoreGroup2.get(3));
        } else if (Member2Team4Group2Status > Member1Team4Group2Status) {
            System.out.println("The winner is " + secondMatchMemberGroup2.get(3));
            group2Winners.add(secondMatchMemberGroup2.get(3));
            group2WinnerScores.add(secondMatchMemberScoreGroup2.get(3));
        } else {
            if (firstMatchGroup2Team4 > secondMatchGroup2Team4) {
                System.out.println("The winner is " + firstMatchMemberGroup2.get(3));
                group2Winners.add(firstMatchMemberGroup2.get(3));
                group2WinnerScores.add(firstMatchMemberScoreGroup2.get(3));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup2.get(3));
                group2Winners.add(secondMatchMemberGroup2.get(3));
                group2WinnerScores.add(secondMatchMemberScoreGroup2.get(3));
            }
        }
        System.out.println("Round 5: " + firstMatchMemberGroup2.get(4) + " scored " + firstMatchMemberScoreGroup2.get(4) + " goals" + " | " + secondMatchMemberGroup2.get(4) + " scored " + secondMatchMemberScoreGroup2.get(4) + " goals");
        System.out.println(firstMatchMemberGroup2.get(4) + " now has a point total of " + Member1Team5Group2Status + " | " + secondMatchMemberGroup2.get(4) + " now has a point total of " + Member2Team5Group2Status);
        if (Member1Team5Group2Status > Member2Team5Group2Status) {
            System.out.println("The winner is " + firstMatchMemberGroup2.get(4));
            group2Winners.add(firstMatchMemberGroup2.get(4));
            group2WinnerScores.add(firstMatchMemberScoreGroup2.get(4));
        } else if (Member2Team5Group2Status > Member1Team5Group2Status) {
            System.out.println("The winner is " + secondMatchMemberGroup2.get(4));
            group2Winners.add(secondMatchMemberGroup2.get(4));
            group2WinnerScores.add(secondMatchMemberScoreGroup2.get(4));
        } else {
            if (firstMatchGroup2Team5 > secondMatchGroup2Team5) {
                System.out.println("The winner is " + firstMatchMemberGroup2.get(4));
                group2Winners.add(firstMatchMemberGroup2.get(4));
                group2WinnerScores.add(firstMatchMemberScoreGroup2.get(4));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup2.get(4));
                group2Winners.add(secondMatchMemberGroup2.get(4));
                group2WinnerScores.add(secondMatchMemberScoreGroup2.get(4));
            }
        }
        System.out.println("Round 6: " + firstMatchMemberGroup2.get(5) + " scored " + firstMatchMemberScoreGroup2.get(5) + " goals" + " | " + secondMatchMemberGroup2.get(5) + " scored " + secondMatchMemberScoreGroup2.get(5) + " goals");
        System.out.println(firstMatchMemberGroup2.get(5) + " now has a point total of " + Member1Team6Group2Status + " | " + secondMatchMemberGroup2.get(5) + " now has a point total of " + Member2Team6Group2Status);
        if (Member1Team6Group2Status > Member2Team6Group2Status) {
            System.out.println("The winner is " + firstMatchMemberGroup2.get(5));
            group2Winners.add(firstMatchMemberGroup2.get(5));
            group2WinnerScores.add(firstMatchMemberScoreGroup2.get(5));
        } else if (Member2Team6Group2Status > Member1Team6Group2Status) {
            System.out.println("The winner is " + secondMatchMemberGroup2.get(5));
            group2Winners.add(secondMatchMemberGroup2.get(5));
            group2WinnerScores.add(secondMatchMemberScoreGroup2.get(5));
        } else {
            if (firstMatchGroup2Team6 > secondMatchGroup2Team6) {
                System.out.println("The winner is " + firstMatchMemberGroup2.get(5));
                group2Winners.add(firstMatchMemberGroup2.get(5));
                group2WinnerScores.add(firstMatchMemberScoreGroup2.get(5));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup2.get(5));
                group2Winners.add(secondMatchMemberGroup2.get(5));
                group2WinnerScores.add(secondMatchMemberScoreGroup2.get(5));
            }
        }
        // Finding top 2 scores for group 1
        maxScore = Collections.max(group1WinnerScores);
        int maxScoreIndex = group1WinnerScores.indexOf(maxScore);
        group1PlayoffQualifiers.add(group1Winners.get(maxScoreIndex));
        if (group1WinnerScores.size() > 1) {
            maxScore = Collections.max(group1WinnerScores);
            int secondMaxScore = Integer.MIN_VALUE;
            for (int score : group1WinnerScores) {
                if (score != maxScore && score > secondMaxScore) {
                    secondMaxScore = score;
                    secondMaxIndex = group1WinnerScores.indexOf(secondMaxScore);
                } else if (score == maxScore && !group1PlayoffQualifiers.contains(group1Winners.get(secondMaxIndex))) {
                    secondMaxScore = score;
                }
            }
        }
        if (!group1PlayoffQualifiers.contains(group1Winners.get(secondMaxIndex))) {
            group1PlayoffQualifiers.add(group1Winners.get(secondMaxIndex));
        }
        System.out.println("Group 1 playoff qualifies: " + group1PlayoffQualifiers);
        // Finding top 2 scores for group 2
        maxScore2 = Collections.max(group2WinnerScores);
        int maxScoreIndex2 = group2WinnerScores.indexOf(maxScore);
        group2PlayoffQualifiers.add(group2Winners.get(maxScoreIndex));
        if (group2WinnerScores.size() > 1) {
            maxScore = Collections.max(group2WinnerScores);
            int secondMaxScore2 = Integer.MIN_VALUE;
            for (int score : group2WinnerScores) {
                if (score != maxScore2 && score > secondMaxScore2) {
                    secondMaxScore2 = score;
                    secondMaxIndex = group2WinnerScores.indexOf(secondMaxScore2);
                } else if (score == maxScore2 && !group2PlayoffQualifiers.contains(group2Winners.get(secondMaxIndex))) {
                    secondMaxScore2 = score;
                }
            }
        }
        if (!group2PlayoffQualifiers.contains(group2Winners.get(secondMaxIndex))) {
            group2PlayoffQualifiers.add(group2Winners.get(secondMaxIndex));
        }
        System.out.println("Group 2 playoff qualifiers" + group2PlayoffQualifiers);
        //Playoff Rounds Announced
        System.out.println("Round 1 of Playoffs: " + group1PlayoffQualifiers.get(0) + " V.S " + group2PlayoffQualifiers.get(1));
        System.out.println("Round 2 of Playoffs: " + group2PlayoffQualifiers.get(0) + " V.S " + group1PlayoffQualifiers.get(1));
        // Semi Finals Scores
        int firstPlaceGroup1 = (int) (Math.random() * (10 + 1) + 0);
        int firstPlaceGroup1Points = 0;
        firstPlacePlayoff.add(firstPlaceGroup1);
        int firstPlaceGroup2 = (int) (Math.random() * (10 + 1) + 0);
        int firstPlaceGroup2Points = 0;
        firstPlacePlayoff.add(firstPlaceGroup2);
        int secondPlaceGroup1 = (int) (Math.random() * (10 + 1) + 0);
        int secondPlaceGroup1Points = 0;
        if (firstPlacePlayoff.get(1) != secondPlaceGroup1) {
            secondPlacePlayoff.add(secondPlaceGroup1);
        }
        int secondPlaceGroup2 = (int) (Math.random() * (10 + 1) + 0);
        int secondPlaceGroup2Points = 0;
        if (firstPlacePlayoff.get(0) != secondPlaceGroup2) {
            secondPlacePlayoff.add(secondPlaceGroup2);
        }
        // Finding semi final winners
        if (firstPlacePlayoff.get(0) > secondPlacePlayoff.get(1)) {
            finalsQualifier.add(group1PlayoffQualifiers.get(0));
            firstPlaceGroup1Points += 3;
            highestScoreSemiFinals1 = firstPlacePlayoff.get(0);
            semiFinalsWinner1 = group1PlayoffQualifiers.get(0);
        } else {
            finalsQualifier.add(group2PlayoffQualifiers.get(1));
            secondPlaceGroup1Points += 3;
            highestScoreSemiFinals1 = secondPlacePlayoff.get(1);
            semiFinalsWinner1 = group2PlayoffQualifiers.get(1);
        }
        if (firstPlacePlayoff.get(1) > secondPlacePlayoff.get(0)) {
            finalsQualifier.add(group1PlayoffQualifiers.get(1));
            firstPlaceGroup2Points += 3;
            highestScoreSemiFinals2 = firstPlacePlayoff.get(1);
            semiFinalsWinner2 = group1PlayoffQualifiers.get(1);
        } else {
            finalsQualifier.add(group2PlayoffQualifiers.get(0));
            secondPlaceGroup1Points += 3;
            highestScoreSemiFinals2 = secondPlacePlayoff.get(0);
            semiFinalsWinner2 = group2PlayoffQualifiers.get(0);
        }
        //Semi final Standings
        System.out.println("Round 1: " + group1PlayoffQualifiers.get(0) + " scored " + firstPlaceGroup1 + " goals" + " | " + group2PlayoffQualifiers.get(1) + " scored " + secondPlaceGroup2 + " goals");
        System.out.println(group1PlayoffQualifiers.get(0) + " now has a point total of " + firstPlaceGroup1Points + " | " + group2PlayoffQualifiers.get(1) + " now has a point total of " + secondPlaceGroup2Points);
        System.out.println("Round 2: " + group2PlayoffQualifiers.get(0) + " scored " + firstPlaceGroup2 + " goals" + " | " + group1PlayoffQualifiers.get(1) + " scored " + secondPlaceGroup1 + " goals");
        System.out.println(group2PlayoffQualifiers.get(0) + " now has a point total of " + firstPlaceGroup2Points + " | " + group1PlayoffQualifiers.get(1) + " now has a point total of " + secondPlaceGroup1Points);
        System.out.println(finalsQualifier);
        System.out.println("Congrats!" + finalsQualifier.get(0) + " and " + finalsQualifier.get(1) + " will be competing in the finals");
        // Finding scores for finals
        int finalsQualifier1 = (int) (Math.random() * (10 + 1) + 0);
        int finalsQualifier1Points = 0;
        int finalsQualifier2 = (int) (Math.random() * (10 + 1) + 0);
        int finalsQualifier2Points = 0;
        if (finalsQualifier1 == finalsQualifier2) {
            finalsQualifier2 = (int) (Math.random() * (10 + 1) + 0);
        }
        //finals standings and winner announcement
        System.out.println("In the final game " + finalsQualifier.get(0) + " scored " + finalsQualifier1 + " goals " + " | " + finalsQualifier.get(1) + " scored " + finalsQualifier2 + " goals");
        System.out.println("In the final game " + finalsQualifier.get(0) + " finished with " + finalsQualifier1Points + " points " + " | " + finalsQualifier.get(1) + " finished with " + finalsQualifier2Points + " points");
        if (finalsQualifier1 > finalsQualifier2) {
            finalsQualifier1Points += 3;
            System.out.println("Congrats! Our tournament winner is: " + finalsQualifier.get(0));
            highestScoreFinals = finalsQualifier1;
            finalsWinner = finalsQualifier.get(0);
        } else {
            System.out.println("Congrats! Our tournament winner is: " + finalsQualifier.get(1));
            highestScoreFinals = finalsQualifier2;
            finalsWinner = finalsQualifier.get(1);
        }
        //Tournament Summary
        System.out.println("Tournament Summary:");
        System.out.println("The highest score in group 1 stage: " + maxScore + " made by: " + group1PlayoffQualifiers.get(0));
        System.out.println("The highest score in group 2 stage: " + maxScore2 + " made by: " + group1PlayoffQualifiers.get(0));
        System.out.println("The highest score in semi-finals round 1: " + highestScoreSemiFinals1 + " made by: " + semiFinalsWinner1);
        System.out.println("The highest score in semi-finals round 1: " + highestScoreSemiFinals2 + " made by: " + semiFinalsWinner2);
        System.out.println("The highest score in finals: " + highestScoreFinals + " made by: " + finalsWinner);
    }
}