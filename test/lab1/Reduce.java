package lab1;

public class Reduce {
    static void main() {
        int step = 0;
        int curr = 100;
        while (curr>0){
            if (curr % 2 == 1){
                curr -= 1;
            }
            else {
                curr /=2;
            }
            step+=1;
        }
        System.out.println(step);
    }
}
