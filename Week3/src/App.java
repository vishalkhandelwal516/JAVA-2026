public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayStatistics A = new ArrayStatistics();
        A.printSignCounts(new int[]{1,2,3,5,6,7,9});

        LinearSearchToolkit l = new LinearSearchToolkit();
        int[] ar= new int[]{1,2,1,2,1,2,1};
        int y = l.lastIndexOf(ar , 2);
        int y1 = l.firstIndexOf(ar, 2);
        boolean y2 = l.contains(ar, 1);
        int y3 = l.countOccurrences(ar, 1);
        System.out.println(y);
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
    }
}
