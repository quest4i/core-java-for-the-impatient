package ch02.sec02.sec06;

/**
 * Created on 2016. 9. 11. 오후 2:02.
 *
 * @author samyeong-gu
 */
public class NetworkDemo {

    public static void main(String[] args) {

        Network myFace = new Network();
        Network tooter = new Network();
        Network.Member fred = myFace.enroll("Fred");
        Network.Member wilma = myFace.enroll("Wilma");

        fred.addFriend(wilma);

        Network.Member barney  = tooter.enroll("Barney");
        fred.addFriend(barney);
        System.out.println(myFace);
        System.out.println(barney.belongsTo(myFace));
    }
}
