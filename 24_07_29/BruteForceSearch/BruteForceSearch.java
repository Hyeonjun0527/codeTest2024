public class BruteForceSearch{

    public static int bruteForceSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {4,2,7,1,3,6,5};
        int target = 3;

        int index = bruteForceSearch(arr, target);

        if(index != -1){
            System.out.printf("타겟값 %d 은 인덱스 %d 에 있습니다.\n", target,index);
        } else {
            System.out.printf("타겟값 %d 를 찾을 수 없습니다", target);
        }
    }


}