package com.mycompany.gameconsolereport;

public class GameConsoleReport {

    public static void main(String[] args) {

        String[] Provinces = {"Cape Town", "Port Elizabeth", "Pretoria"};
        int[] PS5 = {1000, 2000, 1500};
        int[] XBOX = {2000, 3000, 1100};
        int[] SWITCH = {3000, 4000, 1200};

        System.out.println("---------------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------------------------------------");

        // Correct table header
        System.out.printf("%-20s %-10s %-10s %-10s%n", "CITY", "PS5", "XBOX", "SWITCH");
        System.out.println("---------------------------------------------------------------------");

        // Print sales data
        for (int i = 0; i < Provinces.length; i++) {
            System.out.printf("%-20s %-10d %-10d %-10d%n",
                    Provinces[i], PS5[i], XBOX[i], SWITCH[i]);
        }

        System.out.println("---------------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------------------------------------");

        int maxSales = 0;
        String topCity = "";

        // Calculate totals and find top city
        for (int i = 0; i < Provinces.length; i++) {
            int total = PS5[i] + XBOX[i] + SWITCH[i];
            System.out.printf("%-20s %d%n", Provinces[i], total);

            if (total > maxSales) {
                maxSales = total;
                topCity = Provinces[i];
            }
        }

        System.out.println("---------------------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("---------------------------------------------------------------------");
    }
}
