import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        ArrayList<Integer> group1GroupStageStatus = new ArrayList<Integer>();
        ArrayList<Integer> group2GroupStageStatus = new ArrayList<Integer>();
        ArrayList<String> group1PlayoffQualifiers = new ArrayList<String>();
        int Member1Team1Group1Status = 0;
        group1GroupStageStatus.add(Member1Team1Group1Status);
        int Member1Team2Group1Status = 0;
        group1GroupStageStatus.add(Member1Team2Group1Status);
        int Member1Team3Group1Status = 0;
        group1GroupStageStatus.add(Member1Team3Group1Status);
        int Member1Team4Group1Status = 0;
        group1GroupStageStatus.add(Member1Team4Group1Status);
        int Member1Team5Group1Status = 0;
        group1GroupStageStatus.add(Member1Team5Group1Status);
        int Member1Team6Group1Status = 0;
        group1GroupStageStatus.add(Member1Team6Group1Status);
        int Member2Team1Group1Status = 0;
        group1GroupStageStatus.add(Member2Team1Group1Status);
        int Member2Team2Group1Status = 0;
        group1GroupStageStatus.add(Member2Team2Group1Status);
        int Member2Team3Group1Status = 0;
        group1GroupStageStatus.add(Member2Team3Group1Status);
        int Member2Team4Group1Status = 0;
        group1GroupStageStatus.add(Member2Team4Group1Status);
        int Member2Team5Group1Status = 0;
        group1GroupStageStatus.add(Member2Team5Group1Status);
        int Member2Team6Group1Status = 0;
        group1GroupStageStatus.add(Member2Team6Group1Status);
        //
        int Member1Team1Group2Status = 0;
        group1GroupStageStatus.add(Member1Team1Group2Status);
        int Member1Team2Group2Status = 0;
        group1GroupStageStatus.add(Member1Team2Group2Status);
        int Member1Team3Group2Status = 0;
        group1GroupStageStatus.add(Member1Team3Group2Status);
        int Member1Team4Group2Status = 0;
        group1GroupStageStatus.add(Member1Team4Group2Status);
        int Member1Team5Group2Status = 0;
        group1GroupStageStatus.add(Member1Team5Group2Status);
        int Member1Team6Group2Status = 0;
        group1GroupStageStatus.add(Member1Team6Group2Status);
        int Member2Team1Group2Status = 0;
        group1GroupStageStatus.add(Member2Team1Group2Status);
        int Member2Team2Group2Status = 0;
        group1GroupStageStatus.add(Member2Team2Group2Status);
        int Member2Team3Group2Status = 0;
        group1GroupStageStatus.add(Member2Team3Group2Status);
        int Member2Team4Group2Status = 0;
        group1GroupStageStatus.add(Member2Team4Group2Status);
        int Member2Team5Group2Status = 0;
        group1GroupStageStatus.add(Member2Team5Group2Status);
        int Member2Team6Group2Status = 0;
        group1GroupStageStatus.add(Member2Team6Group2Status);
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
        System.out.println(group1);
        System.out.println(group2);
        System.out.println("Here is the arrangement for group 1");
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                roundA++;
                roundMembers = group1.get(i) + group1.get(j);
                System.out.println("Round " + roundA + ":" + group1.get(i) + " will play against " + group1.get(j));
            }
        }
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
        System.out.println(" ");
        System.out.println("Here is the arrangement for group 2");
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                roundB++;
                roundMembers = group2.get(i) + group2.get(j);
                System.out.println("Round " + roundB + ":" + group2.get(i) + " will play against " + group2.get(j));
            }
        }
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
        System.out.println(firstMatchMemberGroup1);
        System.out.println(secondMatchMemberGroup1);
        System.out.println(firstMatchMemberGroup2);
        System.out.println(secondMatchMemberGroup2);
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

        if (firstMatchMemberScoreGroup1.get(0) > secondMatchMemberScoreGroup1.get(0)) {
            Member1Team1Group1Status = +3;
        } else if (firstMatchMemberScoreGroup1.get(0) < secondMatchMemberScoreGroup1.get(0)) {
            Member2Team1Group1Status = +3;
        } else {
            Member1Team1Group1Status = +1;
            Member2Team1Group1Status = +1;
        }
        if (firstMatchMemberScoreGroup1.get(1) > secondMatchMemberScoreGroup1.get(1)) {
            Member1Team2Group1Status = +3;
        } else if (firstMatchMemberScoreGroup1.get(1) < secondMatchMemberScoreGroup1.get(1)) {
            Member2Team2Group1Status = +3;
        } else {
            Member1Team2Group1Status = +1;
            Member2Team2Group1Status = +1;
        }
        if (firstMatchMemberScoreGroup1.get(2) > secondMatchMemberScoreGroup1.get(2)) {
            Member1Team3Group1Status = +3;
        } else if (firstMatchMemberScoreGroup1.get(2) < secondMatchMemberScoreGroup1.get(2)) {
            Member2Team3Group1Status = +3;
        } else {
            Member1Team3Group1Status = +1;
            Member2Team3Group1Status = +1;
        }
        if (firstMatchMemberScoreGroup1.get(3) > secondMatchMemberScoreGroup1.get(3)) {
            Member1Team4Group1Status = +3;
        } else if (firstMatchMemberScoreGroup1.get(3) < secondMatchMemberScoreGroup1.get(3)) {
            Member2Team4Group1Status = +3;
        } else {
            Member1Team4Group1Status = +1;
            Member2Team4Group1Status = +1;
        }
        if (firstMatchMemberScoreGroup1.get(4) > secondMatchMemberScoreGroup1.get(4)) {
            Member1Team5Group1Status = +3;
        } else if (firstMatchMemberScoreGroup1.get(4) < secondMatchMemberScoreGroup1.get(4)) {
            Member2Team5Group1Status = +3;
        } else {
            Member1Team5Group1Status = +1;
            Member2Team5Group1Status = +1;
        }
        if (firstMatchMemberScoreGroup1.get(5) > secondMatchMemberScoreGroup1.get(5)) {
            Member1Team6Group1Status = +3;
        } else if (firstMatchMemberScoreGroup1.get(5) < secondMatchMemberScoreGroup1.get(5)) {
            Member2Team6Group1Status = +3;
        } else {
            Member1Team6Group1Status = +1;
            Member2Team6Group1Status = +1;
        }
        System.out.println("Here are the standings for group 1:");
        System.out.println(" ");
        System.out.println("Round 1: " + firstMatchMemberGroup1.get(0) + " scored " + firstMatchMemberScoreGroup1.get(0) + " goals" + " | " + secondMatchMemberGroup1.get(0) + " scored " + secondMatchMemberScoreGroup1.get(0) + " goals");
        System.out.println(firstMatchMemberGroup1.get(0) + " now has a point total of " + Member1Team1Group1Status + " | " + secondMatchMemberGroup1.get(0) + " now has a point total of " + Member2Team1Group1Status);
        if (Member1Team1Group1Status > Member2Team1Group1Status) {
            System.out.println("The winner is " + firstMatchMemberGroup1.get(0));
        } else if (Member2Team1Group1Status > Member1Team1Group1Status) {
            System.out.println("The winner is " + secondMatchMemberGroup1.get(0));
        } else {
            if (firstMatchGroup1Team1 > secondMatchGroup1Team1) {
                System.out.println("The winner is " + firstMatchMemberGroup1.get(0));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup1.get(0));
            }
        }
        System.out.println("Round 2: " + firstMatchMemberGroup1.get(1) + " scored " + firstMatchMemberScoreGroup1.get(1) + " goals" + " | " + secondMatchMemberGroup1.get(1) + " scored " + secondMatchMemberScoreGroup1.get(1) + " goals");
        System.out.println(firstMatchMemberGroup1.get(1) + " now has a point total of " + Member1Team2Group1Status + " | " + secondMatchMemberGroup1.get(1) + " now has a point total of " + Member2Team2Group1Status);
        if (Member1Team2Group1Status > Member2Team2Group1Status) {
            System.out.println("The winner is " + firstMatchMemberGroup1.get(1));
        } else if (Member2Team2Group1Status > Member1Team2Group1Status) {
            System.out.println("The winner is " + secondMatchMemberGroup1.get(1));
        } else {
            if (firstMatchGroup1Team2 > secondMatchGroup1Team2) {
                System.out.println("The winner is " + firstMatchMemberGroup1.get(1));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup1.get(1));
            }
        }
        System.out.println("Round 3: " + firstMatchMemberGroup1.get(2) + " scored " + firstMatchMemberScoreGroup1.get(2) + " goals" + " | " + secondMatchMemberGroup1.get(2) + " scored " + secondMatchMemberScoreGroup1.get(2) + " goals");
        System.out.println(firstMatchMemberGroup1.get(2) + " now has a point total of " + Member1Team3Group1Status + " | " + secondMatchMemberGroup1.get(2) + " now has a point total of " + Member2Team3Group1Status);
        if (Member1Team3Group1Status > Member2Team3Group1Status) {
            System.out.println("The winner is " + firstMatchMemberGroup1.get(2));
        } else if (Member2Team3Group1Status > Member1Team3Group1Status) {
            System.out.println("The winner is " + secondMatchMemberGroup1.get(2));
        } else {
            if (firstMatchGroup1Team3 > secondMatchGroup1Team3) {
                System.out.println("The winner is " + firstMatchMemberGroup1.get(2));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup1.get(2));
            }
        }
        System.out.println("Round 4: " + firstMatchMemberGroup1.get(3) + " scored " + firstMatchMemberScoreGroup1.get(3) + " goals" + " | " + secondMatchMemberGroup1.get(3) + " scored " + secondMatchMemberScoreGroup1.get(3) + " goals");
        System.out.println(firstMatchMemberGroup1.get(3) + " now has a point total of " + Member1Team4Group1Status + " | " + secondMatchMemberGroup1.get(3) + " now has a point total of " + Member2Team4Group1Status);
        if (Member1Team4Group1Status > Member2Team4Group1Status) {
            System.out.println("The winner is " + firstMatchMemberGroup1.get(3));
        } else if (Member2Team4Group1Status > Member1Team4Group1Status) {
            System.out.println("The winner is " + secondMatchMemberGroup1.get(3));
        } else {
            if (firstMatchGroup1Team4 > secondMatchGroup1Team4) {
                System.out.println("The winner is " + firstMatchMemberGroup1.get(3));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup1.get(3));
            }
        }
        System.out.println("Round 5: " + firstMatchMemberGroup1.get(4) + " scored " + firstMatchMemberScoreGroup1.get(4) + " goals" + " | " + secondMatchMemberGroup1.get(4) + " scored " + secondMatchMemberScoreGroup1.get(4) + " goals");
        System.out.println(firstMatchMemberGroup1.get(4) + " now has a point total of " + Member1Team5Group1Status + " | " + secondMatchMemberGroup1.get(4) + " now has a point total of " + Member2Team5Group1Status);
        if (Member1Team5Group1Status > Member2Team5Group1Status) {
            System.out.println("The winner is " + firstMatchMemberGroup1.get(4));
        } else if (Member2Team5Group1Status > Member1Team5Group1Status) {
            System.out.println("The winner is " + secondMatchMemberGroup1.get(4));
        } else {
            if (firstMatchGroup1Team5 > secondMatchGroup1Team5) {
                System.out.println("The winner is " + firstMatchMemberGroup1.get(4));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup1.get(4));
            }
        }
        System.out.println("Round 6: " + firstMatchMemberGroup1.get(5) + " scored " + firstMatchMemberScoreGroup1.get(5) + " goals" + " | " + secondMatchMemberGroup1.get(5) + " scored " + secondMatchMemberScoreGroup1.get(5) + " goals");
        System.out.println(firstMatchMemberGroup1.get(5) + " now has a point total of " + Member1Team6Group1Status + " | " + secondMatchMemberGroup1.get(5) + " now has a point total of " + Member2Team6Group1Status);
        if (Member1Team6Group1Status > Member2Team6Group1Status) {
            System.out.println("The winner is " + firstMatchMemberGroup1.get(5));
        } else if (Member2Team6Group1Status > Member1Team6Group1Status) {
            System.out.println("The winner is " + secondMatchMemberGroup1.get(5));
        } else {
            if (firstMatchGroup1Team6 > secondMatchGroup1Team6) {
                System.out.println("The winner is " + firstMatchMemberGroup1.get(5));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup1.get(5));
            }
        }
        //
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

        if (firstMatchMemberScoreGroup2.get(0) > secondMatchMemberScoreGroup2.get(0)) {
            Member1Team1Group1Status = +3;
        } else if (firstMatchMemberScoreGroup2.get(0) < secondMatchMemberScoreGroup2.get(0)) {
            Member2Team1Group2Status = +3;
        } else {
            Member1Team1Group2Status = +1;
            Member2Team1Group2Status = +1;
        }
        if (firstMatchMemberScoreGroup2.get(1) > secondMatchMemberScoreGroup2.get(1)) {
            Member1Team2Group2Status = +3;
        } else if (firstMatchMemberScoreGroup2.get(1) < secondMatchMemberScoreGroup2.get(1)) {
            Member2Team2Group2Status = +3;
        } else {
            Member1Team2Group2Status = +1;
            Member2Team2Group2Status = +1;
        }
        if (firstMatchMemberScoreGroup2.get(2) > secondMatchMemberScoreGroup2.get(2)) {
            Member1Team3Group2Status = +3;
        } else if (firstMatchMemberScoreGroup2.get(2) < secondMatchMemberScoreGroup2.get(2)) {
            Member2Team3Group2Status = +3;
        } else {
            Member1Team3Group2Status = +1;
            Member2Team3Group2Status = +1;
        }
        if (firstMatchMemberScoreGroup2.get(3) > secondMatchMemberScoreGroup2.get(3)) {
            Member1Team4Group2Status = +3;
        } else if (firstMatchMemberScoreGroup2.get(3) < secondMatchMemberScoreGroup2.get(3)) {
            Member2Team4Group2Status = +3;
        } else {
            Member1Team4Group2Status = +1;
            Member2Team4Group2Status = +1;
        }
        if (firstMatchMemberScoreGroup2.get(4) > secondMatchMemberScoreGroup2.get(4)) {
            Member1Team5Group2Status = +3;
        } else if (firstMatchMemberScoreGroup2.get(4) < secondMatchMemberScoreGroup2.get(4)) {
            Member2Team5Group2Status = +3;
        } else {
            Member1Team5Group2Status = +1;
            Member2Team5Group2Status = +1;
        }
        if (firstMatchMemberScoreGroup2.get(5) > secondMatchMemberScoreGroup2.get(5)) {
            Member1Team6Group2Status = +3;
        } else if (firstMatchMemberScoreGroup2.get(5) < secondMatchMemberScoreGroup2.get(5)) {
            Member2Team6Group2Status = +3;
        } else {
            Member1Team6Group2Status = +1;
            Member2Team6Group2Status = +1;
        }
        System.out.println("Here are the standings for group 2:");
        System.out.println(" ");
        System.out.println("Round 1: " + firstMatchMemberGroup2.get(0) + " scored " + firstMatchMemberScoreGroup2.get(0) + " goals" + " | " + secondMatchMemberGroup2.get(0) + " scored " + secondMatchMemberScoreGroup2.get(0) + " goals");
        System.out.println(firstMatchMemberGroup2.get(0) + " now has a point total of " + Member1Team1Group1Status + " | " + secondMatchMemberGroup2.get(0) + " now has a point total of " + Member2Team1Group2Status);
        if (Member1Team1Group2Status > Member2Team1Group2Status) {
            System.out.println("The winner is " + firstMatchMemberGroup2.get(0));
        } else if (Member2Team1Group2Status > Member1Team1Group2Status) {
            System.out.println("The winner is " + secondMatchMemberGroup1.get(0));
        } else {
            if (firstMatchGroup2Team1 > secondMatchGroup2Team1) {
                System.out.println("The winner is " + firstMatchMemberGroup2.get(0));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup2.get(0));
            }
        }
        System.out.println("Round 2: " + firstMatchMemberGroup2.get(1) + " scored " + firstMatchMemberScoreGroup2.get(1) + " goals" + " | " + secondMatchMemberGroup2.get(1) + " scored " + secondMatchMemberScoreGroup2.get(1) + " goals");
        System.out.println(firstMatchMemberGroup2.get(1) + " now has a point total of " + Member1Team2Group2Status + " | " + secondMatchMemberGroup2.get(1) + " now has a point total of " + Member2Team2Group2Status);
        if (Member1Team2Group2Status > Member2Team2Group2Status) {
            System.out.println("The winner is " + firstMatchMemberGroup2.get(1));
        } else if (Member2Team2Group2Status > Member1Team2Group2Status) {
            System.out.println("The winner is " + secondMatchMemberGroup2.get(1));
        } else {
            if (firstMatchGroup2Team2 > secondMatchGroup2Team2) {
                System.out.println("The winner is " + firstMatchMemberGroup2.get(1));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup2.get(1));
            }
        }
        System.out.println("Round 3: " + firstMatchMemberGroup2.get(2) + " scored " + firstMatchMemberScoreGroup2.get(2) + " goals" + " | " + secondMatchMemberGroup2.get(2) + " scored " + secondMatchMemberScoreGroup2.get(2) + " goals");
        System.out.println(firstMatchMemberGroup2.get(2) + " now has a point total of " + Member1Team3Group2Status + " | " + secondMatchMemberGroup2.get(2) + " now has a point total of " + Member2Team3Group2Status);
        if (Member1Team3Group2Status > Member2Team3Group2Status) {
            System.out.println("The winner is " + firstMatchMemberGroup2.get(2));
        } else if (Member2Team3Group2Status > Member1Team3Group2Status) {
            System.out.println("The winner is " + secondMatchMemberGroup2.get(2));
        } else {
            if (firstMatchGroup1Team3 > secondMatchGroup2Team3) {
                System.out.println("The winner is " + firstMatchMemberGroup2.get(2));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup2.get(2));
            }
        }
        System.out.println("Round 4: " + firstMatchMemberGroup2.get(3) + " scored " + firstMatchMemberScoreGroup2.get(3) + " goals" + " | " + secondMatchMemberGroup2.get(3) + " scored " + secondMatchMemberScoreGroup2.get(3) + " goals");
        System.out.println(firstMatchMemberGroup2.get(3) + " now has a point total of " + Member1Team4Group2Status + " | " + secondMatchMemberGroup2.get(3) + " now has a point total of " + Member2Team4Group2Status);
        if (Member1Team4Group2Status > Member2Team4Group2Status) {
            System.out.println("The winner is " + firstMatchMemberGroup2.get(3));
        } else if (Member2Team4Group2Status > Member1Team4Group2Status) {
            System.out.println("The winner is " + secondMatchMemberGroup2.get(3));
        } else {
            if (firstMatchGroup2Team4 > secondMatchGroup2Team4) {
                System.out.println("The winner is " + firstMatchMemberGroup2.get(3));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup2.get(3));
            }
        }
        System.out.println("Round 5: " + firstMatchMemberGroup2.get(4) + " scored " + firstMatchMemberScoreGroup2.get(4) + " goals" + " | " + secondMatchMemberGroup2.get(4) + " scored " + secondMatchMemberScoreGroup2.get(4) + " goals");
        System.out.println(firstMatchMemberGroup2.get(4) + " now has a point total of " + Member1Team5Group1Status + " | " + secondMatchMemberGroup2.get(4) + " now has a point total of " + Member2Team5Group2Status);
        if (Member1Team5Group2Status > Member2Team5Group2Status) {
            System.out.println("The winner is " + firstMatchMemberGroup2.get(4));
        } else if (Member2Team5Group2Status > Member1Team5Group2Status) {
            System.out.println("The winner is " + secondMatchMemberGroup2.get(4));
        } else {
            if (firstMatchGroup2Team5 > secondMatchGroup2Team5) {
                System.out.println("The winner is " + firstMatchMemberGroup2.get(4));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup2.get(4));
            }
        }
        System.out.println("Round 6: " + firstMatchMemberGroup2.get(5) + " scored " + firstMatchMemberScoreGroup2.get(5) + " goals" + " | " + secondMatchMemberGroup2.get(5) + " scored " + secondMatchMemberScoreGroup2.get(5) + " goals");
        System.out.println(firstMatchMemberGroup2.get(5) + " now has a point total of " + Member1Team6Group2Status + " | " + secondMatchMemberGroup2.get(5) + " now has a point total of " + Member2Team6Group2Status);
        if (Member1Team6Group2Status > Member2Team6Group2Status) {
            System.out.println("The winner is " + firstMatchMemberGroup2.get(5));
        } else if (Member2Team6Group2Status > Member1Team6Group2Status) {
            System.out.println("The winner is " + secondMatchMemberGroup2.get(5));
        } else {
            if (firstMatchGroup2Team6 > secondMatchGroup2Team6) {
                System.out.println("The winner is " + firstMatchMemberGroup2.get(5));
            } else {
                System.out.println("The winner is " + secondMatchMemberGroup2.get(5));
            }
        }

    }
}