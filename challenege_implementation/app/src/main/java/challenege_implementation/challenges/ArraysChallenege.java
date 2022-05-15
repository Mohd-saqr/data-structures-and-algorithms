package challenege_implementation.challenges;

public class ArraysChallenege {

    public int[] reversArray(int[] arr) {
        int[] newArr = new int[arr.length];
        int count = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            newArr[count] = arr[i];
            count++;
        }
        return newArr;
    }

    public int[] insertShiftArray(int[]arr, int value){
        int mid=(arr.length/2);
        int []newArr = new int[arr.length+1];
        for (int i=0;i< arr.length;i++){
            if (i==mid){
                newArr[i]=value;
                continue;
            }
            else newArr[i]=arr[i];

        }
        return newArr;
    }

    public int []findSumRowArray(int [][] arr){
        int [] newArr= new int[arr.length];
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;i<arr[j].length;j++){
                sum+=arr[i][j];
            }
            newArr[i]=sum;
            sum=0;
        }
        return newArr;
    }
    public int Fibonacci(int n){
        if (n<=1)return n;
       return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
