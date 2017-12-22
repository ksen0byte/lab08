package com.ksenobyte.matrix;

import java.util.HashMap;
import java.util.Map;

public class IncidenceMatrix {
    private int[][] arr;

    public IncidenceMatrix() {
        arr = new int[][]{
                {1, 1, 0, 0},
                {1, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 1, 0, 0},
        };
    }

    public boolean isTree() {
        Map<Integer, Integer> nodesWithCounter = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[j][i] == 1) {
                    nodesWithCounter.put(j, nodesWithCounter.getOrDefault(j, 0) + 1);
                }
            }
        }
        Integer edgesNumber = nodesWithCounter.values().stream().reduce((i1, i2) -> i1 + i2 / 2).get();
        boolean isConnected = nodesWithCounter.keySet().size() == arr.length;
        return edgesNumber.equals(arr.length - 1) && isConnected;
    }

}
