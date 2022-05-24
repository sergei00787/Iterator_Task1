package netology.patterns;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RIterator();
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public class RIterator implements Iterator<Integer> {
        private final Random random = new Random();

        public RIterator() {

        }

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt((getMax() - getMin()) + 1) + getMin();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove not supported");
        }


    }

}
