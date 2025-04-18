import java.util.*;

public class Q_1 {
    static class Position implements Comparable<Position> {
        int x, y, waterCost;

        Position(int x, int y, int waterCost) {
            this.x = x;
            this.y = y;
            this.waterCost = waterCost;
        }

        @Override
        public int compareTo(Position other) {
            return Integer.compare(this.waterCost, other.waterCost);
        }
    }

    public static int calculateMinimumWater(int size, char[][] terrain) {
        int[][] movement = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        boolean[][] visitedCells = new boolean[size][size];
        PriorityQueue<Position> positionsQueue = new PriorityQueue<>();
        int startX = 0, startY = 0, goalX = 0, goalY = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (terrain[i][j] == 'S') {
                    startX = i;
                    startY = j;
                } else if (terrain[i][j] == 'E') {
                    goalX = i;
                    goalY = j;
                }
            }
        }
        positionsQueue.add(new Position(startX, startY, 0));
        while (!positionsQueue.isEmpty()) {
            Position current = positionsQueue.poll();
            if (visitedCells[current.x][current.y]) {
                continue;
            }
            visitedCells[current.x][current.y] = true;
            if (current.x == goalX && current.y == goalY) {
                return current.waterCost;
            }
            for (int[] move : movement) {
                int newX = current.x + move[0];
                int newY = current.y + move[1];
                if (newX >= 0 && newX < size && newY >= 0 && newY < size
                        && !visitedCells[newX][newY] && terrain[newX][newY] != 'M') {
                    int additionalWater = (terrain[current.x][current.y] == 'T' && terrain[newX][newY] == 'T') ? 0 : 1;
                    positionsQueue.add(new Position(newX, newY, current.waterCost + additionalWater));
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gridSize = Integer.parseInt(input.nextLine().trim());
        char[][] map = new char[gridSize][gridSize];
        for (int row = 0; row < gridSize; row++) {
            String line = input.nextLine().replaceAll("\\s+", "");
            map[row] = line.toCharArray();
        }
        int minimumWaterRequired = calculateMinimumWater(gridSize, map);
        System.out.println(minimumWaterRequired);
        input.close();
    }
}
