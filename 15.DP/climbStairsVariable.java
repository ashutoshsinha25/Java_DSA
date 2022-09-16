import java.util.*;
public class climbStairsVariable {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int[] moves = new int[n];
        for(int i =0 ; i < n ; i++){
            moves[i] = scn.nextInt();
        }

        System.out.println(climbStairsVarJump_rec(0 , n , moves));
        int[] mem =new int[n+1];
        Arrays.fill(mem , -1);
        int ans = climbStairsVarJump_mem(0 , n , moves , mem);
        System.out.println(ans);

    }

    public static int climbStairsVarJump_rec(int currStep , int totalStep , int[] moves){
        if(currStep == totalStep){
            return 1;
        }
       
        int maxJump = moves[currStep];
        int ans = 0;
        for(int i = 1 ; i <= maxJump ; i++){
            if(currStep + i <=totalStep){
                int rres= climbStairsVarJump_rec(currStep + i , totalStep , moves);
                ans += rres;
            }
        }

        return ans;
    }

    public static int climbStairsVarJump_mem(int currStep , int totalStep , int[] moves , int[] mem){
        if(currStep == totalStep){
            return mem[currStep] = 1;
        }
        if(mem[currStep] != -1 ){
            return mem[currStep];
        } //use
        int maxJump = moves[currStep];
        int ans = 0;
        for(int i = 1 ; i <= maxJump ; i++){
            if(currStep + i <=totalStep){
                int rres= climbStairsVarJump_mem(currStep + i , totalStep , moves, mem);
                // mem[currStep+i] = rres;
                ans += rres;
            }
        }

        return mem[currStep] = ans; // store 
    }
}
