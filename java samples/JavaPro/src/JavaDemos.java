import java.util.ArrayList;
public class JavaDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		System.out.println( "before adding data : size of al is -> "+al.size());
		al.add("Srikumar");
		al.add("Krishna Iyer");
		System.out.println("after adding data, "+ al+"\n"+ "size of al is -> "+al.size()+"\n"+"ref of al is => "+al.hashCode());
		System.out.println("overloading al!!!!");
		al.add("Sachin");
		al.add("Smith");
		al.add("Pat Cummins");
		al.add("Brian Lara");
		al.add("Kieron Pollard");
		al.add("Nathan Lyon");
		al.add("Kangana Ranaut");
		System.out.println("size of al is -> "+al.size()+"\n"+"ref of al is => "+al.hashCode());
		al.add("Anurag Kashyap");
		System.out.println("after onverloading al with data, "+ al+"\n"+ "size of al is -> "+al.size()+"\n"+"ref of al is => "+al.hashCode());
		
		
	}

}
