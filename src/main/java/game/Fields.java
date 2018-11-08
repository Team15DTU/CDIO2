package game;

public class Fields {

    /*
    ----------- Fields -----------
    */

    private static String fieldName, fieldDescription;

    /*
    -------- Public Methods -------
    */

    public static void fieldsSwitch (int cupRoll) {

        switch (cupRoll) {
            case 2:
                fieldName = "field2name";
                fieldDescription = "field2description";
                break;
            case 3:
                fieldName = "field3name";
                fieldDescription = "field3description";
                break;
            case 4:
                fieldName = "field4name";
                fieldDescription = "field4description";
                break;
            case 5:
                fieldName = "field5name";
                fieldDescription = "field5description";
                break;
            case 6:
                fieldName = "field6name";
                fieldDescription = "field6description";
                break;
            case 7:
                fieldName = "field7name";
                fieldDescription = "field7description";
                break;
            case 8:
                fieldName = "field8name";
                fieldDescription = "field8description";
                break;
            case 9:
                fieldName = "field9name";
                fieldDescription = "field9description";
                break;
            case 10:
                fieldName = "field10name";
                fieldDescription = "field10description";
                break;
            case 11:
                fieldName = "field11name";
                fieldDescription = "field11description";
                break;
            case 12:
                fieldName = "field12name";
                fieldDescription = "field12description";
                break;
            default:
                fieldName = "fielddefaultname";
                fieldDescription = "fielddefaultdescription";
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

}

