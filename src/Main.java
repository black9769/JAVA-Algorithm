import jdk.nashorn.internal.objects.annotations.Getter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static class Human {
        private int weight;
        private int height;

        public int getHeight() {
            return height;
        }

        public int getWeight() {
            return weight;
        }

        public Human(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int human = Integer.parseInt(br.readLine());
        List<Human> humanList = new ArrayList<>();

        for (int i = 0; i < human; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            Human human1 = new Human(weight, height);
            humanList.add(human1);
        }

        for (int i = 0; i < humanList.size(); i++) {
            int weightR = humanList.get(i).getWeight();
            int heightR = humanList.get(i).getHeight();
            int rank = 1;
            for (int j = 0; j < humanList.size(); j++) {
                if (i == j) continue;
                int weightL = humanList.get(j).getWeight();
                int heightL = humanList.get(j).getHeight();

                boolean checkWeight = weightR > weightL;
                boolean checkHeight = heightR > heightL;

                if (checkHeight && checkWeight) rank++;
            }
            System.out.printf("%d ", rank);
        }
    }
}
