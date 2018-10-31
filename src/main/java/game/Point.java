package game;

public class Point {

    // Fields

    private int rafflePoint;
    private String pointName;


    // Constructor

    public void pointSwitch(int value) {

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
                break;
        }
    }

    public void nameSwitch(int value) {

        switch (value) {
            case 2:
                pointName = "Tower";
                break;
            case 3:
                pointName = "Crater";
                break;
            case 4:
                pointName = "Palace Gates";
                break;
            case 5:
                pointName = "Cold Desert";
                break;
            case 6:
                pointName = "Walled City";
                break;
            case 7:
                pointName = "Monastery";
                break;
            case 8:
                pointName = "Black Cave";
                break;
            case 9:
                pointName = "Huts In The Mountain";
                break;
            case 10:
                pointName = "The Werewall";
                break;
            case 11:
                pointName = "The Pit";
                break;
            case 12:
                pointName = "Goldmine";
                break;
            default:
                break;
        }
    }


    //Variables accessible

    public int getRafflePoint () {return rafflePoint;}
    // public void setRafflePoint ( int rafflePoint){this.rafflePoint = rafflePoint;}

    public String getPointName () {return pointName;}
    // public void setPointName (String pointName){this.pointName = pointName;}

}

