public class SumOfOdd{
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1;i <=1000;i++){
            if(i % 2 == 0){
                sum =sum + i ;
            }
        }
        System.out.println("1000以内的偶合和为："+ sum);
    }
}