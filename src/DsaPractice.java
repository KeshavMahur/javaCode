public class DsaPractice {

    public int findEelementIndexByLinearSearch(int searchElem,int array[]){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == searchElem){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        DsaPractice dsaPractice = new DsaPractice();
        int a[] = {1,2,5,6,7,8};
        System.out.println(dsaPractice.findEelementIndexByLinearSearch(30,a));
    }
}
