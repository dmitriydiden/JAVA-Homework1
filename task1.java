//Задача №1 Задан массив, например, nums = [1,7,3,6,5,6]. Написать программу, которая 
// найдет индекс i для этого массива такой, что сумма элементов с индексами < i 
// равна сумме элементов с индексами > i.
public class task1 {

    public static void main(String[] args) {
        int[] nums = new int[] {1,7,3,6,5,6};
        int sum1 = 0;
        int sum2 = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j<i) sum1+=nums[j];
                if (j>i) sum2+=nums[j];
            }
            if (sum1 == sum2) {
                System.out.printf("Индекс = %d!", i);
                k=1;
                break;
            }
            sum1 = 0;
            sum2 = 0;
        }
        if (k==0) {
            System.out.println("Такого индекса не существует!");
        }

    }
}