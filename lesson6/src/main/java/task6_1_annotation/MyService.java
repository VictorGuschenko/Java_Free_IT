package task6_1_annotation;

import java.util.Objects;


@Version(version = "9.1")
public class MyService {
    private int varInt;
    private String varString;

    public MyService() {
    }

    private void thisClassInfo() {
        System.out.println("Information about class: " + MyService.class);
    }

    public int getVarInt() {
        return varInt;
    }

    public void setVarInt(int varInt) {
        this.varInt = varInt;
    }

    public String getVarString() {
        return varString;
    }

    public void setVarString(String varString) {
        this.varString = varString;
    }

    @Override
    public String toString() {
        return "task6_1_annotation.MyService{" +
                "varInt=" + varInt +
                ", varString='" + varString + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return varInt == myService.varInt && Objects.equals(varString, myService.varString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(varInt, varString);
    }
}
