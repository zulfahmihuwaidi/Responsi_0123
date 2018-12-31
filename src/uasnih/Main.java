// Muhammad Zulfahmi Huwaidi (17.83.0123)

package uasnih;

import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String p1 = "[a-zA-Z]{1,100}.[a-zA-Z]{1,100}";
		System.out.println(Pattern.matches(p1, "Zulfahmi Huwaidi"));
		String p2 = "[a-zA-Z]{1,100}.[a-zA-Z]{1,100}.[a-zA-Z0-9]{1,100}";
		System.out.println(Pattern.matches(p2, "Jl.Anggajaya 232"));
		String p3 = "[0-9]{4}.[0-9]{2}.[0-9]{2}";
		System.out.println(Pattern.matches(p3, "1998-12-07"));
		String p4 = "[0-9]{2}.[0-9]{3}.[0-9]{3}.[0-9]{3}";
		System.out.println(Pattern.matches(p4, "62-877-222-333"));
		
		if(p1=="[a-zA-Z]{1,100}.[a-zA-Z]{1,100}"){
			  System.out.println("Format Nama Benar");;
			}else if(p1!="[a-zA-Z]{1,100}.[a-zA-Z]{1,100}"){
			  System.err.println("Format Nama Salah");;
			}
	}

}
