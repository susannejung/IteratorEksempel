import java.util.*;

public class Main {

    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Programmering");
        ll.add("Systemudvikling");
        ll.add("Java");
        ll.add("Python");
        ll.add("Node.js");


        Iterator<String> it=ll.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        System.out.println();
        it= ll.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        System.out.println("Iterator baglæns");
        Iterator it1= ll.descendingIterator();
        while(it1.hasNext())
            System.out.println(it1.next());


        System.out.println("Listiterator");
        ListIterator lit=ll.listIterator();
        while(lit.hasNext())
            System.out.println(lit.next());

        System.out.println("Listiterator baglæns");
        lit=ll.listIterator(ll.size());
        while(lit.hasPrevious())
            System.out.println(lit.previous());



        System.out.println("Listiterator remove element");
        lit=ll.listIterator();
        while(lit.hasNext()){
            if(lit.next()=="Systemudvikling")
                lit.remove();
        }
        lit=ll.listIterator();
        while(lit.hasNext())
            System.out.println(lit.next());


        System.out.println("Indsætte element");
        lit=ll.listIterator();
        lit.add("Systemudvikling");
        lit=ll.listIterator();
        while(lit.hasNext())
            System.out.println(lit.next());





        /*System.out.println(ll.get(4));

        System.out.print("Udskriv med for-løkke: ");
        for(int i=0; i<ll.size();i++)
            System.out.print(ll.get(i)+" ");
        System.out.println();

        System.out.print("Udskriv med while-løkke: ");
        int index=0;
        while(index<ll.size()){
            System.out.print(ll.get(index)+" ");
            index++;
        }
        System.out.println();

        System.out.print("Udskriv med for-løkke: ");
        for(String element: ll)
            System.out.print(element+" ");
        System.out.println();

        System.out.print("Udskriv med iterator: ");
        Iterator<String> itr=ll.iterator();
        while(itr.hasNext())
            System.out.print(itr.next()+" ");
        System.out.println();

        System.out.print("Udskriv med forEach: ");
        ll.forEach(element -> System.out.print(element+" "));
        System.out.println();

        ll.add(1,"Dart");

        System.out.print("Udskriv med forEach: ");
        ll.forEach(element -> System.out.print(element+" "));
        System.out.println();

        ll.remove(1);

        System.out.print("Udskriv med forEach: ");
        ll.forEach(element -> System.out.print(element+" "));
        System.out.println();

        ll.sort(null);
        System.out.print("Hej");
        ll.forEach(element -> System.out.print(element+" "));
        System.out.println();

        Collections.sort(ll, Collections.reverseOrder());
        System.out.print("Hej1");
        ll.forEach(element -> System.out.print(element+" "));
        System.out.println();*/

    }
}
