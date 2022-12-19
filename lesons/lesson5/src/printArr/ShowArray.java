package printArr;

public class ShowArray {
    public static void main(String[] args) {
        CreateArray createArray = new CreateArray(3);

        for (int i = 0; i < createArray.create().length; i++) {
            System.out.println(createArray.create()[i]);
        }
    }
}
