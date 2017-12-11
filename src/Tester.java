import java.util.Random;

public class Tester {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        swap(a);
        char b = getRandomRps();
        System.out.println();
        System.out.println(b);
        FortuneTeller fortuneTeller = new FortuneTeller();
    }

    public static void swap(int[] nums){
        int first = nums[0];
        int last = nums[nums.length-1];
        nums[0]=last;
        nums[nums.length-1] = first;
        for (int x = 0;x<=nums.length-1;x++) {
            System.out.print(nums[x]);
        }
    }

    public static char getRandomRps(){
        char [] rps = new char[14];
        rps[0] = 'r';
        rps[1] = 'r';
        rps[2] = 'r';
        rps[3] = 'p';
        rps[4] = 'p';
        rps[5] = 'p';
        rps[6] = 'p';
        rps[7] = 'p';
        rps[8] = 's';
        rps[9] = 's';
        rps[10] = 's';
        rps[11] = 's';
        rps[12] = 's';
        rps[13] = 's';
        Random random = new Random();
        return rps[random.nextInt(14)];
    }


}
