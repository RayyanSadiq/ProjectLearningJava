package JavaSmallProjects.MagicCards;

public class BubbleSort {

    public static void sort(CardClass[] array){
        for (int x = 0; x < array.length; x++){
            for (int y = 1; y < array.length;y++){
                if (array[y].getValue() < array[y-1].getValue()){
                    var temp = array[y];
                    array[y] = array[y-1];
                    array[y-1] = temp;
                }
            }
        }

    }
}
