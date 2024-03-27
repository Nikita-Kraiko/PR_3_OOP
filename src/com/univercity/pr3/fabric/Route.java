package com.univercity.pr3.fabric;

import java.util.Arrays;

public class Route {
    public String nameRoute;
    public int numStation;
    public double[] masDistance;
    public double time;
    public boolean difficulty;
    private static int counter = 0;

    public Route(String nameRoute, int numStation, double[] masDistance, double time, boolean difficulty) {
        this.nameRoute = nameRoute;
        this.numStation = numStation;
        this.masDistance = masDistance;
        this.time = time;
        this.difficulty = difficulty;
        counter = 0;
    }

    public Route(String nameRoute, int numStation, double[] masDistance) {
        this(nameRoute, numStation, masDistance, 2, true);
    }

    public Route(String nameRoute, int numStation) {
        this(nameRoute, numStation, new double[numStation]);
    }

    public double getDistance() {
        double totalDistance = 0;
        for (double d : masDistance) {
            totalDistance += d;
        }
        return totalDistance;
    }

    public boolean canTravelRoute(double speed, double breakInterval) {
        double timeTotal = getDistance() / speed;
        if (timeTotal <= breakInterval * numStation) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isShorter(Route route) {
        return this.getDistance() < route.getDistance();
    }

    @Override
    public String toString() {
        return "Route{" +
                "nameRoute='" + nameRoute + '\'' +
                ", numStation=" + numStation +
                ", masDistance=" + Arrays.toString(masDistance) +
                ", time=" + time +
                ", difficulty=" + difficulty +
                '}';
    }

    @Override
    protected void finalize() {
        System.out.println("counter value: " + counter);
    }

}
