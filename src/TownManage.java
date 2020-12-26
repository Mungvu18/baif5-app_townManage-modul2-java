
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TownManage {
    public static final String NOT_FOUND = "Not found!";
    public static final String NAME = "Name ";
    public static final String WITH_AGE_IS = " with age is: ";
    public static final String DD_MM_YYYY = "dd/MM/yyyy";
    ArrayList<Town> arrayList = new ArrayList<>();

    public void addNew(Town town) {
        arrayList.add(town);
    }

    public void displayByHouse(String houseId) {
        boolean testHouseId = false;
        for (int i = 0; i < arrayList.size(); i++) {
            String houseId1 = arrayList.get(i).getHouseId();
            testHouseId = houseId1.equalsIgnoreCase(houseId);
            if (testHouseId) {
                System.out.println(arrayList.get(i));
            }
        }
        if (!testHouseId) {
            System.err.println(NOT_FOUND);
        }
    }
    public void displayPersonByAgeGreat80(){
        boolean testAge = false;
        for (int i = 0; i < arrayList.size(); i++) {
            Town town = arrayList.get(i);
            Person person = town.person;
            String birthDay = person.getBirthDay();
            int age = getAge(birthDay);
            testAge = age > 80;
            if(testAge){
                System.out.println(NAME + person.getName()+ WITH_AGE_IS + age);
                System.out.println(town);
            }
        }
        if (!testAge){
            System.out.println(NOT_FOUND);
        }
    }

    public int getAge(String birthDay) {
        int age = 0;
        SimpleDateFormat format = new SimpleDateFormat(DD_MM_YYYY);
        Date timePresent = null;
        Date dayBorn = null;
        try {
            dayBorn = format.parse(birthDay);
            timePresent = new java.util.Date();
            long diff = timePresent.getTime() - dayBorn.getTime();
            double day = diff / (24 * 60 * 60 * 1000);
            double year = day / 365;
            age = (int) (year);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return age;
    }
}
