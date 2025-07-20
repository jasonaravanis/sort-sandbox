fun mergeSort(arr: IntArray) {
    val temp = IntArray(arr.size)
    mergeSortHelper(arr, temp, 0, arr.size - 1)
}

private fun mergeSortHelper(
    arr: IntArray,
    temp: IntArray,
    left: Int,
    right: Int,
) {
    if (left >= right) return

    val mid = (left + right) / 2
    mergeSortHelper(arr, temp, left, mid)
    mergeSortHelper(arr, temp, mid + 1, right)
    merge(arr, temp, left, mid, right)
}

fun merge(
    arr: IntArray,
    temp: IntArray,
    left: Int,
    mid: Int,
    right: Int,
) {
    // leftArrayLastIndex could be mid and rightArrayLastIndex could be right, but renamed for clarity
    var leftArrayIndex = left
    val leftArrayLastIndex = mid
    var rightArrayIndex = mid + 1
    val rightArrayLastIndex = right
    var tempArrayInsertionIndex = left

    // both left array and right array have elements
    while (leftArrayIndex <= leftArrayLastIndex && rightArrayIndex <= rightArrayLastIndex) {
        val leftArrayElement = arr[leftArrayIndex]
        val rightArrayElement = arr[rightArrayIndex]
        if (leftArrayElement < rightArrayElement) {
            temp[tempArrayInsertionIndex] = leftArrayElement
            leftArrayIndex++
        } else {
            temp[tempArrayInsertionIndex] = rightArrayElement
            rightArrayIndex++
        }
        tempArrayInsertionIndex++
    }

    // right array empty, left array still has elements
    while (leftArrayIndex <= leftArrayLastIndex) {
        val leftArrayElement = arr[leftArrayIndex]
        temp[tempArrayInsertionIndex] = leftArrayElement
        leftArrayIndex++
        tempArrayInsertionIndex++
    }

    // left array empty, right array still has elements
    while (rightArrayIndex <= rightArrayLastIndex) {
        val rightArrayElement = arr[rightArrayIndex]
        temp[tempArrayInsertionIndex] = rightArrayElement
        rightArrayIndex++
        tempArrayInsertionIndex++
    }

    for (i in left..right) {
        arr[i] = temp[i]
    }
}
