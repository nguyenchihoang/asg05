package nguyenchihoang;


public class testasg05 {
public static void main(String[] args){
		
		
		Employee newbie=new Employee("newbie","12/10/1993",1000000);
		Manager boss =new Manager("Boss","2/03/1986",4000000);
		Manager biggerBoss=new Manager("Bigboos","3/12/1969",10000000,boss);
		
		System.out.println(newbie);
		System.out.println(boss);
		System.out.println(biggerBoss);
		
		Person per[] = new Person[3];
		per[0]= newbie;
		per[1]=boss;
		per[2]=biggerBoss;
		
		for(int i=0;i<3;i++){
			System.out.print(per[i]);
		}
		System.out.println("/n");
		

	}
}
