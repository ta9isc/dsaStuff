class Solve{
    public static void main(String args[]){
        String s = "52";
        // System.out.print(Integer.valueOf(s));
        int n = Integer.valueOf(s);
        int mx = 0;
        while (n > 0){
            mx = Math.max(mx, n % 10);
            n /= 10;
        }
        System.out.print(mx);
    }
}