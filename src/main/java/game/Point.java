package game;

import language.Reader;

public class Point {

    // Methods

    public int pointSwitch(int value) {

        int rafflePoint;

        switch (value) {
            case 2:
                rafflePoint = (+250);
                break;
            case 3:
                rafflePoint = (-100);
                break;
            case 4:
                rafflePoint = (+100);
                break;
            case 5:
                rafflePoint = (-20);
                break;
            case 6:
                rafflePoint = (+180);
                break;
            case 7:
                rafflePoint = (0);
                break;
            case 8:
                rafflePoint = (-70);
                break;
            case 9:
                rafflePoint = (+60);
                break;
            case 10:
                rafflePoint = (-80);
                break;
            case 11:
                rafflePoint = (-50);
                break;
            case 12:
                rafflePoint = (+650);
                break;
            default:
                rafflePoint = (-1);
                break;
        }

        return rafflePoint;
    }

    public String nameSwitch(int value) {

        String pointName;

        switch (value) {
            case 2:
                pointName = "field2name";
                break;
            case 3:
                pointName = Reader.print("field3name");
                break;
            case 4:
                pointName = Reader.print("field4name");
                break;
            case 5:
                pointName = Reader.print("field5name");
                break;
            case 6:
                pointName = Reader.print("field6name");
                break;
            case 7:
                pointName = Reader.print("field7name");
                break;
            case 8:
                pointName = Reader.print("field8name");
                break;
            case 9:
                pointName = Reader.print("field9name");
                break;
            case 10:
                pointName = Reader.print("field10name");
                break;
            case 11:
                pointName = Reader.print("field11name");
                break;
            case 12:
                pointName = Reader.print("field12name");
                break;
            default:
                pointName = "FEJL i nameswitch";
                break;
        }

        return pointName;

    }

}

