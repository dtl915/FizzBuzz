package lab1;

public class Reduce {
    static void main() {
        reduce();
    }

    static int reduce() {
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
        return step;
    }
    static int reduce(int curr) {
        int step = 0;
        while (curr>0){
            if (curr % 2 == 1){
                curr -= 1;
            }
            else {
                curr /=2;
            }
            step+=1;
        }
        return step;
    }
}
