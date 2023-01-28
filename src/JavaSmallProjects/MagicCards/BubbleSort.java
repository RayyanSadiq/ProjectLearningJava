package JavaSmallProjects.MagicCards;

public class BubbleSort {

    public static void sort(CardClass[] array){
        boolean isSorted;
        for (int x = 0; x < array.length; x++){
            isSorted = true;
            for (int y = 1; y < array.length - x;y++){
                if (array[y].getValue() < array[y-1].getValue()){
                    var temp = array[y];
                    array[y] = array[y-1];
                    array[y-1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted){
                return;
            }
        }

    }
}
