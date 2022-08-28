package _12_collection;

import java.util.PriorityQueue;

/**
 * @author xuexuan
 * @date 2022-07-10 21:15:27
 */
record Point(int x, int y) {
    Point {
        x += 1;
        y += 1;
    }

    //    // 可以使用普通构造器替换紧凑型构造器
    //    Point(int x, int y) {
    //        this.x = x + 1;
    //        this.y = y + 1;
    //    }
}
