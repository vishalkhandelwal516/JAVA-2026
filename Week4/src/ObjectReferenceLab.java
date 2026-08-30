public class ObjectReferenceLab {
    static void addBonus(ScoreBox b, int bonus)
    {
        b.setScore(b.getScore()+ bonus);
    }
    static void replaceLocally(ScoreBox b)
    {
        b = new ScoreBox(213);
        System.out.println("Local value for this object is: " + b.getScore());
    }
    static ScoreBox createScoreBox(int score)
    {
        return new ScoreBox(score);
    }
    public static void main(String[] args) 
    {
        System.out.println("=========================");

        System.out.println("Box A & Box B comparison: ");
        ScoreBox BoxA = new ScoreBox(200);
        ScoreBox BoxB = BoxA;
        System.out.println( "BoxA score: " + BoxA.getScore());
        System.out.println("Is Box A equals Box B ?" + (BoxA==BoxB));

        System.out.println("=========================");
        System.out.println("Mutation through Alias: ");
        BoxB.setScore(260);
        System.out.println( "BoxA score (new value): " + BoxA.getScore()); 
        System.out.println("Is Box A equals Box B ?" + (BoxA==BoxB));
        System.out.println("=========================");

        System.out.println("Incrementing Bonus in Box B: ");
        System.out.println( "BoxB initial score: " + BoxB.getScore()); 
        addBonus(BoxB, 50);
        System.out.println( "BoxB score (new): " + BoxB.getScore());
        System.out.println("=========================");

        System.out.println("Replacing value of BoxA Locally: ");
        replaceLocally(BoxA);
        System.out.println("=========================");

        System.out.println("Create new different objects: ");
        ScoreBox BoxC = createScoreBox(120);
        ScoreBox BoxD = createScoreBox(120);
        System.out.println("BoxC value: " + BoxC.getScore());
        System.out.println("BoxD value: " + BoxD.getScore());

        System.out.println("is BoxC equals BoxD? " + (BoxC==BoxD));
        
        System.out.println("=========================");





       

    }

}
