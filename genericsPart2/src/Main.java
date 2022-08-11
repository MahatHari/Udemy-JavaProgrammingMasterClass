public class Main {

    public static void main(String[] args) {
	// write your code here

        FootballPlayer joe= new FootballPlayer("Joe");
        BaseballPlayer pat= new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<BaseballPlayer> baseballTeam= new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<FootballPlayer> adelaideCrows= new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

        Team<FootballPlayer> melbourne= new Team<>("Melbourne Crows");
        FootballPlayer banks= new FootballPlayer("Gordon Banks");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn Crows");
        FootballPlayer villa= new FootballPlayer("David Villa");
        hawthorn.addPlayer(villa);

        Team<FootballPlayer> fremantle= new Team<>("Freemantle ");
        FootballPlayer iniesta= new FootballPlayer("Iniesta Villa");
        hawthorn.addPlayer(iniesta);


        hawthorn.matchResult(fremantle, 1,0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2,1);
        adelaideCrows.matchResult(hawthorn, 2,1 );



        Team<SoccerPlayer> soccerTeam= new Team<>("Red Bull");
        soccerTeam.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        System.out.println("<===================================>");
        System.out.println("Rankings ");
        System.out.println(adelaideCrows.getName()+ " : "+ adelaideCrows.ranking());
        System.out.println(melbourne.getName()+ " : "+ melbourne.ranking());
        System.out.println(hawthorn.getName()+ " : "+ hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(melbourne.compareTo(hawthorn));

//        League table
        League<Team <FootballPlayer>> laliga= new League<>("La Liga");
        laliga.add(fremantle);
        laliga.add(adelaideCrows);
        laliga.add(hawthorn);
        laliga.add(melbourne);

        System.out.println("La liga table ");
        laliga.showLeagueTable();
    }
}
