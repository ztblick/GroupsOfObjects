/**
 * RandArray
 *
 * This allows a user to create an array of random ints.
 * They specify the size of the array, as well as the
 * minimum and maximum values in the range of ints.
 *
 * @author ztblick
 *
 * Written on Oct. 19, 2023
 * For CS2 @ Menlo School
 * in Atherton, CA
 */

public class RandArrayCompleted {

    private int[] nums;
    private int min;
    private int max;

    public RandArrayCompleted(int size, int min, int max) {
        this.min = min;
        this.max = max;
        nums = new int[size];
    }

    public void fill(){
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
    }

    public String toString() {
        String s = "[";
        for (int i = 0; i < nums.length - 1; i++)
            s += i + ", ";
        s += nums[nums.length - 1] + "]";
        return s;
    }

    public static void main(String[] args) {
        RandArrayCompleted r = new RandArrayCompleted(10, 0, 5);
        r.fill();
        System.out.println(r);
    }
}
