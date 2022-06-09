package string;

public class SB {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("abc");
		String string=sb.reverse().toString();
		sb.reverse().append('$').append(string);
		System.out.println(sb);

	}

}
