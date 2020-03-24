import java.util.ArrayList;

public class Demo {

    static ArrayList<UserModel> users = new ArrayList<>();

    public Demo(){

        UserModel user1 = new UserModel((long)1,  "Munmro","Saltmarshe", 1999,"msaltmarshe0@booking.com",2,2,2, "Computer Science", 215147980, 10, "Rq5HKTG");
        UserModel user2 = new UserModel((long)2,  "Jan", "Kowalski", 1997, "jankowalski@gmail.com", 2, 2, 2, "Design", 734599422,12, "123");
        UserModel user3 = new UserModel((long)3,  "Jan", "Kowalski", 1995, "jankowalski@gmail.com", 2, 2, 2, "Design", 734599422,11, "a");
        UserModel user4 = new UserModel((long)4,  "Jan", "Kowalski", 2001, "jankowalski@gmail.com", 2, 2, 2, "Design", 734599422,7, "erere");
        UserModel user5 = new UserModel((long)5,  "Jan", "Kowalski", 1998, "jankowalski@gmail.com", 2, 2, 2, "Design", 734599422,2, "testtt");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }

    public static String getPassword(int id) {

        int i = id-1;
        String password = users.get(i).getPassword();
        return password;

    }

    public static double getPoints(int id) {
        int i = id-1;
        double points = users.get(i).getPoints();
        System.out.println(points);
        return points;
    }

    public static ArrayList<Long> getAllIds(){
        ArrayList<Long> allIds = new ArrayList<>();
        for(int i=0; i<5; i++){
            allIds.add(users.get(i).getIdStudent());
        }
        return allIds;
    }

    public static void setPoints(long id, double points){
        users.get((int)(id-1)).setPoints(points);
    }

}