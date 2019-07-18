import java.util.Scanner;

public class 密码 {
	public 密码(String password) {
		String regp = ".*[A-Z].*";
		String rego = ".*[a-z].*";
		String regq = ".*\\d.*";
		String regs = ".*[\\`\\-\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\_\\+\\=\\[\\{\\}\\]\\;\\:\\,\\.\\<\\>\\/\\?].*";
		String regex = "^[a-zA-Z\\d\\`\\-\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\_\\+\\=\\[\\{\\}\\]\\;\\:\\,\\.\\<\\>\\/\\?]{6,}$";
		String result = "";
		if (password.length() < 6) {
			result += "\t\t-至少包含六位字符. 你的密码只有 " + password.length() + " 位长.\n";
		}
		if (!password.matches(regp)) {
			result += "\t\t-至少包含一个大写字母.\n";
		}
		if (!password.matches(rego)) {
			result += "\t\t-至少包含一个小写字母.\n";
		}
		if (!password.matches(regq)) {
			result += "\t\t-至少包含一个数字.\n";
		}
		if (!password.matches(regs)) {
			result += "\t\t-至少包含一个特殊字符:	`!@#$%^&*()_+=[{}];:,.<>/?\n";
		} else if (!password.matches(regex)) {
			result += "\t\t-包含无效字符. 特殊字符:	`!@#$%^&*()_+=[{}];:,.<>/?\n";
		}
		if (!"".equals(result)) {
			System.out.println("你的密码必须:\n" + result);
			System.out.println("请重新输入一个密码：");
			String a=new Scanner(System.in).next();
			密码 in=new 密码(a);
		} else {
			System.out.println("你的密码是: " + password);
			
		}
		System.out.println();
	}
}
