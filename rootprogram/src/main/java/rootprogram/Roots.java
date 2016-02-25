package rootprogram;


public class Roots {
	double root_one,root_two;
	int num_roots;
	public Roots(double a, double b, double c){
		double q;
		double r;
		//Apply the textbook quadratic formula:
		//Roots =-b +-sqrt(b^2-4ac)/2a
		q=b*b-4*a*c;
		if(q>0&&a!=0) {
			// b^2>4ac, there are two distinct roots
			num_roots = 2;
			r =(double) Math.sqrt(q);
			root_one = ((0-b) + r)/(2*a);
			root_two = ((0-b) - r)/(2*a);
	}else if (q==0) {//(BUG HERE)
		// THe equation has exactly one root
		num_roots = 1;
		root_one = (0-b)/(2*a);
		root_two = root_one;
	}else{
		// The equation has no roots is b^2 <4ac
		num_roots = 0;
		root_one = -1;
		root_two = -1;
	}
}
public int num_roots() {return num_roots;}
public double first_root() {return root_one;}
public double second_root() {return root_two;}

	

}

