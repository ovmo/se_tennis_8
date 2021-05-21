/*
    Code smell "Long Method" in method getScore()
    Code smell "Switch Statements" in method getScore()
    Code smell "Duplicate code" in method getScore()
        Solved (all 3 above) by
            "Extract Method"

    Code smell "public fields" (made name up myself)
        methods p1/p2 Score and the score int's are public, but should not get called outside the game
        Solved by
            "Hide Method"
            "Hide variable"

    Test smell "Magic Strings" used to certanly pass the test
        Solved by
            Didn't actually solve since the tests shouldn't be changed, but can be solved by testing different names for the players

    Code smell "Magic Strings/ Temporary Fields" that get only used in one (1) method (P1/P2res)
        solved by
            "Duplicate Observed Data"
            "Change value to reference"

    Code smell "Mysterious Name" SetP1/2Score
        it didn't Set the score, but added to it
        solved by
            Editing the method to actually set the score
                (made more sense than changing the name)

*/
public class TennisGame {
    private int P1point = 0;
    private int P2point = 0;

    private String player1Name;
    private String player2Name;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
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

        if (P1point == P2point && P1point >= 3)
        {
            return "Deuce";
        } else if (P1point == P2point)
        {
            return ScorePlayer(P1point) + "-All";
        }
        return ScorePlayer(P1point) + "-" + ScorePlayer(P2point);
    }

    private String ScorePlayer(int points) {
        if (points == 0)
            return "Love";
        else if (points == 1)
            return "Fifteen";
        else if (points == 2)
            return "Thirty";
        else if (points == 3)
            return "Forty";
        return "";
    }

    public void SetP1Score(int number) {
        P1point = number;
    }

    public void SetP2Score(int number) {
        P2point = number;
    }

    private void P1Score() {
        P1point++;
    }

    private void P2Score() {
        P2point++;
    }

    public void wonPoint(String player) {
        if (player == player1Name)
            P1Score();
        else
            P2Score();
    }
}