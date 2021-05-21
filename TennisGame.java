/*
    Code smell "Long Method" in method getScore()
    Code smell "Not used code" (not actual code smell name) - player1Name & player2Name
    Code smell "Switch Statements" in method getScore()
    Test smell "Hardcode of variables" used to certanly pass the test
    Code smell "Global Variables" that get only used in one (1) method
*/
public class TennisGame {
    public int P1point = 0;
    public int P2point = 0;

    private String player1Name;
    private String player2Name;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        /* String P1res = "";
        String P2res = "";
        String score = ""; */
        if (P1point - P2point ==1 && P2point >= 3) {
            return "Advantage " + player1Name;
        } else if (P2point - P1point==1 && P1point >= 3) {
            return "Advantage " + player2Name;
        }

        if (P1point >= 4  && (P1point - P2point) >= 2) {
            return "Win for " + player1Name;
        } else if (P2point >= 4 && (P2point - P1point) >= 2) {
            return "Win for " + player2Name;
        }

        return ScorePlayer(P1point) + "-" + ScorePlayer(P2point);


        /* if (P1point == P2point && P1point < 3) {
            if (P1point == 0)
                score = "Love";
            if (P1point == 1)
                score = "Fifteen";
            if (P1point == 2)
                score = "Thirty";
            return score + "-All";
            //return score;
        }
        else if (P1point == P2point && P1point >= 3)
            score = "Deuce";

        if (P1point > 0 && P2point == 0) {
            if (P1point == 1)
                P1res = "Fifteen";
            if (P1point == 2)
                P1res = "Thirty";
            if (P1point == 3)
                P1res = "Forty";

            P2res = "Love";
            score = P1res + "-" + P2res;
        }
        if (P2point > 0 && P1point == 0) {
            if (P2point == 1)
                P2res = "Fifteen";
            if (P2point == 2)
                P2res = "Thirty";
            if (P2point == 3)
                P2res = "Forty";

            P1res = "Love";
            score = P1res + "-" + P2res;
        }

        if (P1point > P2point && P1point < 4) {
            if (P1point == 2)
                P1res = "Thirty";
            if (P1point == 3)
                P1res = "Forty";
            if (P2point == 1)
                P2res = "Fifteen";
            if (P2point == 2)
                P2res = "Thirty";
            score = P1res + "-" + P2res;
        }
        if (P2point > P1point && P2point < 4) {
            if (P2point == 2)
                P2res = "Thirty";
            if (P2point == 3)
                P2res = "Forty";
            if (P1point == 1)
                P1res = "Fifteen";
            if (P1point == 2)
                P1res = "Thirty";
            score = P1res + "-" + P2res;
        }

        if (P1point > P2point && P2point >= 3) {
            score = "Advantage " + player1Name;
        } else if (P2point > P1point && P1point >= 3) {
            score = "Advantage " + player2Name;
        }

        if (P1point >= 4 && P2point >= 0 && (P1point - P2point) >= 2) {
            score = "Win for " + player1Name;
        } else if (P2point >= 4 && P1point >= 0 && (P2point - P1point) >= 2) {
            score = "Win for " + player2Name;
        }
        return score; */
    }

    public String ScorePlayer(int points) {
        String point = "";
        if (points == 1)
            point = "Fifteen";
        if (points == 2)
            point = "Thirty";
        if (points == 3)
            point = "Forty";
        return point;
    }

    public void SetP1Score(int number) {
        for (int i = 0; i < number; i++) {
            P1Score();
        }

    }

    public void SetP2Score(int number) {
        for (int i = 0; i < number; i++) {
            P2Score();
        }

    }

    public void P1Score() {
        P1point++;
    }

    public void P2Score() {
        P2point++;
    }

    public void wonPoint(String player) {
        if (player == player1Name)
            P1Score();
        else
            P2Score();
    }



    // public static void main(String[] args) {
    //     TennisGame tennis = new TennisGame ("jolijn", "Oscar");
    //     tennis.SetP1Score(1);
    //     tennis.SetP2Score(1);
    //     tennis.SetP1Score(1);
    //     tennis.SetP1Score(1);
    //     System.out.println(tennis.getScore());
    // }
}