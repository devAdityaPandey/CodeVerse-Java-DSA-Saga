public class GridWays1 {
    public static int gridWays(int sr, int sc,int n, int m) {
        //basecase
        if(sr == n-1 && sc == m-1) {
            return 1;
        } else if(sr==9 || sc==9) {
            return 0;
        }
        //recursion
        int w1 = gridWays(sr, sc+1, n, m);
        int w2 = gridWays(sr+1, sc, n, m);
        return w1+w2;
    }
    public static void main(String args[]) {
        int n = 3, m = 3;
        System.out.println(gridWays(0, 0, n, m));
    }
}
