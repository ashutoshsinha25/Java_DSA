public class basics {
    public static void main(String[] args) {
        int n1 = 5; // binary : 101
        int n2 = 3; // binary : 011
        System.out.println("bitwise OR : " + (n1 | n2)); // ans 7 : 111 
        System.out.println("bitwise AND : " + (n1 & n2)); // ans 1 : 001
        System.out.println("bitwise XOR : " + (n1 ^  n2)); // ans 6 : 110
        System.out.println("bitwise negation : " + (~n1)); // ans -6
    }

     // 2:58:59 done 
    public static boolean isEven(int num){
        return (num & 1) == 0; // bitwise and
    }

    public static int numberOfSetBits(int num){ 
        // for(int pos = 0 ; pos <= 31 ; pos++){
        //     return -1;
        // }
        return -1;
    }

    public static int numberOfFlipsReqToMakeEqualNum(int num1 , int num2){
        return -1;
    }

    public static int firstSetBitFromLeft(int num){
        return -1;
    }

    public static int firstSetBitFromRight(int num){
        return -1;
    }

    public static boolean isKthBitSet(int num , int k ){
        return true;
    }

    public static boolean isKthBitUnset(int num , int k ){
        return true;
    }

    public static int flipKthBit(int num , int k ){
        return -1;
    }
}
