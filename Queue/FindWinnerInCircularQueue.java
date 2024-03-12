import java.util.LinkedList;
import java.util.Queue;

public class FindWinnerInCircularQueue {

    public static int findWinner(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                int removed = queue.poll();
                queue.offer(removed);
            }
            queue.poll();
        }

        return queue.poll();
    }

    public static void main(String[] args) {
        int n = 7; 
        int k = 3; 

        int winner = findWinner(n, k);

        System.out.println("The winner is Player " + winner);
    }
}
