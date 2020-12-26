import java.util.Scanner;

public class MainTest {
    public static final String ENTER_AMOUNT_PERSON_WANT_ADD = "Nhập số lượng người bạn muốn thêm";
    public static final String ADD_TOWN = "1. Thêm khu phố ";
    public static final String DISPLAY_ALL = "2. Hiển thị khu phố ";
    public static final String FIND_PERSON_AGE_GRATE_80 = "3. Tìm kiếm người trên 80 tuổi.";
    public static final String DISPLAY_BY_HOUSE_ID = "4. Hiển thị danh sách hộ gia đình";
    public static final String EXIT_APP = "0.Thoát trương trình";
    public static final String ENTER_CHOICE = "Nhập lựa trọn của bạn ";
    public static final String ENTER_NAME_WANT_ADD = "Nhập tên người bạn muốn thêm ";
    public static final String ENTER_BIRTHdAY = "Nhập ngày sinh ";
    public static final String ENTER_JOB = "Nhập nghề nghiệp ";
    public static final String ENTER_AMOUNT_PERSON_INTO_FAMILY = "Nhập số lượng thành viên trong gia đình";
    public static final String ENTER_HOUSE_ID = "Nhập địa chỉ nhà ";
    static TownManage townManage = new TownManage();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            menuShow();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println(ENTER_AMOUNT_PERSON_WANT_ADD);
                    int number = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < number; i++) {
                        addNewTown();
                    }
                    break;
                case 2:
                    System.out.println(townManage.arrayList);
                    break;
                case 3:
                    townManage.displayPersonByAgeGreat80();
                    break;
                case 4:
                    displayByHouseId();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (choice != 0);
    }

    private static void menuShow() {
        System.out.println(ADD_TOWN);
        System.out.println(DISPLAY_ALL);
        System.out.println(FIND_PERSON_AGE_GRATE_80);
        System.out.println(DISPLAY_BY_HOUSE_ID);
        System.out.println(EXIT_APP);
        System.out.println(ENTER_CHOICE);
    }
    private static void addNewTown(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println(ENTER_NAME_WANT_ADD);
        String name = sc.nextLine();
        System.out.println(ENTER_BIRTHdAY);
        String birthDay = sc1.nextLine();
        System.out.println(ENTER_JOB);
        String job = sc.nextLine();
        System.out.println(ENTER_AMOUNT_PERSON_INTO_FAMILY);
        int amountPerson =Integer.parseInt(sc1.nextLine());
        System.out.println(ENTER_HOUSE_ID);
        String houseId = sc.nextLine();
        Person person = new Person(name,birthDay,job);
        Town town = new Town(person,amountPerson,houseId);
        townManage.addNew(town);
    }
    public static void displayByHouseId(){
        System.out.println(ENTER_HOUSE_ID);
        String houseId = sc.nextLine();
        townManage.displayByHouse(houseId);
    }
}