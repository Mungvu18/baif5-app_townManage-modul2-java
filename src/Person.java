public class Person {
   private String name;
   private String birthDay;
   private String job;

    public Person(String name, String birthDay, String job) {
        this.name = name;
        this.birthDay = birthDay;
        this.job = job;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", job='" + job + '\'';
    }
}
