fun insertionSort(arr: IntArray) {
    for (i in 1 until arr.size) {
        val valueToBeInserted = arr[i]
        var j = i - 1

        /*
        j is our reference
        while we are still looking at an array element
        AND
        the array element is greater than the value to be inserted

        set the next element to be equal to this one

        move to the previous element
         *  */
        while (j >= 0 && arr[j] > valueToBeInserted) {
            arr[j + 1] = arr[j]
            j--
        }

        /*
        When we are no longer on the array
        OR
        the element we are looking at is smaller than the value to be inserted

        set the next element to the value to be inserted
         *  */
        arr[j + 1] = valueToBeInserted
    }
}
