import java.util.*;

class Team implements Comparable<Team>{
    String name; int points;
    Team(String n,int p){name=n;points=p;}
    public int compareTo(Team o){return o.points-this.points;}
}

public class GamingTournament{
    public static void main(String[] args){
        TreeSet<Team> leaderboard=new TreeSet<>();
        leaderboard.add(new Team("Alpha",10));
        leaderboard.add(new Team("Beta",15));
        for(Team t:leaderboard) System.out.println(t.name);
    }
}