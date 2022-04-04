package day13generic;

public class MaxFinderGeneric {
    public static void main(String[] args) {
        String[] strings={"Apple","Banana","Peach"};
        Integer[] integers={3,4,5};
        Float[] floats={1.5f,3.5f,4.5f};
        max(strings);
        max(integers);
        max(floats);
    }

    public static <T extends Comparable>  void max(T[] strings){
        T max= strings[0];
        if(max.compareTo(strings[1])<0){
            max=strings[1];
        }
        if(max.compareTo(strings[2])<0){
            max=strings[2];
        }
        System.out.println(max);
    }
}
