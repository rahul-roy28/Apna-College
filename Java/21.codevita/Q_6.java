import java.util.*;
import java.awt.geom.*;

public class Q_6 {

    static class Wire {
        int x_1, y_1, x_2, y_2;

        public Wire(int x_1, int y_1, int x_2, int y_2) {
            this.x_1 = x_1;
            this.y_1 = y_1;
            this.x_2 = x_2;
            this.y_2 = y_2;
        }
    }

    static class PointKey {
        double x, y;

        public PointKey(double x, double y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PointKey) {
                PointKey other = (PointKey) obj;
                return Math.abs(this.x - other.x) < 1e-9 && Math.abs(this.y - other.y) < 1e-9;
            }
            return false;
        }
        @Override
        public int hashCode() {
            return Objects.hash(Math.round(x * 1e9), Math.round(y * 1e9));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        Wire[] wires = new Wire[N];
        for (int i = 0; i < N; i++) {
            String[] coords = sc.nextLine().trim().split("\\s+");
            int x_1 = Integer.parseInt(coords[0]);
            int y_1 = Integer.parseInt(coords[1]);
            int x_2 = Integer.parseInt(coords[2]);
            int y_2 = Integer.parseInt(coords[3]);
            wires[i] = new Wire(x_1, y_1, x_2, y_2);
        }
        String animalThresholdsLine = sc.nextLine().trim();
        String[] animalPairs = animalThresholdsLine.split("\\s+");
        Map<String, Integer> animalThresholds = new HashMap<>();
        for (String pair : animalPairs) {
            String[] kv = pair.split(":");
            String animal = kv[0];
            int threshold = Integer.parseInt(kv[1]);
            animalThresholds.put(animal, threshold);
        }
        String animalTouched = sc.nextLine().trim();
        Map<PointKey, Set<Integer>> intersectionPoints = new HashMap<>();
        for (int i = 0; i < N; i++) {
            Wire w1 = wires[i];
            for (int j = i + 1; j < N; j++) {
                Wire w2 = wires[j];
                Point2D.Double intersection = getIntersectionPoint(w1, w2);
                if (intersection != null) {
                    if (isPointOnLineSegment(intersection, w1) && isPointOnLineSegment(intersection, w2)) {
                        PointKey pk = new PointKey(intersection.x, intersection.y);
                        intersectionPoints.putIfAbsent(pk, new HashSet<>());
                        intersectionPoints.get(pk).add(i);
                        intersectionPoints.get(pk).add(j);
                    }
                }
            }
        }
        double totalVoltage = 0.0;
        for (Map.Entry<PointKey, Set<Integer>> entry : intersectionPoints.entrySet()) {
            PointKey pk = entry.getKey();
            Set<Integer> wiresAtPoint = entry.getValue();
            int numWires = wiresAtPoint.size();
            List<Integer> cellCounts = new ArrayList<>();
            for (int wireIndex : wiresAtPoint) {
                Wire wire = wires[wireIndex];
                int cells1 = getCellsBetweenPoints(pk.x, pk.y, wire.x_1, wire.y_1);
                int cells2 = getCellsBetweenPoints(pk.x, pk.y, wire.x_2, wire.y_2);
                if (cells1 > 0) {
                    cellCounts.add(cells1);
                }
                if (cells2 > 0) {
                    cellCounts.add(cells2);
                }
            }
            int minCells = cellCounts.stream().mapToInt(Integer::intValue).min().orElse(0);
            double voltageAtPoint = numWires * minCells;
            totalVoltage += voltageAtPoint;
        }
        int animalThreshold = animalThresholds.getOrDefault(animalTouched, 0);
        if (totalVoltage >= animalThreshold) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        int numAnimals = animalThresholds.size();
        int animalsDie = 0;
        for (int threshold : animalThresholds.values()) {
            if (totalVoltage >= threshold) {
                animalsDie++;
            }
        }
        double probability = (double) animalsDie / numAnimals;
        System.out.printf("%.2f%n", probability);
    }
    private static Point2D.Double getIntersectionPoint(Wire w1, Wire w2) {
        double x_1 = w1.x_1, y_1 = w1.y_1, x_2 = w1.x_2, y_2 = w1.y_2;
        double x3 = w2.x_1, y3 = w2.y_1, x4 = w2.x_2, y4 = w2.y_2;
        double denom = (x_1 - x_2) * (y3 - y4) - (y_1 - y_2) * (x3 - x4);
        if (Math.abs(denom) < 1e-9) {
            return null;
        }
        double xi = ((x_1*y_2 - y_1*x_2)*(x3 - x4) - (x_1 - x_2)*(x3*y4 - y3*x4)) / denom;
        double yi = ((x_1*y_2 - y_1*x_2)*(y3 - y4) - (y_1 - y_2)*(x3*y4 - y3*x4)) / denom;
        return new Point2D.Double(xi, yi);
    }
    private static boolean isPointOnLineSegment(Point2D.Double p, Wire w) {
        double x = p.x, y = p.y;
        double x_1 = w.x_1, y_1 = w.y_1, x_2 = w.x_2, y_2 = w.y_2;
        double minX = Math.min(x_1, x_2) - 1e-9;
        double maxX = Math.max(x_1, x_2) + 1e-9;
        double minY = Math.min(y_1, y_2) - 1e-9;
        double maxY = Math.max(y_1, y_2) + 1e-9;
        return x >= minX && x <= maxX && y >= minY && y <= maxY;
    }
    private static int getCellsBetweenPoints(double x_1, double y_1, double x_2, double y_2) {
        int dx = (int)Math.round(Math.abs(x_2 - x_1));
        int dy = (int)Math.round(Math.abs(y_2 - y_1));
        int gcd = gcd(dx, dy);
        if (gcd == 0) {
            return 0;
        } else {
            return gcd;
        }
    }
    private static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}
