import java.util.Arrays;
import java.util.Scanner;

public class Team_Ratio
{
    public static double bestRatio(double[]ratioArray, String[]nameArray)
    {
        double bestRatioNum = ratioArray[0];
        int bestTeamIndex = 0;
        for (int i = 0; i < ratioArray.length; i++)
        {
            if (bestRatioNum < ratioArray[i])
            {
                bestRatioNum = ratioArray[i];
                bestTeamIndex = i;
            }
        }
        System.out.println("Team with best win/loss ratio: " + nameArray[bestTeamIndex]);
        System.out.println("Index of team: "+ bestTeamIndex);
        return bestRatioNum;
    }
    public static double worstRatio(double[]ratioArray, String[]nameArray)
    {
        double worstRatioNum = ratioArray[0];
        int worstTeamIndex = 0;
        for (int i = 0; i < ratioArray.length; i++)
        {
            if (worstRatioNum > ratioArray[i])
            {
                worstRatioNum = ratioArray[i];
                worstTeamIndex = i;
            }
        }
        System.out.println("Team with worst win/loss ratio: " + nameArray[worstTeamIndex]);
        System.out.println("Index of team: "+ worstTeamIndex);
        return worstTeamIndex;
    }

    public static double avgRatio(double[]myArray)
    {
        Arrays.sort(myArray);
        double avg = 0;
        for (int i = 0; i < myArray.length; i++)
        {
            avg += myArray[i];
        }
        avg = avg/ myArray.length;
        System.out.println("Average:");
        return avg;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many teams would you like to input?");
        int size = keyboard.nextInt();
        double[] teams = new double[size];
        String[] teamName = new String[size];
        for (int i = 0; i < teams.length; i++)
        {
            System.out.println("What is the name of team " + i + "?");
            String name = keyboard.next();
            System.out.println("What is the number of wins for team " + i + "?");
            int wins = keyboard.nextInt();
            System.out.println("What is the number of losses for team " + i + "?");
            int losses = keyboard.nextInt();

            double ratio = (wins*1.0) / (losses*1.0);
            teams[i] = ratio;
            teamName[i] = name;
        }
        System.out.println(java.util.Arrays.toString(teams));
        System.out.println(java.util.Arrays.toString(teamName));
        System.out.println(bestRatio(teams, teamName));
        System.out.println("");
        System.out.println(worstRatio(teams, teamName));
        System.out.println("");
        System.out.println(avgRatio(teams));
    }
}