public class Point {

    // Fields

    private int rafflePoint;
    private String pointName;


    // Constructor

    public void pointSwith(int value) {

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


    //Variables accessible

    public int getRafflePoint () {return rafflePoint;}
    public void setRafflePoint ( int rafflePoint){this.rafflePoint = rafflePoint;}

    public String getPointName () {return pointName;}
    public void setPointName (String pointName){this.pointName = pointName;}

}

