package megasena;

import java.util.Iterator;
import java.util.Random;

public class Sorteador implements Iterable<Integer> {

	@Override
	public Iterator<Integer> iterator() {
//		System.out.println("RETORNANDO UM ITERATOR");
		return new SorteadorIterator();
	}
}
