import java.util.*;

class Solution {
    class Point {
        long x, y;
        Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public String[] solution(int[][] line) {
        List<Point> points = new ArrayList<>();
        
        for(int i = 0; i < line.length; i++) {
            for(int j = i+1; j < line.length; j++) {
                Point point = intersection(line[i][0], line[i][1], line[i][2],
                                           line[j][0], line[j][1], line[j][2]);
                if(point != null)
                    points.add(point);
            }
        }
        
        Point maxPoint = getMaxPoint(points);
        Point minPoint = getMinPoint(points);
        
        int width = (int) (maxPoint.x - minPoint.x + 1);
        int height = (int) (maxPoint.y - minPoint.y + 1);
        
        char[][] arr = new char[height][width];
        
        for(char[] row : arr) {
            Arrays.fill(row, '.');
        }
        
        for(Point p : points) {
            int x = (int) (p.x - minPoint.x);
            int y = (int) (maxPoint.y - p.y);
            arr[y][x] = '*';
        }
        
        String[] answer = new String[arr.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = new String(arr[i]);
        }
        
        return answer;
    }
    
    // 가장 큰 x, y 값 구하기
    public Point getMaxPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;
        
        for(Point p : points) {
            if(x < p.x)
                x = p.x;
            if(y < p.y)
                y = p.y;
        }
        return new Point(x, y);
    }
    
    // 가장 작은 x, y 값 구하기
    public Point getMinPoint(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;
        
        for(Point p : points) {
            if(x > p.x)
                x = p.x;
            if(y > p.y)
                y = p.y;
        }
        return new Point(x, y);
    }
    
    // 모든 교점을 구하고, 정수만 반환
    public Point intersection(long a, long b, long e, long c, long d, long f) {
        double x = (double) (b * f - e * d) / (a * d - b * c);
        double y = (double) (e * c - a * f) / (a * d - b * c);
        
        if(x % 1 != 0 || y % 1 != 0)
            return null;
        
        return new Point((long) x, (long) y);
    }
    
}