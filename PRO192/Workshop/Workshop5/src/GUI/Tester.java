package GUI;

import DTO.BeeColony;
import DTO.Colony;
import DTO.FPTUniversity;
import DTO.Role;
import DTO.University;

public class Tester {

    public static void main(String[] args) {
        Colony obj1 = new BeeColony(100, "land", "honey");
        System.out.println(obj1);
        obj1.grow();
        obj1.reproduce();
        System.out.println();

        University obj2 = new FPTUniversity(1000, "FUQN", "Quy Nhon");
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();
        System.out.println();

        Role df = new BeeColony(5000, "ocean", "honey");
        System.out.println(df);
        df.createWorker();
        System.out.println();

        df = new FPTUniversity(1000, "FUQN", "Quy Nhon");
        System.out.println(df);
    }
}
