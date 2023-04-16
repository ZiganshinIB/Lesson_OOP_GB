package seminar2.ExS.schollers.base;

public abstract class Schoolboy {
    private String fullName;
    private Integer classNumber;

    protected Schoolboy(String fullName, Integer classNumber) {
        this.fullName = fullName;
        this.classNumber = classNumber;
    }
    public abstract void study();

    public String getFullName() {
        return fullName;
    }

    public Integer getClassNumber() {
        return classNumber;
    }

    protected void upClass(){
        this.classNumber++;
    }


}
