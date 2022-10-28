package source;

public class Main {

	public static void main(String[] args) {
		
		
		SortedListPriorityQueue<Integer, String> teste = new SortedListPriorityQueue<>();
		
		HashTableMap<Integer, String> teste2 = new HashTableMap<>(); 
		
		
		System.out.println("---------------------");
		System.out.println("Insert");
		System.out.println(teste.toString());
		System.out.println(teste.insert(5,"A"));
		System.out.println(teste.toString());
		System.out.println(teste.insert(9,"C"));
		System.out.println(teste.toString());
		System.out.println(teste.insert(3,"B"));
		System.out.println(teste.toString());
		System.out.println(teste.insert(7,"D"));
		System.out.println(teste.toString());
		System.out.println("---------------------");
		
		System.out.println("---------------------");
		System.out.println("Min()");
		System.out.println(teste.min());
		System.out.println(teste.removeMin());
		System.out.println(teste.toString());
		System.out.println("---------------------");
		
		System.out.println("---------------------");
		System.out.println("size()");
		System.out.println(teste.size());
		System.out.println("---------------------");
		
		System.out.println("---------------------");
		System.out.println("removeMin()");
		System.out.println(teste.removeMin());
		System.out.println(teste.removeMin());
		System.out.println(teste.removeMin());
		System.out.println(teste.toString());
		System.out.println("---------------------");
		
		System.out.println("---------------------");
		System.out.println("isEmpty()");
		System.out.println(teste2.isEmpty());
		System.out.println("---------------------");
		
		System.out.println("---------------------");
		System.out.println("put()");
		System.out.println(teste2.put(5,"A"));
		System.out.println(teste2.put(7,"B"));
		System.out.println(teste2.put(2,"C"));
		System.out.println(teste2.put(8,"D"));
		System.out.println(teste2.put(2,"E"));
		System.out.println("---------------------");
		
		System.out.println("---------------------");
		System.out.println("get()");
		System.out.println(teste2.get(7));
		System.out.println(teste2.get(4));
		System.out.println(teste2.get(2));
		System.out.println("---------------------");
		
		System.out.println("---------------------");
		System.out.println("size");
		System.out.println(teste2.size());
		System.out.println("---------------------");
		
		System.out.println("---------------------");
		System.out.println("remove()");
		System.out.println(teste2.remove(5));
		System.out.println(teste2.remove(2));
		System.out.println("---------------------");
		
		System.out.println("---------------------");
		System.out.println("get()");
		System.out.println(teste2.get(2));
		System.out.println("---------------------");
		
		System.out.println("---------------------");
		System.out.println("isEmpty()");
		System.out.println(teste2.isEmpty());
		System.out.println("---------------------");
		
		System.out.println("---------------------");
		System.out.println("entrySet()");
		System.out.println(teste2.entrySet());
		System.out.println("---------------------");
		
		System.out.println("---------------------");
		System.out.println("keySet()");
		System.out.println(teste2.keySet());
		System.out.println("---------------------");
		
		System.out.println("---------------------");
		System.out.println("values()");
		System.out.println(teste2.values());
		


	}

}
