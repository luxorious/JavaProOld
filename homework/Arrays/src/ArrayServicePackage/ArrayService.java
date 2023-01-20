package ArrayServicePackage;

import java.util.ArrayList;

public class ArrayService {

    public boolean ifContains(int[] intArr, int number){
        for (Integer num : intArr) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }
}
