package tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

//import static org.junit.jupiterAssert.assertNull;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import org.junit.jupiter.api.Test;
import source.*;


class HashTableMapTest {
	@Test

	void test() {

		HashTableMap<Integer, String> mapa =

				new HashTableMap<Integer, String>();

		assertTrue(mapa.isEmpty());

		assertNull(mapa.put(5, "A"));

		assertEquals("{(5,A)}", ordenar(mapa.entrySet()));

		assertNull(mapa.put(7, "B"));

		assertEquals("{(5,A), (7,B)}", ordenar(mapa.entrySet()));

		assertNull(mapa.put(2, "C"));

		assertEquals("{(2,C), (5,A), (7,B)}", ordenar(mapa.entrySet()));

		assertNull(mapa.put(8, "D"));

		assertEquals("{(2,C), (5,A), (7,B), (8,D)}", ordenar(mapa.entrySet()));

		assertNotNull(mapa.put(2, "E"));

		assertEquals("{(2,E), (5,A), (7,B), (8,D)}", ordenar(mapa.entrySet()));

		assertEquals("B", mapa.get(7));

		assertEquals("{(2,E), (5,A), (7,B), (8,D)}", ordenar(mapa.entrySet()));

		assertNull(mapa.get(4));

		assertEquals("{(2,E), (5,A), (7,B), (8,D)}", ordenar(mapa.entrySet()));

		assertEquals("E", mapa.get(2));

		assertEquals("{(2,E), (5,A), (7,B), (8,D)}", ordenar(mapa.entrySet()));

		assertEquals(4, mapa.size());

		assertEquals("{(2,E), (5,A), (7,B), (8,D)}", ordenar(mapa.entrySet()));

		assertEquals("A", mapa.remove(5));

		assertEquals("{(2,E), (7,B), (8,D)}", ordenar(mapa.entrySet()));

		assertEquals("E", mapa.remove(2));

		assertEquals("{(7,B), (8,D)}", ordenar(mapa.entrySet()));

		assertNull(mapa.get(2));

		assertFalse(mapa.isEmpty());

		assertEquals("{(7,B), (8,D)}", ordenar(mapa.entrySet()));

		assertEquals("{7, 8}", ordenarKeys(mapa.keySet()));

		assertEquals("{(7,B), (8,D)}", ordenar(mapa.entrySet()));

		assertEquals("{B, D}", ordenarValues(mapa.values()));

		assertEquals("{(7,B), (8,D)}", ordenar(mapa.entrySet()));

	}

	private Object ordenarValues(Iterable<String> values) {

		String saida = "{";

		SortedListPriorityQueue<String, String> P =

				new SortedListPriorityQueue<String, String>();

		for (String ent : values) {
			P.insert(ent, ent);
		}

		Entry<String, String> e;

		while (!P.isEmpty()) {

			e = P.removeMin();

			saida += e.getKey() + ", ";

		}

		return saida.substring(0, saida.length() - 2) + "}";

	}

	private Object ordenarKeys(Iterable<Integer> keySet) {

		String saida = "{";

		SortedListPriorityQueue<Integer, Integer> P = new SortedListPriorityQueue<Integer, Integer>();

		for (Integer ent : keySet) {
			P.insert(ent, ent);
		}

		Entry<Integer, Integer> e;

		while (!P.isEmpty()) {

			e = P.removeMin();

			saida += e.getKey() + ", ";

		}

		return saida.substring(0, saida.length() - 2) + "}";

	}

	protected String ordenar(Iterable<Entry<Integer, String>> iterable) {

		String saida = "{";

		SortedListPriorityQueue<Integer, String> P = new SortedListPriorityQueue<Integer, String>();

		for (Entry<Integer, String> ent : iterable) {
			P.insert(ent.getKey(), ent.getValue());
		}

		Entry<Integer, String> e;

		while (!P.isEmpty()) {

			e = P.removeMin();

			saida += "(" + e.getKey() + "," + e.getValue() + "), ";

		}

		return saida.substring(0, saida.length() - 2) + "}";

	}
}
