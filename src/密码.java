import java.util.Scanner;

public class ���� {
	public ����(String password) {
		String regp = ".*[A-Z].*";
		String rego = ".*[a-z].*";
		String regq = ".*\\d.*";
		String regs = ".*[\\`\\-\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\_\\+\\=\\[\\{\\}\\]\\;\\:\\,\\.\\<\\>\\/\\?].*";
		String regex = "^[a-zA-Z\\d\\`\\-\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\_\\+\\=\\[\\{\\}\\]\\;\\:\\,\\.\\<\\>\\/\\?]{6,}$";
		String result = "";
		if (password.length() < 6) {
			result += "\t\t-���ٰ�����λ�ַ�. �������ֻ�� " + password.length() + " λ��.\n";
		}
		if (!password.matches(regp)) {
			result += "\t\t-���ٰ���һ����д��ĸ.\n";
		}
		if (!password.matches(rego)) {
			result += "\t\t-���ٰ���һ��Сд��ĸ.\n";
		}
		if (!password.matches(regq)) {
			result += "\t\t-���ٰ���һ������.\n";
		}
		if (!password.matches(regs)) {
			result += "\t\t-���ٰ���һ�������ַ�:	`!@#$%^&*()_+=[{}];:,.<>/?\n";
		} else if (!password.matches(regex)) {
			result += "\t\t-������Ч�ַ�. �����ַ�:	`!@#$%^&*()_+=[{}];:,.<>/?\n";
		}
		if (!"".equals(result)) {
			System.out.println("����������:\n" + result);
			System.out.println("����������һ�����룺");
			String a=new Scanner(System.in).next();
			���� in=new ����(a);
		} else {
			System.out.println("���������: " + password);
			
		}
		System.out.println();
	}
}
