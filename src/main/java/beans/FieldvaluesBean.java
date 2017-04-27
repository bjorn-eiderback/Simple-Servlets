package beans;

public class FieldvaluesBean {
    String fieldValue1;
    String fieldValue2;

    public FieldvaluesBean() {
        setFieldValue1("");
        setFieldValue2("");
    }

    public String getFieldValue1() {
        return fieldValue1;
    }

    public void setFieldValue1(String fieldValue1) {
        this.fieldValue1 = fieldValue1;
    }

    public String getFieldValue2() {
        return fieldValue2;
    }

    public void setFieldValue2(String fieldValue2) {
        this.fieldValue2 = fieldValue2;
    }

    public String getKombo() {
        return valueOrEmptyString(getFieldValue1()) + " kombinerad med " + valueOrEmptyString(getFieldValue2());
    }

    public boolean isValuesAssigned() {
        return hasValue(getFieldValue1()) && hasValue(getFieldValue2());
    }

    private boolean hasValue(String value) {
        return value != null && !value.trim().isEmpty();
    }

    private String valueOrEmptyString(String value) {
        return value == null ? "":value;
    }
}
