package generics;

public class GenericsDemo {
	public static void main(String[] args) {
		//Account<String> acc = new Account<String>();
		//acc.setObj("sbi account");
		//System.out.println(acc.getObj());

		Account<Integer> gpayAccount = new Account<>();
		gpayAccount.setObj(94545658);
		System.out.println("gpay account no is "+ gpayAccount.getObj());
		
		Account <Float> phonePeAccount = new Account<>();
		phonePeAccount.setObj(3.14f);
		System.out.println("phonepay account no is "+ phonePeAccount.getObj());
	}

	}




