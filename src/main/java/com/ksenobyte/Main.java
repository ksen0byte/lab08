package com.ksenobyte;

import com.ksenobyte.matrix.AdjacencyMatrix;
import com.ksenobyte.matrix.IncidenceMatrix;

public class Main {
    public static void main(String[] args) {
        AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix();
        System.out.println(adjacencyMatrix.isTree());
        IncidenceMatrix incidenceMatrix = new IncidenceMatrix();
        System.out.println(incidenceMatrix.isTree());
    }
}
