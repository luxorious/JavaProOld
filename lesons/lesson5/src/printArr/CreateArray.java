package printArr;

import java.util.Random;

public class CreateArray {
    private int lengthArr;
    private int[] arr = new int[lengthArr];

    public CreateArray(int lengthArr) {
        this.lengthArr = lengthArr;
    }

    Random random = new Random();

    public int[] create(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        return arr;
    }
}
