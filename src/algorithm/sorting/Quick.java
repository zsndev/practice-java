package algorithm.sorting;

import util.ArrayUtil;

public class Quick {

    public static void quickSort(int[] src, int left, int right) {
        if (left >= right) {
            return;
        }
        int leftCursor = left;
        int rightCursor = right;
        int baseNumber = src[left];
        while (leftCursor != rightCursor) {
            // 没有相遇，且不符合条件
            while (src[rightCursor] >= baseNumber && leftCursor < rightCursor) {
                rightCursor--;
            }
            while (src[leftCursor] <= baseNumber && leftCursor < rightCursor) {
                leftCursor++;
            }
            if (leftCursor != rightCursor) {
                ArrayUtil.exchange(src, leftCursor, rightCursor);
            }
        }
        int collisionIndex = leftCursor;
        ArrayUtil.exchange(src, left, collisionIndex);
        quickSort(src, left, collisionIndex - 1);
        quickSort(src, collisionIndex + 1, right);
    }

}
