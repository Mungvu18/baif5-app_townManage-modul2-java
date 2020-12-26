public class Town {
    Person person;
    private int peopleAmount;
    private String houseId;

    public Town(Person person, int peopleAmount, String houseId) {
        this.person = person;
        this.peopleAmount = peopleAmount;
        this.houseId = houseId;
    }
    public String getHouseId(){
        return houseId;
    }

    @Override
    public String toString() {
        return "Town{" + person +
                ", peopleAmount=" + peopleAmount +
                ", houseId='" + houseId + '\'' +
                '}';
    }
}
