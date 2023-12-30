public class MaxMinNum {
    public static void main(String[] args) {
        int[] num = {12,23,34,45,56,67,78,132};
        System.out.println(maxNum(num));
        int maxNumber = maxNum(num);
        System.out.println(minNum(num,maxNumber));
    }
    public static int maxNum(int[] num) {
        int maxNum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > maxNum) {
                maxNum = num[i];
            }
        }
        return maxNum;
    }
    public static int minNum(int[] num, int maxNumber) {
        int minNum = maxNumber;
        for (int i = num.length-1; i >= 0; i--) {
            if (num[i] < minNum) {
                minNum = num[i];
            }
        }
        return minNum;
    }
}
