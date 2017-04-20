package quiz;

import java.util.LinkedList;
import java.util.Queue;

public class RightNumber {
    //    规则是这样的：首先将第 1个数删除，紧接着将第 2 个数放到
    //    这串数的末尾，再将第 3 个数删除并将第 4 个数放到这串数的末尾，再将第 5 个数删除……
    //    直到剩下最后一个数，将最后一个数也删除。按照刚才删除的顺序，把这些删除的数连在一
    //    起就是结果
    public static String getRightNumber(String src) {
        char[] chars = src.toCharArray();
        StringBuilder sb = new StringBuilder();
        int length = src.length();
        int head = 0;
        int tail = length;
        while (head != tail) {
            head %= length;
            sb.append(chars[head]);
            head++;
            tail %= length;
            head %= length;
            chars[tail] = chars[head];
            head++;
            tail++;
        }
        return sb.toString();
    }

    //这其实是个追击问题，每次追一格，多少次能追上
    public static String getNumber(String src) {
        char[] chars = src.toCharArray();
        StringBuilder sb = new StringBuilder();
        int length = src.length();
        int head = 0;
        int tail = length;
        for (int i = 0; i < length; i++) {
            head %= length;
            sb.append(chars[head]);
            head++;
            tail %= length;
            head %= length;
            chars[tail] = chars[head];
            head++;
            tail++;
        }
        return sb.toString();
    }

    public static String get(String src) {
        Queue<Character> queue = new LinkedList<>();
        for (Character character : src.toCharArray()) {
            queue.offer(character);
        }
        StringBuilder sb = new StringBuilder();
        while (queue.size() != 0) {
            sb.append(queue.poll());
            if (queue.size() != 0) {
                queue.offer(queue.poll());
            }
        }
        return sb.toString();
    }
}
