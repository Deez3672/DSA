import java.util.LinkedList;
import java.util.Collection;

class CollectionPractice1{
    public static void main(String[] args){
        Collection<Integer> c = new LinkedList<>();
        
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
        c.remove(Integer.valueOf(40));
        
        System.out.println(c.isEmpty());
        
        System.out.println(c.size());
        
        int elementToCheck = 30;
        System.out.println(c.contains(elementToCheck));

        System.out.println(c);
    }
}