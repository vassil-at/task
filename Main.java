public static void main(String[] args) {
        int arr[] = { 1, 9, 3, 10, 4, 20, 2};
        ConsecutiveSequence(arr);
        }

public static void ConsecutiveSequence(int []a){
        Arrays.sort(a);

        int k =1;
        int n = a.length;
        int max_length=0;

        for(int i =0;i<n-1;i++){
        if(a[i]+1==a[i+1]){
        k++;
        if(i==n-2){
        max_length=Math.max(max_length,k);
        }
        }else{
        max_length=Math.max(max_length,k);
        k=1;
        }
        }

        System.out.println(max_length);
        }