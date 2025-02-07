public class FirstDuplicateFinder {
    public static void main(String[] args) {
        int[] arr = {12, 9, 5, 8, 4, 5, 10}; 
        int firstDuplicate = findFirstDuplicate(arr);
        
        if (firstDuplicate != -1) {
            System.out.println("The first duplicate is: " + firstDuplicate);
        } else {
            System.out.println("No duplicates found.");
        }
    }

    public static int findFirstDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i]; 
                }
            }
        }
        return -1; 
    }
}
