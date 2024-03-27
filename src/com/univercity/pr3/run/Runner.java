package com.univercity.pr3.run;

import com.univercity.pr3.fabric.Route;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] distances = {10.5, 5.2, 8.0};
        Route route1 = new Route("Route1", 3,distances,4,true);
        Route route2 = new Route("Route2",2,distances);
        Route route3 = new Route("Route3",5);

        System.out.println(route1);
        System.out.println("Total distance: " + route1.getDistance());
        System.out.print("Enter speed: ");
        double speed = scanner.nextDouble();
        System.out.print("Enter break time: ");
        double breakTime = scanner.nextDouble();
        System.out.println("Is it real to travel at " + speed + "km/h with a break every "
                + breakTime + "hour: " + route1.canTravelRoute(speed,breakTime));
        System.out.println("Is Route2 shorter than Route1: " + route2.isShorter(route1));

    }
}
