class Solution {
    public class Point implements Comparable<Point> {
        int x;
        int y;
        int distance;
        int i;

        public Point(int x, int y, int distance, int i) {
            this.x = x;
            this.y = y;
            this.distance = distance;
            this.i = i;
        }

        @Override
        public int compareTo(Point p1) {
            // arrange all distances in ascending order
            return this.distance - p1.distance;
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> minHeap = new PriorityQueue<>();
        for (int i = 0; i < points.length; i++) {
            int distance = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            minHeap.add(new Point(points[i][0], points[i][1], distance, i));
        }
        int[][] result = new int[k][];
        for (int i = 0; i < k; i++) {
            Point point = minHeap.remove();
            result[i] = new int[]{points[point.i][0], points[point.i][1]};
        }
        return result;
    }
}
