package com.java8feactures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Product> list=new ArrayList<Product>();
	
	list.add(new Product(1,"HP",25000f));
	list.add(new Product(2,"Dell",30000f));
	list.add(new Product(3,"Lenova",35000f));
	list.add(new Product(4,"sony",45000f));
	
	List<Float> products=list.stream().filter(p->p.price>30000).map(Product::getPrice).collect(Collectors.toList());


System.out.println(products);

Map<Integer, String> productInMap=list.stream().collect(Collectors.toMap(p->p.id, p->p.name));

System.out.println(productInMap);

long count=list.stream().filter(p->p.price>30000).count();

System.out.println(count);

Product product=list.stream().max((P1,P2)->P1.price>P2.price?1:-1).get();
System.out.println(product.price);

System.out.println("********************************");

float toatalprice=list.stream().filter(p->p.price>30000f).map(p->p.price).reduce(0.0f,Float::sum);
System.out.println(toatalprice);

Product p=list.stream().max((P1,P2)->P1.getPrice()>P2.getPrice()?1:-1).get();

System.out.println(p.toString());

System.out.println("---------------------------------------------------------------------------");

Double id=list.stream().collect(Collectors.averagingInt(Product::getId));
System.out.println(id);

   list.stream().sorted(Comparator.comparing(Product::getId).reversed()).forEach(p1->System.out.println(p1));
  
	}
}
