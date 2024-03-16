import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Radyo implements Iterable<String> {

    private List<String> radyoListesi = new LinkedList<String>();

    public Radyo(String[] kanallar) {

        for (String kanal : kanallar) {
            radyoListesi.add(kanal);
        }

    }

    public class RadyoIterator implements Iterator<String> {
            private Integer index = 0;

            public boolean hasNext() {

                if (radyoListesi.size() < index) {
                    return false;
                }

                return true;

            }

            public String next() {

                String kanal = radyoListesi.get(index);
                index++;
                return kanal;

            }
    }

    // @Override
    // public Iterator<String> iterator() {
    // return radyoListesi.iterator();

    // }

    @Override
    public Iterator<String> iterator() {
        return new RadyoIterator();
    }

}