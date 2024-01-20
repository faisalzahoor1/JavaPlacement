public class StrictlyIncreasing {
    public static boolean incres(int[] array, int indx){
        if (indx == array.length-1) {
            return true;
        }
        if (array[indx]>array[indx+1]) {
            return incres(array, indx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,3};
        System.out.print(incres(array, 0));
    }
}
