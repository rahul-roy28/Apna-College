import java.util.*;

public class Q_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfEdges = Integer.parseInt(in.nextLine());
        Map<String, List<String>> adjacencyList = new HashMap<>();
        Map<String, Integer> incomingEdges = new HashMap<>();

        for (int i = 0; i < numberOfEdges; i++) {
            String[] edgeNodes = in.nextLine().trim().split("\\s+");
            String source = edgeNodes[0];
            String destination = edgeNodes[1];

            adjacencyList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
            adjacencyList.putIfAbsent(destination, new ArrayList<>());

            incomingEdges.put(destination, incomingEdges.getOrDefault(destination, 0) + 1);
            incomingEdges.putIfAbsent(source, 0);
        }

        String[] targetNodes = in.nextLine().trim().split("\\s+");
        Map<String, Integer> nodeLevels = new HashMap<>();
        Queue<String> processingQueue = new LinkedList<>();

        for (String node : incomingEdges.keySet()) {
            if (incomingEdges.get(node) == 0) {
                processingQueue.offer(node);
                nodeLevels.put(node, 1);
            }
        }

        while (!processingQueue.isEmpty()) {
            String currentNode = processingQueue.poll();
            int currentLevel = nodeLevels.get(currentNode);

            for (String neighbor : adjacencyList.getOrDefault(currentNode, new ArrayList<>())) {
                incomingEdges.put(neighbor, incomingEdges.get(neighbor) - 1);
                if (incomingEdges.get(neighbor) == 0) {
                    processingQueue.offer(neighbor);
                    nodeLevels.put(neighbor, currentLevel + 1);
                }
            }
        }

        int levelSum = 0;
        for (String target : targetNodes) {
            levelSum += nodeLevels.getOrDefault(target, -1);
        }

        System.out.println(levelSum);
    }
}
