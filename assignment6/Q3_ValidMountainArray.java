package ppt.assignment6;
// Leetcode #941. Valid Mountain Array

public class Q3_ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        if(arr.length==1||arr.length==2) return false;
        if(arr[0]>=arr[1]) return false;
        boolean flag = false;
        int i=0;
        for(i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]) flag = false;
            else break;
        }
        if(flag==false){
            i+=1;
            while(i<=arr.length-1){
                if(arr[i-1]>arr[i]) flag = true;
                else return false;
                i++;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        // Input: arr = [0,3,2,1]
        // Output: true
        System.out.println(validMountainArray(new int[]{0,3,2,1}));
    }
}
