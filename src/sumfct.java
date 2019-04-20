import java.util.Stack;

public class sumfct {

    public static int h(int a, int b){
        int result = a + b;
        return result;
    }

    public static boolean p(int in){
        return (in == 1);
    }

    public static int r(int var){
        return (var-1);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        System.out.print("Please give your n for the sum function: ");
        int n = In.readInt();
        while (!p(n)){
            s.push(n);
            n = r(n);
        }
        int result = 1;
        while (!s.empty()){
            n = s.pop();
            result = h(n, result);
        }
        System.out.println(" Your result of the sum function is: " + result);
    }
}
