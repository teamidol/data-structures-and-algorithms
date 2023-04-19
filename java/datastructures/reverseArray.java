(fm screenshot fm lecture)

int arr = [1, 2, 3, 4, 5, 6];

public static int[] reverseArray(int[] arr) {
  int index = 0;
  while (index < arr.length/2) {
    int temp = arr[index];
    arr[index] = arr[index - 1 - index];
    arr[index - 1 - index] = temp;
    index++;
  }
  return arr;
}

// int[] reversedArr = new int[arr.length];
// for (int i = arr.length-1, j=0; i >= 0; i--, j++) {
//     reversedArr[j] = arr[i];
// }
// return reversedArr;
