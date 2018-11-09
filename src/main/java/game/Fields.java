package game;

public class Fields {

    /*
    ----------- Fields -----------
    */

    private static String fieldName, fieldDescription;
    private static int fieldPoint;

    /*
    -------- Public Methods -------
    */
    /**
     * This method sets the matching name and description for the field matching the value of a cupRoll.
     */

    public static void fieldsSwitch (int cupRoll) {

        switch (cupRoll) {
            case 2:
                fieldName = "field2name";
                fieldDescription = "field2description";
                fieldPoint = (+250);
                break;
            case 3:
                fieldName = "field3name";
                fieldDescription = "field3description";
                fieldPoint = (-100);
                break;
            case 4:
                fieldName = "field4name";
                fieldDescription = "field4description";
                fieldPoint = (+100);
                break;
            case 5:
                fieldName = "field5name";
                fieldDescription = "field5description";
                fieldPoint = (-20);
                break;
            case 6:
                fieldName = "field6name";
                fieldDescription = "field6description";
                fieldPoint= (+180);
                break;
            case 7:
                fieldName = "field7name";
                fieldDescription = "field7description";
                fieldPoint= (0);
                break;
            case 8:
                fieldName = "field8name";
                fieldDescription = "field8description";
                fieldPoint = (-70);
                break;
            case 9:
                fieldName = "field9name";
                fieldDescription = "field9description";
                fieldPoint = (+60);
                break;
            case 10:
                fieldName = "field10name";
                fieldDescription = "field10description";
                fieldPoint = (-80);
                break;
            case 11:
                fieldName = "field11name";
                fieldDescription = "field11description";
                fieldPoint = (-50);
                break;
            case 12:
                fieldName = "field12name";
                fieldDescription = "field12description";
                fieldPoint= (+650);
                break;
            default:
                fieldName = "fielddefaultname";
                fieldDescription = "fielddefaultdescription";
                fieldPoint = (0);
                break;
        }

    }

    /*
    --------- Variables accessible ----
     */

    public static String getFieldName() {return fieldName;}

    public static void setFieldName(String fieldName) {Fields.fieldName = fieldName;}

    public static String getFieldDescription() {return fieldDescription;}

    public static void setFieldDescription(String fieldDescription) {Fields.fieldDescription = fieldDescription;}

    public static int getFieldPoint() {return fieldPoint;}

    public static void setFieldPoint(int fieldPoint) {Fields.fieldPoint = fieldPoint;}
}

