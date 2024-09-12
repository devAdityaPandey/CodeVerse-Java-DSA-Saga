public class Operations {

    public static void getIthBIt(int n, int i) {
        int bitmask = (1<<i);
        if((n & bitmask) != 0) {
            System.out.println("The ith bit is : 1");
        } else {
            System.out.println("The ith bit is 0");
        }
    }

    public static int setIthBit(int n, int i) {
        int bitmask = (1<<i);
        return (n | bitmask);
    }

    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1<<i);
        return (n & bitmask);
    }

    public static int updateIthBit(int n, int i, int x) {
        // if(x == 0) {
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }
        n = clearIthBit(n, i);
        int bitmask = x<<i;
        return (n | bitmask);
    }

    public static int clearIBits(int n, int i) {
        int bitmask =  (~0)<<i;
        return (n & bitmask);
    }

    public static int clearRangeOfBits(int n, int i, int j) {
        int bitMask = (1<<(i-1))|((~0)<<j+1);
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n) {
        // for(int i=0; i<50; i++) {
        //     int bitMask = (1<<i);
        //     if(n==bitMask) {
        //         System.out.println("The number is a power of 2...");
        //         return true;
        //     }
        // }
        // return false;

        // Acc to mam"
        return (n&(n-1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while(n!=0) {
            if((n&1)==1) {
                count++;
            }
            n=(n>>1);
        }
        return count;
    }
    public static void main(String args[]) {
        // getIthEle(5, 1);
        // getIthEle(8, 3);
        // getIthEle(10, 3);
        System.out.println(countSetBits(15));
    } 
}

// concepts of fast exponentiation are remaining...
// And yes don't forget to revise the old concepts as binary search...
 