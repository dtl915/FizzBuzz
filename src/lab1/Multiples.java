package lab1;

public class Multiples {
    static void main() {
        int cnt = multiples(1000, 3, 5);
        System.out.println(cnt);
    }

    static int multiples(int n, int a, int b) {
        int cnt = 0;
        for (int i=0;i<n;i++)
        {
            if(i%a==0 || i%b==0)
            {
                cnt++;
            }

        }
        return cnt;
    }
}
