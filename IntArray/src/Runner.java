public class Runner {
    //exercises the ArrList class
    public static void main(String[] args) {
        //instantiate IntArray object
        IntArray iArr = new IntArray(10);
        int leng = iArr.size();

        //display size of array == number of array elements
        System.out.println("The number of array elements is: " + leng);

        //this method fills array with random numbers
        iArr.fillRand();
        //print out array to prove the fillRand method worked
        System.out.println("Array with 10 elements filled with random numbers between 1 and 6");
        System.out.println(iArr);

        //set a certain array element to a new value
        iArr.set(5, 6789);

        //display the value of the that new value at position 5 (you can change this index)
        System.out.println("The value of array element 5 is: " + iArr.get(5));

        //display all array data, watch for the changed element!
        System.out.println(iArr);

        //clear the array == delete the values and all the elements
        iArr.clear();

        //check if array is now empty
        if (iArr.isEmpty()) {
            System.out.println("iArr is empty\n");
        }

        //allocate new array elements
        iArr = new IntArray(100);

        //this method fills array with random numbers
        iArr.fillRand();
        //print out array to prove the fillRand method worked

        System.out.println("Array with 100 elements filled with random numbers between 1 and 6");
        System.out.println(iArr);

        //sort the array
        if(!iArr.isEmpty()){
            iArr.sort();
        }
        else System.out.println("Array is empty, nothing to sort");

        //print out array to prove the sort method worked
        System.out.println("Array after sorting\n");
        System.out.println(iArr);

    }
}

