package ss12_tree_map.thuc_hanh;


import ss5_AccessModifier_Staticmethod.student_manager.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        Map<Student,Integer > map = new HashMap<>();
        map.put(new Student(11,"Dung","DB",true,"abc.vn"),13);
        map.put(new Student(11,"Dun","DB",true,"abc.vn"),11);
        map.put(new Student(13,"Du","DB",true,"abc.vn"),13);
        map.put(new Student(14,"D","DB",true,"abc.vn"),13);
        Set<Student> listKey = map.keySet();
        for (Student  s: listKey){
            System.out.println(s);
        }
    }
}
