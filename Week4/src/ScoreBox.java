public class ScoreBox 
{
    private int score;
    ScoreBox(int score) 
    {
        if (score < 0) 
        {
            System.out.println("Score cannot be negative!");
            this.score = 0;
        } else 
        {
            this.score = score;
        }
    }

    void setScore(int newScore) 
    {
        if (newScore < 0) 
        {
            System.out.println("Score cannot be negative!");
        } else 
        {
            this.score = newScore;
        }
    }

    int getScore() 
    {
        return score;
    }

    public String toString() 
    {
        return "ScoreBox score= " + score;
    }
}