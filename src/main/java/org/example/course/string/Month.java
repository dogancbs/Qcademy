package org.example.course.string;

public class Month {
    public static void main(String[] args) {
        String month = monthAsString("06.09.2098");

        System.out.println("Name of the month is: " + month);

    }

    public static String monthAsString(String date) {
        String month = date.substring(3, 5);

        switch (month) {
            case "01":
                return "January";
            case "02":
                return "February";
            case "03":
                return "March";
            case "04":
                return "April";
            case "05":
                return "May";
            case "06":
                return "June";
            case "07":
                return "July";
            case "08":
                return "August";
            case "09":
                return "September";
            case "10":
                return "October";
            case "11":
                return "November";
            case "12":
                return "December";
            default:
                return "Wrong Month";
        }
    }
}
